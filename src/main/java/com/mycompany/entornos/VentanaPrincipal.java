/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.entornos;



import java.util.ArrayList;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/*
    select e.numero, v.referencia, c.nombre, c.idfiscal, e.fechainicio, e.fechafin from clientes c,  expedientes e, viviendas v
    where c.id in (select e.cliente from expedientes) 
    and e.vivienda in (select v.id from viviendas);
 */

/**
 *
 * @author Medac
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        
        initComponents();
                
        this.empresa = new Cempresa(); 
        
        this.panelDetalles.setVisible(false);
        
        this.factory = Persistence.createEntityManagerFactory(UNIDAD_PERSISTENCIA);
        
        this.manager = factory.createEntityManager();
        
        cargaDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        btViviendas = new javax.swing.JButton();
        btClientes = new javax.swing.JButton();
        btExpedientes = new javax.swing.JButton();
        panelDetalles = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelCabecera = new javax.swing.JPanel();
        lbNombreEmpresa = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivos = new javax.swing.JMenu();
        miDatosEmpresa = new javax.swing.JMenuItem();
        miCerrar = new javax.swing.JMenuItem();
        menuFormularios = new javax.swing.JMenu();
        miViviendas = new javax.swing.JMenuItem();
        miClientes = new javax.swing.JMenuItem();
        miExpedientes = new javax.swing.JMenuItem();
        menuLIstados = new javax.swing.JMenu();
        miListadoClientes = new javax.swing.JMenuItem();
        miListaodViviendas = new javax.swing.JMenuItem();
        miListadoExpedientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smart Ocupation");

        btViviendas.setText("Viviendas");
        btViviendas.setToolTipText("Ver las vividedas");
        btViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViviendasActionPerformed(evt);
            }
        });
        panelCentral.add(btViviendas);

        btClientes.setText("Clientes");
        btClientes.setToolTipText("Ver Clientes");
        btClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btClientesMouseClicked(evt);
            }
        });
        panelCentral.add(btClientes);

        btExpedientes.setText("Expedientes");
        btExpedientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExpedientesMouseClicked(evt);
            }
        });
        panelCentral.add(btExpedientes);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelDetallesLayout = new javax.swing.GroupLayout(panelDetalles);
        panelDetalles.setLayout(panelDetallesLayout);
        panelDetallesLayout.setHorizontalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetallesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDetallesLayout.setVerticalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(panelDetalles, java.awt.BorderLayout.SOUTH);

        lbNombreEmpresa.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbNombreEmpresa.setText("Nombre de la empresa");
        lbNombreEmpresa.setToolTipText("");
        panelCabecera.add(lbNombreEmpresa);

        getContentPane().add(panelCabecera, java.awt.BorderLayout.NORTH);

        menuArchivos.setText("Archivos");

        miDatosEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        miDatosEmpresa.setText("Datos Empresa");
        miDatosEmpresa.setToolTipText("Formulario para rellenar los datos de la empresa");
        miDatosEmpresa.setSelected(true);
        miDatosEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miDatosEmpresaMouseClicked(evt);
            }
        });
        miDatosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDatosEmpresaActionPerformed(evt);
            }
        });
        menuArchivos.add(miDatosEmpresa);

        miCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        miCerrar.setText("Cerrar");
        miCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCerrarActionPerformed(evt);
            }
        });
        menuArchivos.add(miCerrar);

        barraMenu.add(menuArchivos);

        menuFormularios.setText("Formularios");

        miViviendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        miViviendas.setText("Fichero Viviendas");
        miViviendas.setToolTipText("Formulario con los datos de las viviendas");
        miViviendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miViviendasMouseClicked(evt);
            }
        });
        miViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miViviendasActionPerformed(evt);
            }
        });
        menuFormularios.add(miViviendas);

        miClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        miClientes.setText("Fichero Clientes");
        miClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miClientesMouseClicked(evt);
            }
        });
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        menuFormularios.add(miClientes);

        miExpedientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miExpedientes.setText("Fichero Expedientes");
        miExpedientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miExpedientesMouseClicked(evt);
            }
        });
        miExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExpedientesActionPerformed(evt);
            }
        });
        menuFormularios.add(miExpedientes);

        barraMenu.add(menuFormularios);

        menuLIstados.setText("Listados");

        miListadoClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miListadoClientes.setText("Clientes");
        miListadoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListadoClientesActionPerformed(evt);
            }
        });
        menuLIstados.add(miListadoClientes);

        miListaodViviendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miListaodViviendas.setText("Viviendas");
        miListaodViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListaodViviendasActionPerformed(evt);
            }
        });
        menuLIstados.add(miListaodViviendas);

        miListadoExpedientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miListadoExpedientes.setText("Expedientes");
        miListadoExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListadoExpedientesActionPerformed(evt);
            }
        });
        menuLIstados.add(miListadoExpedientes);

        barraMenu.add(menuLIstados);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViviendasActionPerformed
         
        CVvivienda v = new CVvivienda(this.manager);
        v.setVisible(true);
          
                
    }//GEN-LAST:event_btViviendasActionPerformed

    private void btClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClientesMouseClicked
        
        CVcliente c = new CVcliente(this.manager);
        c.setVisible(true);
        
    }//GEN-LAST:event_btClientesMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = this.jTable1.getSelectedRowCount();
        String nif = (String)jTable1.getModel().getValueAt(fila, 0);
        //Ccliente cliente= new Ccliente(nif);
    }//GEN-LAST:event_jTable1MouseClicked

    private void miListadoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListadoClientesActionPerformed
        
            lanzaInforme(PLANTILLA_CLIENTES);
        
    }//GEN-LAST:event_miListadoClientesActionPerformed

    private void btExpedientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExpedientesMouseClicked
        
        CVexpediente e = new CVexpediente(this.manager);
        e.setVisible(true);  
        
    }//GEN-LAST:event_btExpedientesMouseClicked

    private void miViviendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miViviendasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_miViviendasMouseClicked

    private void miClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_miClientesMouseClicked

    private void miExpedientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miExpedientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_miExpedientesMouseClicked

    private void miDatosEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miDatosEmpresaMouseClicked
        
        
    }//GEN-LAST:event_miDatosEmpresaMouseClicked

    private void miDatosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDatosEmpresaActionPerformed
        
        CVempresa formEmpresa = new CVempresa(this.manager, this.empresa);
        formEmpresa.setVisible(true);
        
    }//GEN-LAST:event_miDatosEmpresaActionPerformed

    private void miViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miViviendasActionPerformed
        
        CVvivienda v = new CVvivienda(this.manager);
        v.setVisible(true);
        
    }//GEN-LAST:event_miViviendasActionPerformed

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        
        CVcliente c = new CVcliente(this.manager);
        c.setVisible(true);
        
    }//GEN-LAST:event_miClientesActionPerformed

    private void miExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExpedientesActionPerformed
        
        CVexpediente e = new CVexpediente(this.manager);
        e.setVisible(true);
        
    }//GEN-LAST:event_miExpedientesActionPerformed

    private void miListaodViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListaodViviendasActionPerformed
        
        this.lanzaInforme(PLANTILLA_VIVIENDAS);
    }//GEN-LAST:event_miListaodViviendasActionPerformed

    private void miCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCerrarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_miCerrarActionPerformed

    private void miListadoExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListadoExpedientesActionPerformed
        
        this.lanzaInforme(PLANTILLA_EXPEDIENTES);
    }//GEN-LAST:event_miListadoExpedientesActionPerformed
    
    /**
     * Procedimiento para mostrar los informes por pantalla
     * @param rutaInforme informe a mostrar.
     */
    void lanzaInforme(String[] informe)
    {
        
        File fileInforme = new File(informe[RUTA_INFORME]);
                
        if (!fileInforme.exists())
        {
            JOptionPane.showMessageDialog(this, "File not found","Error",JOptionPane.WARNING_MESSAGE);
            return;
            
        }
            
        Connection conexionbd=null;
                
        try {
            // conexion bd
            conexionbd= DriverManager.getConnection(this.CADENA_CONEXION,this.USUARIO, this.CONTRASENYA);
            
            if (conexionbd.isValid(10))
            {
                
                JasperReport jrInforme=(JasperReport) JRLoader.loadObject(fileInforme);
                JasperPrint informeImpresion = JasperFillManager.fillReport(jrInforme,null,conexionbd);
                JasperViewer vistaInforme= new JasperViewer(informeImpresion);
                vistaInforme.setTitle(informe[NOMBRE_INFORME]);
                vistaInforme.setVisible(true);
                            
            }else
            {
                System.out.println("error de conexion");
            }
            
            
        } catch (SQLException | JRException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally
        {
            if (conexionbd!= null)
            {
                try {
                    conexionbd.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
                
    }
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    private void cargaDatos()
    {
        if(this.manager.isOpen())
        {
        
            this.empresa = this.manager.find(Cempresa.class, 1);

            this.lbNombreEmpresa.setText(this.empresa.getNombre());
        
            
        }else{
            
            JOptionPane.showMessageDialog(this, VentanaPrincipal.MENSAJE_ERROR,"Error",JOptionPane.WARNING_MESSAGE);
            
            this.dispose();
                    
        }
            
        
    }
        
        
    
    /* Datos conexion bd */
    final String CADENA_CONEXION="jdbc:postgresql://192.168.1.230:5432/smartocupation";  
    final String USUARIO="postgres";
    final String CONTRASENYA="Adminis";
    
    final static String UNIDAD_PERSISTENCIA="com.mycompany_Entornos";
    
    private EntityManagerFactory factory;
        
    private EntityManager manager;
       
    private Cempresa empresa;
        
    final static String MENSAJE_ERROR="No se ha podido conectar con la base de datos, el programa se cerrará";
    
    final static String RUTA_IMAGEN="IMAGENES";
    
    
    final static String PLANTILLA_VIVIENDAS[] = {"C:\\Users\\Medac\\Documents\\NetBeansProjects\\Entornos\\src\\main\\java\\com\\mycompany\\entornos\\Vivendas.jasper","Listado de Viviendas"};
    final static String PLANTILLA_CLIENTES []= {"C:\\Users\\Medac\\Documents\\NetBeansProjects\\Entornos\\src\\main\\java\\com\\mycompany\\entornos\\clientes.jasper","Listado de Clientes"};
    final static String PLANTILLA_EXPEDIENTES[] = {"C:\\Users\\Medac\\Documents\\NetBeansProjects\\Entornos\\src\\main\\java\\com\\mycompany\\entornos\\Expedientes.jasper","Listado de Expedientes"};
    static int RUTA_INFORME=0;
    static int NOMBRE_INFORME=1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btExpedientes;
    private javax.swing.JButton btViviendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNombreEmpresa;
    private javax.swing.JMenu menuArchivos;
    private javax.swing.JMenu menuFormularios;
    private javax.swing.JMenu menuLIstados;
    private javax.swing.JMenuItem miCerrar;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miDatosEmpresa;
    private javax.swing.JMenuItem miExpedientes;
    private javax.swing.JMenuItem miListadoClientes;
    private javax.swing.JMenuItem miListadoExpedientes;
    private javax.swing.JMenuItem miListaodViviendas;
    private javax.swing.JMenuItem miViviendas;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDetalles;
    // End of variables declaration//GEN-END:variables
}
