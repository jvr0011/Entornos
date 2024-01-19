/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entornos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;



/*
CREATE TABLE IF NOT EXISTS CLIENTES (
	ID SERIAL PRIMARY KEY,
	NOMBRE VARCHAR(30) NOT NULL,
	IDFISCAL VARCHAR (15) NOT NULL UNIQUE KEY,
	DIRECCION VARCHAR(100) NOT NULL,
	MAIL VARCHAR (50) NOT NULL,
	TELEFONO INT NOT NULL
	);

alter table clientes add CONSTRAINT IDFISCAL_UK UNIQUE (IDFISCAL);

*/
/**
 *
 * @author Medac
 */
@Entity
@Table (name="clientes")
public class Ccliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="direccion")
    private String direccion;
    
    @Column(name="idfiscal")
    private String idFiscal;
    
    @Column(name="telefono")
    private int telefono;
    
    @Column(name="mail")
    private String mail;
   
        
    public Ccliente()
    {
        this.id=0;
        this.nombre="";
        this.direccion="";
        this.idFiscal="";
        this.telefono=0;
        this.mail="";
    }
    
        
    public Ccliente(String nombre, String direccion, String idFiscal)
    {
        this.id=0;
        this.nombre=nombre;
        this.direccion=direccion;
        this.idFiscal=idFiscal;
        this.telefono=0;
        this.mail="";
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String imail) {
        this.mail = imail;
    }
    
    public int getId()
    {
        return id;
    }
    
    
     @Override
    public String toString() {
        return  idFiscal + " - " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idFiscal);
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
        final Ccliente other = (Ccliente) obj;
        return Objects.equals(this.idFiscal, other.idFiscal);
    }
    
    public String getInsertString()
    {
        
        String cadena = "INSERT INTO " + "CLIENTES" + " (idFiscal, NOMBRE, DIRECCION, TELEFONO, MAIL) "
                + "VALUES('" + this.idFiscal + "','"
                + this.nombre + "','" + this.direccion
                + "'," + String.valueOf(telefono)
                + ",'" + this.mail + "');";
        
        return cadena;
        
    }
    
    public String getUpdateString()
    {
        
        String cadena = "UPDATE CLIENTES" + 
                " SET IDFISCAL = '" + this.idFiscal + "'," +
                " NOMBRE ='" + this.nombre + "'," +
                " DIRECCION ='" + this.direccion + "'," +
                " TELEFONO =" + String.valueOf(telefono) + "," +
                " MAIL = '" + this.mail + "' " +                 
                " WHERE ID = " + this.id + ";";
        
        return cadena;
        
    }
    
    public String getDeleteString()
    {
        String cadena = "DELETE CLIENTES WHERE ID = " + this.id + ';';
        
        return cadena;
    }
    
}
