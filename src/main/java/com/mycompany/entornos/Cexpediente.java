/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entornos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;


/*
CREATE TABLE IF NOT EXISTS EXPEDIENTES (
	ID SERIAL PRIMARY KEY,
	PRECIO NUMERIC(10,3) NOT NULL,
	FECHAINICIO DATE NOT NULL,
	FECHAFIN DATE NOT NULL,
	VIVIENDA INT NOT NULL,
	CLIENTE INT NOT NULL
	);

ALTER TABLE EXPEDIENTES ADD CONSTRAINT FK_VIVIENDA FOREIGN KEY (VIVIENDA) REFERENCES VIVIENDAS(ID);

ALTER TABLE EXPEDIENTES ADD CONSTRAINT FK_CLIENTE FOREIGN KEY (CLIENTE) REFERENCES CLIENTES(ID);


*/
/**
 *
 * @author Medac
 */
@Entity
@Table (name="expedientes")
public class Cexpediente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    
    @Column(name="precio")
    private int precio;
    
    @Column(name="fechainicio")
    private LocalDate fechaInicio;
    
    @Column(name="fechafin")
    private LocalDate fechaFin;
    
    @JoinColumn(name="vivienda")
    @ManyToOne()
    private Cvivienda vivienda;
    
    @JoinColumn(name="cliente")
    @ManyToOne()
    private Ccliente cliente; 

    public Cexpediente() {
        
        this.numero=0;
        this.vivienda=null;
        this.precio=0;
        this.fechaInicio=LocalDate.now();
        this.fechaFin =LocalDate.now();
        this.cliente=null;
        
    }
      
    
    public Cexpediente(int numero, Cvivienda vivienda, Ccliente cliente)
    {
        this.numero=numero;
        this.vivienda=vivienda;
        this.precio=vivienda.getPrecio();
        this.fechaInicio=LocalDate.now();
        this.fechaFin =LocalDate.now();
        this.cliente=cliente;
    }
    
    public Cexpediente(Ccliente cliente)
    {
        this.numero=0;
        this.vivienda = new Cvivienda();
        this.fechaInicio=LocalDate.now();
        this.fechaFin =LocalDate.now();
        this.cliente=cliente;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
    public Cvivienda getVivienda() {
        return vivienda;
    }

    public Ccliente getCliente() {
        return cliente;
    }
  
    public void setCliente(Ccliente cliente)
    {
        this.cliente=cliente;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setVivienda(Cvivienda vivienda) {
        this.vivienda = vivienda;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    public String getInsertString()
    {
        String cadena = "INSERT INTO Expediente VALUES('"
                + fechaInicio.toString() + ','
                + fechaFin.toString() + ',' 
                + String.valueOf(vivienda.getReferencia()) + ',' 
                + String.valueOf(cliente.getId()) 
                + ");";
        
        return cadena;
    }

    @Override
    public String toString() {
        return  "numero=" + numero + ", vivienda=" + vivienda + ", cliente=" + cliente ;
    }
    
    
            
    
}
