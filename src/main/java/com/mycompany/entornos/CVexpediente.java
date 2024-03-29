/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.entornos;


import com.toedter.calendar.JDateChooser;
import jakarta.persistence.EntityManager;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Medac
 */
public class CVexpediente extends javax.swing.JFrame {

    /**
     * Creates new form CVexpediente
     */
    public CVexpediente() {
        initComponents();
        
        this.cliente=null;
        this.expediente = new Cexpediente(cliente);
        
        this.modificando=false;
        this.indice=0;
        this.bloqueaCampos(modificando);
        
        
    }
    
     public CVexpediente(EntityManager manager) {
        initComponents();
        
        this.expediente = new Cexpediente();
        
        this.manager=manager;
        
        this.viviendas=null;
        
        this.clientes=null;
        
        this.cargaDatos();
        
        this.modificando=false;
        
        this.indice=0;
        
        // Relleno todos campos para mostrarlos en pantall
        this.cargaValores();
        
        // bloqueo campos para evitar cambios accidentales
        this.bloqueaCampos(modificando);
        
        //pongo los textos por defecto en los botones
        this.cambiaTextoBotones(modificando);  
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        panelPie = new javax.swing.JPanel();
        btBorrar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btGuadar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        panelCabecera = new javax.swing.JPanel();
        lbTItulo = new javax.swing.JLabel();
        panelCuerpo = new javax.swing.JPanel();
        tfNumero = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        lbFinicio = new javax.swing.JLabel();
        lbFFin = new javax.swing.JLabel();
        jcFechaFin = new com.toedter.calendar.JDateChooser();
        lbCliente = new javax.swing.JLabel();
        lbDatosVivienda = new javax.swing.JLabel();
        lbDatosCliente = new javax.swing.JLabel();
        jcFechaInicio = new com.toedter.calendar.JDateChooser();
        lbVivienda = new javax.swing.JLabel();
        panelBusca = new javax.swing.JPanel();
        btBuscaCliente = new javax.swing.JButton();
        btBuscaVivienda = new javax.swing.JButton();
        panelBuscar = new javax.swing.JPanel();
        btAnterior = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btSiguiente = new javax.swing.JButton();
        lbPrecio = new javax.swing.JLabel();
        spPrecio = new javax.swing.JSpinner();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Expediente de Alquiler");

        btBorrar.setForeground(new java.awt.Color(255, 0, 0));
        btBorrar.setText("Borrar");
        btBorrar.setToolTipText("Borra expediente actual");
        btBorrar.setName(""); // NOI18N
        panelPie.add(btBorrar);

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });
        panelPie.add(btNuevo);

        btGuadar.setText("Modficar");
        btGuadar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGuadarMouseClicked(evt);
            }
        });
        panelPie.add(btGuadar);

        btCancelar.setText("Salir");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });
        panelPie.add(btCancelar);

        getContentPane().add(panelPie, java.awt.BorderLayout.SOUTH);

        lbTItulo.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbTItulo.setText("Datos Expediente");
        lbTItulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18))); // NOI18N
        panelCabecera.add(lbTItulo);

        getContentPane().add(panelCabecera, java.awt.BorderLayout.PAGE_START);

        tfNumero.setText("Expediente");
        tfNumero.setToolTipText("Número de expediente");

        lbNumero.setText("Número");

        lbFinicio.setText("Fecha inicio");
        lbFinicio.setToolTipText("Fecha en la que se inicia el alquiler");

        lbFFin.setText("Fecha fin");
        lbFFin.setToolTipText("Fecha de fin del alquiler");

        jcFechaFin.setToolTipText("Fecha de fin del alquiler");
        jcFechaFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcFechaFinMouseClicked(evt);
            }
        });

        lbCliente.setText("Cliente");
        lbCliente.setToolTipText("Persona que alquila la vivienda");

        lbDatosVivienda.setText("Referencia - Nombre de la vivienda");
        lbDatosVivienda.setToolTipText("Vivienda seleccionada");

        lbDatosCliente.setText("Nombre del cliente");
        lbDatosCliente.setToolTipText("Cliente seleccionado");

        jcFechaInicio.setToolTipText("Fecha de inicio del alquiler");

        lbVivienda.setText("Vivienda");
        lbVivienda.setToolTipText("Datos de la vivienda");

        btBuscaCliente.setText("Buscar");
        btBuscaCliente.setToolTipText("Buscar vivienda");
        btBuscaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscaClienteMouseClicked(evt);
            }
        });

        btBuscaVivienda.setText("Buscar");
        btBuscaVivienda.setToolTipText("Buscar un cliente");
        btBuscaVivienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscaViviendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBuscaLayout = new javax.swing.GroupLayout(panelBusca);
        panelBusca.setLayout(panelBuscaLayout);
        panelBuscaLayout.setHorizontalGroup(
            panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscaVivienda, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btBuscaCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5))
        );
        panelBuscaLayout.setVerticalGroup(
            panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btBuscaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btBuscaVivienda))
        );

        btAnterior.setText("<");
        btAnterior.setToolTipText("Anterior");
        btAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAnteriorMouseClicked(evt);
            }
        });
        panelBuscar.add(btAnterior);

        btBuscar.setText("Buscar");
        btBuscar.setToolTipText("Buscar cliente");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });
        panelBuscar.add(btBuscar);

        btSiguiente.setText(">");
        btSiguiente.setToolTipText("Posterior");
        btSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSiguienteMouseClicked(evt);
            }
        });
        btSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiguienteActionPerformed(evt);
            }
        });
        panelBuscar.add(btSiguiente);

        lbPrecio.setText("Precio");
        lbPrecio.setToolTipText("Precio del alquiler");

        spPrecio.setModel(new javax.swing.SpinnerNumberModel(100, 100, 10000, 50));
        spPrecio.setToolTipText("Precio del alquiler");

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(lbFFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbVivienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcFechaInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jcFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelCuerpoLayout.createSequentialGroup()
                                .addComponent(lbDatosVivienda, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNumero)
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDatosVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPrecio)
                            .addComponent(spPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFinicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFFin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelCuerpo, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuadarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGuadarMouseClicked
        if(!this.modificando)
        {
            // Activo la marca que me permite saber si estoy modificando
            this.modificando=true;

            //  desbloqueo los campos del formulario
            this.bloqueaCampos(modificando);
            
            this.cambiaTextoBotones(modificando);
        
        }else{
                        
            if( this.compruebaCampo(this.cliente, lbDatosCliente)&&
                    this.compruebaCampo(this.vivienda, lbDatosVivienda)&&
                    this.compruebaCampo(spPrecio, this.vivienda.getPrecio())&&
                    this.compruebaCampo(this.jcFechaInicio, this.jcFechaFin))
                
            {
                
                this.grabaRegistro();
                this.modificando=false;
                this.cambiaTextoBotones(modificando);
                this.bloqueaCampos(modificando);
            }
            
        }
    }//GEN-LAST:event_btGuadarMouseClicked

    
    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked

        if (this.modificando)
        {
            this.modificando=!this.modificando;
            this.cargaValores();
            this.bloqueaCampos(modificando);
            this.cambiaTextoBotones(modificando);
            
        }else
            this.dispose();
    }//GEN-LAST:event_btCancelarMouseClicked

    private void jcFechaFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcFechaFinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcFechaFinMouseClicked

    private void btAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAnteriorMouseClicked
        
        // si no hay datos, no hago nada.
        if (this.expedientes.size()<=0)
        {
            this.muestraSinDatos();
            return;
        }
        
        indice --;

        indice = (this.validaIndice(indice, this.expedientes)) ? this.indice : this.expedientes.size()-1;

        this.expediente =(Cexpediente) this.expedientes.get(indice);

        this.cargaValores(this.expediente);
    }//GEN-LAST:event_btAnteriorMouseClicked

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked

         // si no hay datos, no hago nada.
        if (this.expedientes.size()<=0)
        {
            muestraSinDatos();
            return;
        }
        
        this.expediente =(Cexpediente) JOptionPane.showInputDialog(this,"Seleccione Expediente","Selector de expedientes",JOptionPane.QUESTION_MESSAGE,null, this.expedientes.toArray(),null);
        
        if(this.expediente!= null)this.cargaValores(expediente);
        
    }//GEN-LAST:event_btBuscarMouseClicked

    private void btSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSiguienteMouseClicked
        
        // si no hay datos, no hago nada.
        if (this.expedientes.size()<=0)
        {
            this.muestraSinDatos();
            return;
        }
        
        indice ++;
        
        
        indice = (this.validaIndice(indice, this.expedientes)) ? this.indice : 0;

        this.expediente = (Cexpediente) this.expedientes.get(indice);

        this.cargaValores(expediente);
        
    }//GEN-LAST:event_btSiguienteMouseClicked

    private void btBuscaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscaClienteMouseClicked
        
        if (evt.getButton()== MouseEvent.BUTTON3)
        {
      
            CVcliente c = new CVcliente(this.manager, this.cliente,false);
            c.setVisible(true);
            
        }else if (evt.getButton()== MouseEvent.BUTTON1)
        {
            
            this.cliente =(Ccliente) JOptionPane.showInputDialog(this, CVcliente.SELECCION,CVcliente.TITULO_MENSAJE,JOptionPane.QUESTION_MESSAGE,null, this.clientes.toArray(),null);
            this.lbDatosCliente.setText(this.cliente.toString());
            
        }
    }//GEN-LAST:event_btBuscaClienteMouseClicked

    private void btBuscaViviendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscaViviendaMouseClicked
        
        if (evt.getButton()== MouseEvent.BUTTON3)
        {
            // Abro formulario de la vivienda con la vivienda 
            CVvivienda c = new CVvivienda(this.manager, this.vivienda, false);
            c.setVisible(true);
            
        }else if (evt.getButton()== MouseEvent.BUTTON1)
        {
            //Muestro el selector de viviedas 
            this.vivienda =(Cvivienda) JOptionPane.showInputDialog(this,CVvivienda.SELECCION,
                    CVvivienda.TITULO_MENSAJE,JOptionPane.QUESTION_MESSAGE,
                    null, this.viviendas.toArray(),null);
            
            // Cargo valores de la vivienda 
            this.lbDatosVivienda.setText(this.vivienda.toString());
            
            // Cargo precio alquiler mensual 
            this.spPrecio.setValue(this.vivienda.getPrecio());
            
        }
    }//GEN-LAST:event_btBuscaViviendaMouseClicked

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        
        this.expediente=new Cexpediente();
        this.cliente=null;
        this.vivienda=null;
        
        this.cargaValores();
        
        this.nuevo=true;
        this.modificando=true;
        this.cambiaTextoBotones(this.modificando);
        this.bloqueaCampos(this.modificando);
        
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiguienteActionPerformed
        
         // si no hay datos, no hago nada.
        if (this.expedientes.size()<=0)
        {
            muestraSinDatos();
            return;
        }
        
        indice ++;
        
        indice = (this.validaIndice(indice, this.expedientes)) ? this.indice : 0;

        this.expediente = (Cexpediente) this.expedientes.get(indice);

        this.cargaValores(expediente);    
                                 
    }//GEN-LAST:event_btSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(CVexpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVexpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVexpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVexpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CVexpediente().setVisible(true);
            }
        });
    }
    
    /**
     * Lanza mensaje que no hay informacion en el ArrayList.
     */
    private void muestraSinDatos()
    {
        JOptionPane.showMessageDialog(this, this.TEXTO_REVISAR + this.NO_HAY_DATOS  , TITULO_MENSAJE, JOptionPane.ERROR_MESSAGE);
    }
    
    private void grabaRegistro()
    {
        
        this.expediente.setVivienda(this.vivienda);
        this.expediente.setCliente(this.cliente);
        
        this.expediente.setPrecio((int)spPrecio.getValue());
        
        this.expediente.setFechaInicio(LocalDate.ofInstant(this.jcFechaInicio.getDate().toInstant(),ZoneOffset.UTC));
        
        this.expediente.setFechaFin(LocalDate.ofInstant(this.jcFechaFin.getDate().toInstant(),ZoneOffset.UTC));
        
        this.manager.getTransaction().begin();
        
        if (this.nuevo)
        {
            
            System.out.println("Es un nuevo expediente");
            this.manager.persist(this.expediente);
        
        }else{
            
            System.out.println("NO Es un nuevo expediente");
            this.manager.refresh(this.expediente);
        }
        
        this.manager.getTransaction().commit();
                        
        //JOptionPane.showMessageDialog(this,this.TEXTO_REVISAR + modificando, TITULO_MENSAJE, JOptionPane.ERROR_MESSAGE);

    }
    
    private void cargaValores(Cexpediente expediente)
    {
        
        this.expediente=expediente;
        
        this.tfNumero.setText(String.valueOf(this.expediente.getNumero()));
        this.lbDatosVivienda.setText(this.expediente.getVivienda().toString());
        this.lbDatosCliente.setText(this.expediente.getCliente().toString());
        
        this.spPrecio.setValue(this.expediente.getVivienda().getPrecio());
        
        this.cliente=expediente.getCliente();
        this.vivienda=expediente.getVivienda();
        
        
        long ahora = this.expediente.getFechaInicio().toEpochSecond(LocalTime.now(), ZoneOffset.UTC);
        
        System.out.println(ahora);
        
        this.jcFechaInicio.setDate(Date.from(Instant.ofEpochSecond(ahora)));
        
        ahora = this.expediente.getFechaFin().toEpochSecond(LocalTime.now(), ZoneOffset.UTC);
        
        System.out.println(ahora);
        
        this.jcFechaFin.setDate(Date.from(Instant.ofEpochSecond(ahora)));

    }
    
    private void cargaValores()
    {
        // datos label
        this.tfNumero.setText(CVexpediente.SIN_NUMERO);
        this.lbDatosVivienda.setText(CVvivienda.SIN_REFERENCIA);
        this.lbDatosCliente.setText(CVcliente.SIN_NOMBRE);
        
        this.spPrecio.setValue(CVvivienda.PRECIO_MINIMO);
        
        
        long ahora = this.expediente.getFechaInicio().toEpochSecond(LocalTime.now(), ZoneOffset.UTC);
        System.out.println(ahora);
        this.jcFechaInicio.setDate(Date.from(Instant.ofEpochSecond(ahora)));
        //dateTemp = this.jcFechaInicio.getDate();
        this.jcFechaFin.setDate(Date.from(Instant.ofEpochSecond(ahora)));

    }
     
     private void cambiaTextoBotones(boolean modificando)
    {
        
        if (modificando)
        {
            this.btCancelar.setText(CVexpediente.CANCELAR);
            this.btGuadar.setText(CVexpediente.GUARDAR);
            
        }else{
            
            this.btCancelar.setText(SALIR);
            this.btGuadar.setText(MODIFICAR);
            
        }
        
    }
     
    /**
     * Funcion que activa o desactiva la edicion del formulario
     * @param sn parametro que activa o desactiva la edicion del formulario
     */
    private void bloqueaCampos(boolean sn)
    {
        
        this.panelBusca.setVisible(sn);
        this.tfNumero.setEnabled(sn);
        this.jcFechaInicio.setEnabled(sn);
        this.jcFechaFin.setEnabled(sn);
        this.spPrecio.setEnabled(sn);
        
         // Cosas que son distintas a moficar
        this.panelBuscar.setVisible(!sn);
        this.btNuevo.setVisible(!sn);
        this.btBorrar.setVisible(!sn);
        
    }
    
    private boolean validaIndice(int indice, ArrayList<Object> lista)
    {
        
        return (indice < (lista.size()) && indice >= 0);
        
    }
    
    
    /**
     * Funcion que permite saber si tiene informacion los campos del formulario
     * @param campo campo a validadar
     * @param cadena cadena por defecto con la que se compara
     * @return si tiene la cadena por defecto o está vacio devuelve falso
     */
    private boolean compruebaCampo(JTextField campo, String cadena)
    {
        boolean resultado =false;
      
        if (cadena.equals(campo.getText()) || campo.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this,this.TEXTO_REVISAR + campo.getToolTipText(), TITULO_MENSAJE, JOptionPane.ERROR_MESSAGE);
            campo.setForeground(Color.red);
        }else{
            
            campo.setForeground(Color.black);
            resultado=true;
        }
        
        return resultado; 
    }
    
     /**
     * Funcion que permite saber si tiene informacion los campos del formulario
     * @param campo campo a validadar
     * @param valorMinimo valor con el que se compara
     * @return si tiene el valor por derecto o o está vacio devuelve falso
     */
    private boolean compruebaCampo(JSpinner campo, int valorMinimo)
    {
        
        System.out.println("Estoy revisando el valor del alquiler");
        
        boolean resultado =false;
        
        int valor=(int) campo.getValue();
      
        if (valor < valorMinimo)
        {
            JOptionPane.showMessageDialog(this, this.TEXTO_REVISAR + campo.getToolTipText()  , TITULO_MENSAJE, JOptionPane.ERROR_MESSAGE);
            campo.setForeground(Color.red);
            
        }else{
            
            campo.setForeground(Color.black);
            resultado=true;
        }
        
        
        return resultado; 
    }
    
    /**
     * Funcion que permite validar las fechas del alquiler. Valida que las fecha de inicio y fin
     * @param Fecha de en la que se inicia y fecha en la que se finaliza
     * @return True si las fecha de fin es superior a la de inicio y es superior a hoy
     */
    private boolean compruebaCampo(JDateChooser fechaInicio, JDateChooser fechaFin )
    {
        
        System.out.println("Estoy revisando las fechas");
        
        System.out.print("Fecha inicio =");
        System.out.println(fechaInicio.getDate().toString());
            
        System.out.print("Fecha fin =");
        System.out.println(fechaFin.getDate().toString());
        
        boolean resultado =false;
        
        long ahora = this.expediente.getFechaInicio().toEpochSecond(LocalTime.now(), ZoneOffset.UTC);
       
        Date fechaHoy = Date.from(Instant.ofEpochSecond(ahora));
        
        // Si la fecha de inicio es anterior a hoy
        if(fechaInicio.getDate().before(fechaHoy))
        {
            System.out.println("fecha inicio es anterior a hoy");
            System.out.print("Fecha inicio =");
            System.out.println(fechaInicio.getDate().toString());
            
            System.out.print("Fecha fin =");
            System.out.println(fechaFin.getDate().toString());
            
            fechaInicio.setForeground(Color.black);
                            
            if (!fechaFin.getDate().after(fechaInicio.getDate()))
            {
                
                JOptionPane.showMessageDialog(this, this.TEXTO_REVISAR + fechaFin.getToolTipText()  , TITULO_MENSAJE, JOptionPane.ERROR_MESSAGE);
                fechaFin.setForeground(Color.red);
            
            }else{
            
                fechaFin.setForeground(Color.black);
                resultado=true;
        
            }
            
        } else {
            
            System.out.println("fecha inicio es no es anterior a hoy");
            System.out.println(fechaInicio.getDate().toString());
            System.out.println(fechaHoy.toString());
            
            JOptionPane.showMessageDialog(this, this.TEXTO_REVISAR + fechaInicio.getToolTipText()  , TITULO_MENSAJE, JOptionPane.ERROR_MESSAGE);
            fechaInicio.setForeground(Color.red);           
        
            } 
        
        
        return resultado;
    }
    
    private boolean compruebaCampo(Object campo, JLabel etiqueta)
    {
        boolean resultado =false;
        
        if (campo == null)
        {
            JOptionPane.showMessageDialog(this, this.TEXTO_REVISAR + etiqueta.getToolTipText()  , TITULO_MENSAJE, JOptionPane.ERROR_MESSAGE);
            etiqueta.setForeground(Color.red);
            
        }else{
            
            etiqueta.setForeground(Color.black);
            resultado=true;
        }
        
        
        return resultado; 
    }
    
       
     private void cargaDatos()
    {
        
        if (manager.isOpen())
        {
            
            this.vivienda =null;
            this.viviendas =(ArrayList<Cvivienda>)this.manager.createNativeQuery("select * from viviendas",Cvivienda.class).getResultList();
            this.clientes =(ArrayList<Ccliente>)this.manager.createNativeQuery("select * from clientes",Ccliente.class).getResultList();
            this.expedientes =(ArrayList<Object>)this.manager.createNativeQuery("select * from expedientes",Cexpediente.class).getResultList();
            
        }else{
            
            JOptionPane.showMessageDialog(this, VentanaPrincipal.MENSAJE_ERROR,"Error",JOptionPane.WARNING_MESSAGE);
            
            this.dispose();
                    
        }
    }
    
    
    int indice;
    
    Ccliente cliente;
    Cvivienda vivienda;
    Cexpediente expediente;
  
    
    ArrayList<Cvivienda> viviendas;
    ArrayList<Ccliente> clientes;
    ArrayList<Object> expedientes;
    
     //variable para saber si estoy modificando
    boolean modificando;
    
    boolean nuevo;
    
    private EntityManager manager;
    
    
    final static String SIN_NUMERO="SIN NUMERO";
    final static String GUARDAR="Guardar";
    final static String MODIFICAR="Modificar";
    
    final static String SALIR="Salir";
    final static String CANCELAR="Cancelar";
    
    final static String TITULO_MENSAJE="Datos Formulario";
    final String TEXTO_REVISAR="Revise ";
    final String NO_HAY_DATOS="No hay datos para mostrar";
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btBuscaCliente;
    private javax.swing.JButton btBuscaVivienda;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGuadar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSiguiente;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JFrame jFrame1;
    private com.toedter.calendar.JDateChooser jcFechaFin;
    private com.toedter.calendar.JDateChooser jcFechaInicio;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbDatosCliente;
    private javax.swing.JLabel lbDatosVivienda;
    private javax.swing.JLabel lbFFin;
    private javax.swing.JLabel lbFinicio;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbTItulo;
    private javax.swing.JLabel lbVivienda;
    private javax.swing.JPanel panelBusca;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelPie;
    private javax.swing.JSpinner spPrecio;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
}
