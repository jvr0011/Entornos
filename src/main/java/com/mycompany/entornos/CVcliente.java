/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.entornos;
import jakarta.persistence.EntityManager;
import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author Medac
 */
public class CVcliente extends javax.swing.JFrame {

    /**
     * Creates new form CVcliente
     */
    public CVcliente() {
        initComponents();
    }
    
     public CVcliente(EntityManager manager) {
        initComponents();
        
        //this.conexion = conexion;
        this.manager = manager;
        
        this.cliente = new Ccliente();
        
        this.clientes = null;
        
        this.modificando = false;
        
        this.nuevo = false;
        
        this.indice = 0;
                
        // bloqueo campos para evitar cambios accidentales
        this.bloqueaCampos(modificando);
        
                
        //pongo los textos por defecto en los botones
        this.cambiaTextoBotones(modificando); 
        
        //Carga base de datos
        this.cargaDatos();
        
        //cargo el primer cliente
        this.cliente = (Ccliente) this.clientes.get(indice);
        
        // Relleno todos campos para mostrarlos en pantalla
        this.cargaValores(this.cliente);
    }
    
    public CVcliente(EntityManager manager, Ccliente cliente , boolean modificando) {
        initComponents();
        
        this.manager = manager;
        
        this.cliente = cliente;
        
        this.clientes = null;
        
        this.modificando = modificando;
        
        this.nuevo = false;
        
        this.indice = 0;
        
        // Relleno todos campos para mostrarlos en pantalla
        this.cargaValores(this.cliente);
        
        // bloqueo campos para evitar cambios accidentales
        this.bloqueaCampos(modificando);
        
                
        //pongo los textos por defecto en los botones
        this.cambiaTextoBotones(modificando);   
        
        //Carga base de datos
        this.cargaDatos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCuerpo = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbNif = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        tfNif = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        panelBusqueda = new javax.swing.JPanel();
        btAnterior = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btSiguiente = new javax.swing.JButton();
        panelPie = new javax.swing.JPanel();
        btBorrar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btGuadar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        panelCabecera = new javax.swing.JPanel();
        lbTItulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos Cliente");

        lbNombre.setText("Nombre");

        lbNif.setText("DNI / NIF");

        lbDireccion.setText("Direcci�n");

        tfNif.setText("jTextField1");
        tfNif.setToolTipText("Identificaci�n fiscal");
        tfNif.setNextFocusableComponent(tfNombre);
        tfNif.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNifFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNifFocusLost(evt);
            }
        });

        tfNombre.setText("jTextField1");
        tfNombre.setToolTipText("Nombre del cliente");
        tfNombre.setNextFocusableComponent(tfDireccion);
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });

        tfDireccion.setText("jTextField1");
        tfDireccion.setToolTipText("Direcci�n del cliente");
        tfDireccion.setNextFocusableComponent(btGuadar);
        tfDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDireccionFocusLost(evt);
            }
        });

        jLabel1.setText("Mail");

        tfCorreo.setText("jTextField1");
        tfCorreo.setToolTipText("Correo electr�nico");
        tfCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCorreoFocusLost(evt);
            }
        });

        lbTelefono.setText("Tel�fono");

        tfTelefono.setText("jTextField1");
        tfTelefono.setToolTipText("Tel�fono");

        lbID.setText("ID");

        tfID.setText("jTextField1");

        btAnterior.setText("<");
        btAnterior.setToolTipText("Anterior");
        btAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAnteriorMouseClicked(evt);
            }
        });
        panelBusqueda.add(btAnterior);

        btBuscar.setText("Buscar");
        btBuscar.setToolTipText("Buscar cliente");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });
        panelBusqueda.add(btBuscar);

        btSiguiente.setText(">");
        btSiguiente.setToolTipText("Posterior");
        btSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSiguienteMouseClicked(evt);
            }
        });
        panelBusqueda.add(btSiguiente);

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbNif)
                        .addComponent(lbNombre)
                        .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbID))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDireccion)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addComponent(tfNif, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lbTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(tfTelefono))
                    .addComponent(tfNombre)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCuerpoLayout.createSequentialGroup()
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNif)
                    .addComponent(tfNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDireccion)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(panelCuerpo, java.awt.BorderLayout.LINE_START);

        btBorrar.setForeground(new java.awt.Color(204, 0, 0));
        btBorrar.setText("Borrar");
        btBorrar.setToolTipText("Borra cliente actual");
        btBorrar.setName(""); // NOI18N
        btBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBorrarMouseClicked(evt);
            }
        });
        panelPie.add(btBorrar);

        btNuevo.setText("Nuevo");
        btNuevo.setToolTipText("Crear un cliente nuevo.");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });
        panelPie.add(btNuevo);

        btGuadar.setText("Modficar");
        btGuadar.setNextFocusableComponent(btCancelar);
        btGuadar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGuadarMouseClicked(evt);
            }
        });
        btGuadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuadarActionPerformed(evt);
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
        lbTItulo.setText("Datos Cliente");
        lbTItulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18))); // NOI18N
        panelCabecera.add(lbTItulo);

        getContentPane().add(panelCabecera, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuadarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGuadarMouseClicked
        // Activo la maraca que me permite saber si estoy modificando
        this.modificando=true;

        //  desbloqueo los campos del formulario
        this.bloqueaCampos(modificando);
        

    }//GEN-LAST:event_btGuadarMouseClicked

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked

        if (this.modificando)
        {
            this.modificando=!this.modificando;
            this.nuevo=false;
            cargaValores(this.cliente);
            this.bloqueaCampos(modificando);
            this.cambiaTextoBotones(modificando);
            
        }else
            this.dispose();

    }//GEN-LAST:event_btCancelarMouseClicked

    /**
    * Procedimiento para borrar el texto por defecto al tener el foco.
    * @param evt evento que lo activa
    */
    private void tfNifFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNifFocusGained
        
        if (CVcliente.SIN_DNI.equals(tfNif.getText()))
        {
            tfNif.setText("");
        }
        
    }//GEN-LAST:event_tfNifFocusGained

    /**
     * Procedimiento que pone los valores por defecto cuando pierde el foco si est� vacio.
     * @param evt 
     */
    private void tfNifFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNifFocusLost
        
        if (tfNif.getText().isEmpty())
        {
            tfNif.setText(CVcliente.SIN_DNI);
        }
        
    }//GEN-LAST:event_tfNifFocusLost

    /**
     * Procemimiento que permite modificar guardar el cliente comprueba los campos y guarda en la bd
     * @param evt evento que lo activa.
     */
    private void btGuadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuadarActionPerformed
        
        // compruebo si estoy modificando el registro
        if(this.modificando)
        {
            // compruebo que cada campo tenga un valor distinto del valor por defeccto
            if( this.compruebaCampo(this.tfNif,CVcliente.SIN_DNI) &&
                this.compruebaCampo(this.tfDireccion,CVcliente.SIN_DIRECCION)&&
                this.compruebaCampo(this.tfNombre,CVcliente.SIN_NOMBRE)&&    
                this.compruebaCampo(tfCorreo, CVcliente.SIN_CORREO))
                        
            {
                // Lanzo la grabacion del registro y si es correcto restauro valores y aviso.                 
                if (this.grabaRegistro())
                {
                    this.nuevo=false;
                    
                    this.modificando=false;
                    
                    this.cambiaTextoBotones(modificando);
                    
                    this.bloqueaCampos(modificando);
                    
                    this.cargaDatos();
                    
                    JOptionPane.showMessageDialog(this,this.TEXTO_GUARDADO + !modificando, TITULO_MENSAJE, JOptionPane.INFORMATION_MESSAGE);

                }else
                {
                    JOptionPane.showMessageDialog(this,this.TEXTO_GUARDADO + !modificando, TITULO_MENSAJE, JOptionPane.WARNING_MESSAGE);
                }
              
            }           
            
        }else
        {
            
            this.modificando = true;
            this.cambiaTextoBotones(modificando);
            this.bloqueaCampos(modificando);
        }
            
    }//GEN-LAST:event_btGuadarActionPerformed

    /**
    * Procedimiento para borrar el texto por defecto al tener el foco.
    * @param evt evento que lo activa
    */
    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        if (CVcliente.SIN_NOMBRE.equals(tfNombre.getText()))
        {
            tfNombre.setText("");
        }
    }//GEN-LAST:event_tfNombreFocusGained

    /**
     * Procedimiento que pone los valores por defecto cuando pierde el foco si est� vacio.
     * @param evt 
     */
    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        if (tfNombre.getText().isEmpty())
        {
            tfNombre.setText(CVcliente.SIN_NOMBRE);
        }
        
    }//GEN-LAST:event_tfNombreFocusLost

    /**
    * Procedimiento para borrar el texto por defecto al tener el foco.
    * @param evt evento que lo activa
    */
    private void tfDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusGained
        if (CVcliente.SIN_DIRECCION.equals(tfDireccion.getText()))
        {
            tfDireccion.setText("");
        }
    }//GEN-LAST:event_tfDireccionFocusGained

    /**
     * Procedimiento que pone los valores por defecto cuando pierde el foco si est� vacio.
     * @param evt 
     */
    private void tfDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusLost
        if (tfDireccion.getText().isEmpty())
        {
            tfDireccion.setText(CVcliente.SIN_DIRECCION);
        }
    }//GEN-LAST:event_tfDireccionFocusLost

    private void btBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBorrarMouseClicked
        
        int opcion = JOptionPane.showConfirmDialog(this,this.TEXTO_BORRAR, TITULO_MENSAJE,JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if (opcion != JOptionPane.YES_OPTION)
            return;         
        
        this.manager.remove(this.cliente);
        this.clientes.remove(this.cliente);
        
        this.cargaDatos();
        
        JOptionPane.showMessageDialog(this,"Campo borrado", TITULO_MENSAJE, JOptionPane.INFORMATION_MESSAGE);
        
        this.indice=0;
        this.cliente= (Ccliente) this.clientes.get(indice);
        this.cargaValores(cliente);
       
    }//GEN-LAST:event_btBorrarMouseClicked

    /**
    * Procedimiento para borrar el texto por defecto al tener el foco.
    * @param evt evento que lo activa
    */
    private void tfCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoFocusGained
        if (CVcliente.SIN_CORREO.equals(tfCorreo.getText()))
        {
            tfCorreo.setText("");
        }
    }//GEN-LAST:event_tfCorreoFocusGained

    /**
     * Procedimiento que pone los valores por defecto cuando pierde el foco si est� vacio.
     * @param evt 
     */
    private void tfCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoFocusLost
        if (tfCorreo.getText().isEmpty())
        {
            tfCorreo.setText(CVcliente.SIN_CORREO);
        }
    }//GEN-LAST:event_tfCorreoFocusLost

    private void btAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAnteriorMouseClicked
        
        indice --;
        
        indice = (this.validaIndice(indice, this.clientes)) ? indice : clientes.size()-1;
                
        this.cliente = (Ccliente) this.clientes.get(indice);
       
        this.cargaValores(this.cliente);
        
    }//GEN-LAST:event_btAnteriorMouseClicked

    
    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
                
        this.cliente =(Ccliente) JOptionPane.showInputDialog(this, CVcliente.SELECCION,CVcliente.TITULO_MENSAJE,JOptionPane.QUESTION_MESSAGE,null, this.clientes.toArray(),null);
        
        if(this.cliente!= null) this.cargaValores(this.cliente);
        
    }//GEN-LAST:event_btBuscarMouseClicked

    
    private void btSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSiguienteMouseClicked
        
        indice ++;
        
        indice = (this.validaIndice(indice, this.clientes)) ? indice : 0;
                
        this.cliente = (Ccliente) this.clientes.get(indice);
       
        this.cargaValores(this.cliente);
    }//GEN-LAST:event_btSiguienteMouseClicked

    
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        this.cliente =  new Ccliente();
        this.cargaValores();
        this.modificando = true;
        this.bloqueaCampos(modificando);
        this.cambiaTextoBotones(modificando);
        this.nuevo = true;
        
    }//GEN-LAST:event_btNuevoActionPerformed

    /**
     * Funcion que permite saber si el indice supera los limites del intervalo
     * @param indice valor del indice
     * @param lista Array list con los valores
     * @return Devuelve true si está dentro.
     */
    private boolean validaIndice(int indice, ArrayList<Object> lista)
    {
        
        return ((indice < lista.size()) && (indice >= 0));
        
    }
     
    private boolean validarTelefono(JTextField campo)
    {
        String text = campo.getText();
        Pattern pattern = Pattern.compile("[0-9]{9}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
    private boolean validarCorreo(JTextField campo)
    {
        String text = campo.getText();
        Pattern pattern = Pattern.compile("[a-z][0-9]@[a-z].[a-z]");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
        
    
    /**
     * Funcion para comprobar que los valores no son los establecidos en el formulario
     * @param campo campo del formulario a comprobar
     * @param cadena texto por defecto de la clase
     * @return devuleve falso si los campos coinciden
     */
    public boolean compruebaCampo(JTextField campo, String cadena)
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
     * Funcion para grabar registro
     */
    private boolean grabaRegistro()
    {
        boolean resultado = false;
        
        this.cliente.setIdFiscal(this.tfNif.getText());
        
        this.cliente.setNombre(this.tfNombre.getText());
        
        this.cliente.setDireccion(this.tfDireccion.getText());
        
        this.cliente.setMail(this.tfCorreo.getText());
        
        this.cliente.setTelefono(Integer.parseInt(this.tfTelefono.getText()));
        
       
        this.manager.getTransaction().begin();
        
        if (this.nuevo)
        {
            System.out.println("Es un nuevo registro");
            this.manager.persist(cliente);
            
        }
        else
        {
            System.out.println("NO es un nuevo registro");
            this.manager.refresh(cliente);
        }
        
        this.manager.getTransaction().commit();
        
        resultado = true;
        
        return resultado; 

    }
    
    /**
     * Procediminto para cambiar los textos de los botones en funcion de si estas modificando o no
     * @param modificando varible para saber si estas editando el formulario.
     */
    private void cambiaTextoBotones(boolean modificando)
    {
        
        if (this.modificando)
        {
            this.btCancelar.setText(CANCELAR);
            this.btGuadar.setText(GUARDAR);
            
        }else{
            
            this.btCancelar.setText(SALIR);
            this.btGuadar.setText(MODIFICAR);
            
        }
        
    }
    
    /**
     * Procedimiento que activa o desactiva la edicion del formulario
     * @param sn parametro que activa o desactiva la edicion del formulario
     */
    private void bloqueaCampos(boolean sn)
    {
        // Este campo es solo informativo
        this.tfID.setEnabled(false);
        
        // Cosas que son igual a moficar
        this.tfDireccion.setEnabled(sn);
        this.tfNombre.setEnabled(sn);
        this.tfNif.setEnabled(sn);
        this.tfCorreo.setEnabled(sn);
        this.tfTelefono.setEnabled(sn); 
        
        // Cosas que son distintas a moficar
        this.panelBusqueda.setVisible(!sn);
        this.btNuevo.setVisible(!sn);
        this.btBorrar.setVisible(!sn);
        
    }
    
    /**
     * Procedimiento para cargar los valores de un sujeto en el formulario
     * @param cliente sujeto que contiene los datos.
     */
    private void cargaValores(Ccliente cliente)
    {
        this.tfID.setText(String.valueOf(cliente.getId()));
        this.tfDireccion.setText(cliente.getDireccion());
        this.tfNif.setText(cliente.getIdFiscal());
        this.tfNombre.setText(cliente.getNombre());
        this.tfCorreo.setText(cliente.getMail());
        this.tfTelefono.setText(String.valueOf(cliente.getTelefono()));
        
    }
    
    /**
     * Procedimiento para cargar los valores por defecto en el formulario
     */
    private void cargaValores()
    {
        
        this.tfID.setText(String.valueOf(CVcliente.SIN_ID));
        this.tfDireccion.setText(CVcliente.SIN_DIRECCION);
        this.tfNif.setText(CVcliente.SIN_DNI);
        this.tfNombre.setText(CVcliente.SIN_NOMBRE);
        this.tfCorreo.setText(CVcliente.SIN_CORREO);
        this.tfTelefono.setText(String.valueOf(CVcliente.SIN_TELEFONO));
        
    }
    
    /**
     * Cargar los clientes desde la base de datos
     */
    private void cargaDatos()
    {
        
        if (manager.isOpen())
        {
            
            this.clientes =null;
            this.clientes =(ArrayList<Object>)this.manager.createNativeQuery("select * from clientes",Ccliente.class).getResultList();
            
            
        }else{
            
            JOptionPane.showMessageDialog(this, VentanaPrincipal.MENSAJE_ERROR,"Error",JOptionPane.WARNING_MESSAGE);
            
            this.dispose();
                    
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
            java.util.logging.Logger.getLogger(CVcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CVcliente().setVisible(true);
            }
        });
    }
    
    
     //variable para saber si estoy modificando
    boolean modificando;
    boolean nuevo;
    
    Ccliente cliente;
        
    private EntityManager manager;
    
    ArrayList<Object> clientes;
    
    int indice;
       
    final static String GUARDAR="Guardar";
    final static String MODIFICAR="Modificar";
    
    final static String SALIR="Salir";
    final static String CANCELAR="Cancelar";
    
    final static String TITULO_MENSAJE="Datos Formulario";
    final static String SELECCION="Seleccione cliente";
    
    static final String SIN_NOMBRE="Escribe un nombre";
    static final String SIN_DIRECCION="Direccion del cliente";
    static final String SIN_DNI="A000000";
    static final int SIN_TELEFONO=999999999;
    static final String SIN_CORREO="DIRECCION@CORREO.ES";
    static final int SIN_ID=0;
   
   
    final String TEXTO_REVISAR="Revise ";
    final String TEXTO_GUARDADO="Registro guardado";
    
    final String TEXTO_BORRAR="¿Está Usted seguro de que desea borrar este registro?";
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGuadar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNif;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTItulo;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelPie;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNif;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
