/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entornos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Medac
 */
/*
CREATE TABLE IF NOT EXISTS empresa (id serial primary key, cif VARCHAR(15), nombre VARCHAR(30),correo VARCHAR(50), telefono INT, direccion VARCHAR(100));
*/
@Entity
@Table(name="EMPRESAS")
public class Cempresa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String idFiscal;
    private String nombre;
    private String Mail;
    private int telefono;
    private String direccion;

    public Cempresa(String idFiscal, String nombre, String Mail, int telefono, String direccion) {
        this.idFiscal = idFiscal;
        this.nombre = nombre;
        this.Mail = Mail;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public Cempresa()
    {
        this.id=0;
        this.idFiscal = "";
        this.nombre = "";
        this.Mail="";
        this.telefono=0;
        this.direccion="";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    public String getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String correoElectronico) {
        this.Mail = correoElectronico;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idFiscal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cempresa other = (Cempresa) obj;
        return Objects.equals(this.idFiscal, other.idFiscal);
    }
    
    
    public String getInsertString()
    {
        
        String cadena = "INSERT INTO EMPRESAS (IDFISCAL, NOMBRE, MAIL, TELEFONO, direccion)" + " VALUES('" + this.idFiscal + "','" + 
                this.nombre + "','" + this.Mail + "'," + String.valueOf(this.telefono)+ ",'"+ this.direccion + "');";
        
        return cadena;
        
    }
    
    public String getDeleteString()
    {
        
        String cadena = "DELETE EMPRESAS WHERE IDFISCAL = '" + this.idFiscal + "';";
        
        return cadena;
        
    }
    
    
    public String getUpdateString()
    {
        
        String cadena = "UPDATE EMPRESAS "
                + " SET IDFISCAL = '" + this.idFiscal + "',"
                + " NOMBRE = '" + this.nombre + "',"
                + " MAIL = '" + this.Mail + "',"
                + " TELEFONO= " + String.valueOf(this.telefono) + ','
                + " DIRECCION = '" + this.direccion + "' " 
                + " WHERE IDFISCAL = '" + this.idFiscal + "';";
        
        return cadena;
        
    }
    
    
    
    
 
}
    


