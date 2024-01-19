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


/*
CREATE TABLE VIVIENDAS IF NOT EXISTS(
	ID SERIAL PRIMARY KEY,
	REFERENCIA VARCHAR(15) NOT NULL,
	DIRECCION VARCHAR(100) NOT NULL,
	METROS INT NOT NULL DEFAULT 30,
	HABITACIONES SMALLINT NOT NULL DEFAULT 1,
	BANYOS SMALLINT NOT NULL,
	PRECIO NUMERIC (10,3) NOT NULL,
	ALQUILADA BOOLEAN DEFAULT FALSE
	);

alter table VIVIENDAS add CONSTRAINT REFERENCIA_UK UNIQUE (REFERENCIA);

*/

/**
 *
 * @author Medac
 */
@Entity
@Table(name="VIVIENDAS")
public class Cvivienda implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="referencia")
    private String referencia;
    
    @Column(name="direccion")
    private String direccion;
    
    @Column(name="metros")
    private int metros;
    
    @Column(name="habitaciones")
    private int habitaciones;
    
    @Column(name="banyos")
    private int banyos;
    
    @Column(name="precio")
    private int precio;
    
    @Column(name="alquilada")
    private boolean alquilada;
    
    //private String fotoVivienda;
     
    
    public Cvivienda(){
        this.referencia="";
        this.direccion="";
        this.metros=0;
        this.habitaciones=0;
        this.banyos=0;
        this.precio=0;
        this.alquilada=false;
        //this.fotoVivienda="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBanyos() {
        return banyos;
    }

    public void setBanyos(int nBanyos) {
        this.banyos = nBanyos;
    }
    

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metrosCuadrados) {
        this.metros = metrosCuadrados;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int nHabitaciones) {
        this.habitaciones = nHabitaciones;
    }

    public int getBanyios() {
        return banyos;
    }

    public void setBanyios(int nBanyios) {
        this.banyos = nBanyios;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precioAlquiler) {
        this.precio = precioAlquiler;
    }

        
    public void setAlquilada(boolean alquilada){
        this.alquilada=alquilada;
    }
            
    
    public boolean getAlquilada(){
        return alquilada;
    }

    @Override
    public String toString() {
        return referencia + " - " + direccion ;
    }
    
    public String getInsertString()
    {
        char charAlquilada = (this.alquilada) ? 'S': 'N';
        String cadena = "INSERT INTO VIVIENDAS (REFERENCIA, DIRECCION, METROS, HABITACIONES, BANYOS, PRECIO, ALQUILADA) " + "VALUES('" + this.referencia +
                "','" + this.direccion + "'," + String.valueOf(this.metros) + "," + String.valueOf(this.habitaciones) + "," + String.valueOf(this.banyos) + "," + 
                String.valueOf(this.precio) + ",'" + charAlquilada  + "');";
        
        return cadena;
        
    }
    
    public String getUpdateString()
    {
        char charAlquilada = (this.alquilada) ? 'S': 'N';
        
        String cadena = "UPDATE VIVIENDAS SET"
                + " REFERENCIA = '" + this.referencia + "',"
                + " DIRECCION = '" + this.direccion + "',"
                + " METROS = "  + String.valueOf(this.metros) + ","
                + " HABITACIONES = " + String.valueOf(this.habitaciones) + ","
                + " BANYOS = " + String.valueOf(this.banyos) + ","
                + " PRECIO = " + String.valueOf(this.precio) + ","
                + " ALQUILADA =' " + charAlquilada  + "'"
                + " WHERE ID = " + this.id;
        
        return cadena;
        
    }
    
      
    
}
