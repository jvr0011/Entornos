/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.entornos;

import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Medac
 */
public class CVclienteTest {
    
    public CVclienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compruebaCampo method, of class CVcliente.
     */
    @Test
    public void testCompruebaCampo() {
        System.out.println("compruebaCampo");
        JTextField campo = null;
        String cadena = "rffa";
        CVcliente instance = new CVcliente();
        boolean expResult = false;
        boolean result = instance.compruebaCampo(campo, cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CVcliente.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CVcliente.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
