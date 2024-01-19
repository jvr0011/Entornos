/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entornos;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.sql.Statement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Medac
 */
public class Cconexion  {
    
    Connection conBD;   
        
    //final String cadenaConexion="jdbc:mariadb://192.168.1.224:3306/SmartOcupation";
    
    private String cadenaConexion;
    private String usuario;
    private String contrasenya;
    
    final String CONSULTA_SELECT=" SELECT * FROM TABLA ;";

    public Cconexion(String cadenaConexion, String usuario, String contrasenya) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }
    
    public boolean testConexion()
    {
         boolean resultado=false;
        
        try 
        {
            
            conBD = DriverManager.getConnection(cadenaConexion,usuario, contrasenya);
            resultado=true;
            
        } catch (SQLException error) {
            
            System.out.println("Error al conectar con el servidor MariaDB: " + error.getMessage());
        }
        finally{
            
            try {
                conBD.close();
            } catch (SQLException ex) {
                Logger.getLogger(Cconexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return resultado;
        
    }
    
    
    public boolean insertaDato(String dato)
    {
        System.out.println(dato);
        boolean resultado=false;
        
        try 
        {
            
            conBD = DriverManager.getConnection(cadenaConexion,usuario, contrasenya);
            Statement consulta=conBD.createStatement();
            consulta.execute(dato);
            resultado=true;
            
        } catch (SQLException error) {
            
            System.out.println("Error al conectar con el servidor MariaDB: " + error.getMessage());
        }
        finally{
            
            try {
                conBD.close();
            } catch (SQLException ex) {
                Logger.getLogger(Cconexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return resultado;
        
    }
    
    
    public ArrayList<Object> getObjeto(Object obj, String tabla) throws SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException
    {
        Class claseObjeto = obj.getClass();
        
        ArrayList<Object > objetos = new ArrayList<>();
        
        Annotation[] anotaciones = obj.getClass().getAnnotations();
        
        for(Annotation a : anotaciones)
        {
            System.out.println(a);
        }
        
        ResultSet resultado = ejecutaSelect(tabla);
                
        Field[] fields = obj.getClass().getDeclaredFields();
        
        System.out.println("Campos leidos: " + fields.length);
        
        for(Field f : fields)
        {
            System.out.println(f);
        }
        
        if(resultado != null)
        {
                        
            try {
                
                while (resultado.next())
                {
                    
                    Object objeto;
                    
                    objeto = claseObjeto.newInstance();
                    
                    for (int i = 0; i < fields.length; i++) 
                    {

                        String typeName = fields[i].getType().getName();
                        
                        System.out.println("TypeName = "+ typeName);
                        
                        String fieldName = fields[i].getName();
                        
                        System.out.println("Busco el metodo: " + "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1));//, fields[i].getType());
                        
                        System.out.println("Busco el tipo: " + fields[i].getType());
                        System.out.println("Busco el tipo: " + int.class);
                        
                        Method method=null;
                        
                        try
                        {
                            method = objeto.getClass().getDeclaredMethod("set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1), fields[i].getType()); 

                            System.out.println("Metodo elegido = " + method);
                            
                        }catch (NoSuchMethodException e){
                            System.out.println(e);
                        }

                        if ("java.lang.String".equals(typeName)) 
                        {
                            System.out.println("Creo que es String");
                            method.invoke(objeto, resultado.getString(fieldName));

                        } else if ("short".equals(typeName)) 
                        {
                            System.out.println("Creo que es un short");
                            method.invoke(objeto, resultado.getShort(fieldName));

                        } else if ("long".equals(typeName)) 
                        {
                            System.out.println("Creo que es un long");
                            method.invoke(this, resultado.getLong(fieldName));

                        } else if ("int".equals(typeName)) 
                        {
                            System.out.println("Creo que es un int");
                            method.invoke(objeto, resultado.getInt(fieldName));

                        } else if ("char".equals(typeName)) 
                        {
                            System.out.println("Creoe que es un char");
                            method.invoke(objeto, resultado.getString(fieldName).charAt(0));

                        } else if ("double".equals(typeName)) 
                        {
                            System.out.println("Creo que es un double");
                            method.invoke(objeto, resultado.getDouble(fieldName));

                        } else if ("float".equals(typeName)) 
                        {
                            System.out.println("Creo que es un float");
                            method.invoke(objeto, resultado.getFloat(fieldName));
                        }
                        
                    }
                    
                    System.out.println(objeto);
                    objetos.add(objeto);
                }
                
            } catch (SQLException | InstantiationException ex) {
                
                Logger.getLogger(Cconexion.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
        
        
        return objetos;
    }
    /*
    public ArrayList<Cvivienda> getObjeto( Cvivienda objeto)
    {
        ArrayList<Cvivienda> viviendas = new ArrayList<>(); 
        
        return viviendas;
    }
    */
    private ResultSet ejecutaSelect(String tabla)
    {
        ResultSet resultado = null;
        String cadenaConsulta = CONSULTA_SELECT;
        cadenaConsulta = cadenaConsulta.replace("TABLA", tabla);
        
        System.out.println(cadenaConsulta);
        
        try 
        {
            
            conBD = DriverManager.getConnection(cadenaConexion,usuario, contrasenya);
            
            Statement consulta=conBD.createStatement();
            
            resultado = consulta.executeQuery(cadenaConsulta);
            
        } catch (SQLException error) {
            
            System.out.println("Error al conectar con el servidor MariaDB: " + error.getMessage());
        }
        finally{
            
            try {
                conBD.close();
            } catch (SQLException ex) {
                Logger.getLogger(Cconexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        return resultado;
    }
    
   
            
            
}
