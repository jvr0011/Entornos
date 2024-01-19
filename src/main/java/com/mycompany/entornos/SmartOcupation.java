/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.entornos;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 *
 * @author Medac
 */
public class SmartOcupation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // EntityManagerFactory factory = Persistence.createEntityManagerFactory("SmartOcupantionPU");
        
        // EntityManager manager = factory.createEntityManager();
       
        VentanaPrincipal programa = new VentanaPrincipal();
        
        programa.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        programa.setVisible(true);
        

    }
}
