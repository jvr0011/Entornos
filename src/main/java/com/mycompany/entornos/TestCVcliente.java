/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entornos;

import javax.swing.JTextField;
import junit.framework.TestCase;

/**
 *
 * @author Medac
 */
public class TestCVcliente extends TestCase {
    
    private CVcliente ventanaCliente;
    
    public void prueba()
    {
        ventanaCliente=new CVcliente();
    }
    
    public void testCompruebaCampo()
    {
        prueba();
        JTextField campo = new JTextField();
        
        assertTrue(ventanaCliente.compruebaCampo(campo,CVcliente.SIN_NOMBRE)==false);
    }
    
}
