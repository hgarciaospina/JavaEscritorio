/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Datos2;
import clases.Usuario;
import clases.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENRY
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    private Datos2 misDatos2;
    private int usuAct = 0;
    private boolean nuevo = false;
    private DefaultTableModel miTabla;
       
    public void setDatos2(Datos2 misDatos2){
        this.misDatos2 = misDatos2;
    }
    public frmUsuarios() {
       //initComponentes pone a false los setEditable --> setEditable(false) 
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        cmbPerfil = new javax.swing.JComboBox<>();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();
        txtApellidos = new javax.swing.JTextField();
        lblApeliidos = new javax.swing.JLabel();
        lblConfirmacion = new javax.swing.JLabel();
        lblCamposObligatorios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuarios");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblUsuario.setText("ID Usuario *:");

        txtIDUsuario.setEditable(false);

        lblNombres.setText("Nombres *:");

        txtNombres.setEditable(false);

        lblClave.setText("Clave *:");
        lblClave.setToolTipText("");

        lblPerfil.setText("Perfil *:");
        lblPerfil.setToolTipText("");

        txtConfirmacion.setEditable(false);

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones un perfil", "Administrador", "Empleado" }));

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/primero.png"))); // NOI18N
        btnPrimero.setToolTipText("Ir al primer registro");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anterior.png"))); // NOI18N
        btnAnterior.setToolTipText("Ir al anterior registro");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ultimo.png"))); // NOI18N
        btnUltimo.setToolTipText("Ir al último registro");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proximo.png"))); // NOI18N
        btnSiguiente.setToolTipText("Ir al próximo registro");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar registro");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar registro");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        btnBorrar.setToolTipText("Eliminar registro");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Grabar registro");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar acción");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtClave.setEditable(false);

        txtApellidos.setEditable(false);

        lblApeliidos.setText("Apellidos *:");
        lblApeliidos.setToolTipText("");

        lblConfirmacion.setText("Confirmación *:");

        lblCamposObligatorios.setForeground(new java.awt.Color(0, 102, 255));
        lblCamposObligatorios.setText("* Campos obligatorios");
        lblCamposObligatorios.setToolTipText("");

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblCamposObligatorios)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombres)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblApeliidos)
                                    .addComponent(lblClave))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPerfil)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombres)
                                    .addComponent(txtApellidos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                        .addComponent(lblConfirmacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerfil)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApeliidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmacion)
                    .addComponent(lblClave))
                .addGap(18, 18, 18)
                .addComponent(lblCamposObligatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        lblUsuario.getAccessibleContext().setAccessibleName("");
        lblNombres.getAccessibleContext().setAccessibleName("");
        lblClave.getAccessibleContext().setAccessibleName("");
        lblPerfil.getAccessibleContext().setAccessibleName("");
        btnPrimero.getAccessibleContext().setAccessibleDescription("");
        btnAnterior.getAccessibleContext().setAccessibleDescription("");
        btnUltimo.getAccessibleContext().setAccessibleDescription("");
        btnSiguiente.getAccessibleContext().setAccessibleDescription("");
        btnModificar.getAccessibleContext().setAccessibleDescription("");
        btnBuscar.getAccessibleContext().setAccessibleDescription("");
        btnNuevo.getAccessibleContext().setAccessibleDescription("");
        btnBorrar.getAccessibleContext().setAccessibleDescription("");
        btnGuardar.getAccessibleContext().setAccessibleDescription("");
        lblApeliidos.getAccessibleContext().setAccessibleName("");
        lblConfirmacion.getAccessibleContext().setAccessibleName("");
        lblCamposObligatorios.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       //Habilita los botones
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
       
        //Habilita campos
        txtIDUsuario.setEditable(true);
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        txtClave.setEditable(true);
        txtConfirmacion.setEditable(true);
        cmbPerfil.setEditable(true);
      
        //Limpiar campos
        txtIDUsuario.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtClave.setText("");
        txtConfirmacion.setText("");
        cmbPerfil.setSelectedIndex(0);
        
        //Activamos el flag de registro nuevo
        nuevo = true;
        
        //Damos foco al campo ID
        txtIDUsuario.requestFocusInWindow();
              
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Validaciones
        if (txtIDUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un ID (nombre de usuario)");
            txtIDUsuario.requestFocusInWindow();
            return;
        }
        
        if (cmbPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un perfil");
            cmbPerfil.requestFocusInWindow();
            return;
        }
        
        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un nombre(s)");
            txtNombres.requestFocusInWindow();
            return;
        }
        
        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un apellido(s)");
            txtApellidos.requestFocusInWindow();
            return;
        }
        
        String clave = new String(txtClave.getPassword());
        String confirmacion = new String(txtConfirmacion.getPassword());
        
        if (clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una clave");
            txtClave.requestFocusInWindow();
            return;
        }
        
        if (confirmacion.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una clave de confirmación ");
            txtConfirmacion.requestFocusInWindow();
            return;
        }
        
        if (!clave.equals(confirmacion)) {
            JOptionPane.showMessageDialog(rootPane, "La clave y la confirmacion deben ser iguales");
            txtClave.setText("");
            txtConfirmacion.setText("");
            txtClave.requestFocusInWindow();
            return;
        }
        
        // Si es nuevo validamos que el usuario no exista
        if (nuevo) {
            if (misDatos2.existeUsuario(txtIDUsuario.getText())) {
                JOptionPane.showMessageDialog(rootPane, "El usuario ya existe");
                txtIDUsuario.requestFocusInWindow();
                return;
            }
        } else {    
            if (!misDatos2.existeUsuario(txtIDUsuario.getText())) {
                JOptionPane.showMessageDialog(rootPane, "El usuario no existe");
                txtIDUsuario.requestFocusInWindow();
                return;
            }    
        }
        
        // Creamos el objeto usuario y lo agregamos a datos
        Usuario miUsuario = new Usuario(
                txtIDUsuario.getText(),
                txtNombres.getText(),
                txtApellidos.getText(),
                clave,
                cmbPerfil.getSelectedIndex());
        
        String msg;
        if (nuevo) {
            msg = misDatos2.agregarUsuario(miUsuario);
        } else{
             msg = misDatos2.modificarUsuario(miUsuario);  
        }
  
        JOptionPane.showMessageDialog(rootPane, msg);
        
        //Deshabilita botones
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnBuscar.setEnabled(true); 
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        //Deshabilita campos
        txtIDUsuario.setEditable(false);
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        txtClave.setEditable(false);
        txtConfirmacion.setEditable(false);
        cmbPerfil.setEditable(false);
        
        //Actualizar cambios en la tabla
        llenarTabla();
        
       /* //Limpiar campos
        txtIDUsuario.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtClave.setText("");
        txtConfirmacion.setText("");
        cmbPerfil.setSelectedIndex(0); */
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Habilita botones
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnBuscar.setEnabled(true); 
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        //Deshabilita campos
        txtIDUsuario.setEditable(false);
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        txtClave.setEditable(false);
        txtConfirmacion.setEditable(false);
        cmbPerfil.setEditable(false);
        
        mostrarRegistro();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       //Habilita los botones
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        //Habilita campos
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        txtClave.setEditable(true);
        txtConfirmacion.setEditable(true);
        cmbPerfil.setEditable(true);
        
        //Desactivamos el flag de registro nuevo
        nuevo = false;
        
        //Damos foco al campo ID
        txtNombres.requestFocusInWindow();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        llenarTabla();
        mostrarRegistro();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        usuAct = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        usuAct = misDatos2.numeroUsuarios() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        usuAct++;
        if (usuAct == misDatos2.numeroUsuarios()) {
            usuAct = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        usuAct--;
        if (usuAct == -1) {
            usuAct = misDatos2.numeroUsuarios() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "Está seguro de borrar el registro?");
        if (rta != 0) {
            return;
        }
        String msg;
        msg = misDatos2.borrarUsuario(txtIDUsuario.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        usuAct = 0;
        mostrarRegistro();
        
        //Actualiza cambios en la tabla
        llenarTabla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String usuario  = JOptionPane.showInputDialog("Ingrese código de usuario");
        if (usuario.equals("")) {
            return;
        }
        if (!misDatos2.existeUsuario(usuario)){
            JOptionPane.showMessageDialog(rootPane, "Usuario no existe");
            return;
        }
        
        int num = 0;
        num = tblTabla.getRowCount();
        for (int i = 0; i < num; i++) {
            if(Utilidades.objectToString(tblTabla.getValueAt(i, 0)).equals(usuario)) {
                usuAct = i;
            }
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostrarRegistro(){
        txtIDUsuario.setText(Utilidades.objectToString(tblTabla.getValueAt(usuAct, 0)));
        txtNombres.setText(Utilidades.objectToString(tblTabla.getValueAt(usuAct, 1)));
        txtApellidos.setText(Utilidades.objectToString(tblTabla.getValueAt(usuAct, 2)));
        txtClave.setText("");
        txtConfirmacion.setText("");
        cmbPerfil.setSelectedIndex(perfil(Utilidades.objectToString(tblTabla.getValueAt(usuAct, 3))));
    }
    
    private void llenarTabla() {
        try {
            //´Encabezados de la tabla
            String titulos[] = { "ID Usuario", "Nombres", "Apellidos", "Clave", "Perfil"};
            //Datos de la tabla
            String registro[] = new String[5];
            miTabla = new DefaultTableModel(null, titulos);
            ResultSet rs = misDatos2.getUsuarios();
            while (rs.next()) {
                registro[0] = rs.getString("idUsuario");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");
                registro[3] = rs.getString("clave");
                registro[4] = perfil(rs.getInt("idPerfil"));
                miTabla.addRow(registro);
            }
            tblTabla.setModel(miTabla);
            //Ocultammos el campo clave
            tblTabla.getColumnModel().getColumn(3).setMaxWidth(0);
            tblTabla.getColumnModel().getColumn(3).setMinWidth(0);
            tblTabla.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
            tblTabla.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);        
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String perfil(int idPerfil) {
        if(idPerfil == 1){
            return "Administrador";
        } 
        else {
            return "Empleado";
        }
    }
    
    private int perfil(String idPerfil) {
        if(idPerfil.equals("Administrador")){
            return 1;
        } 
        else {
            return 2;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApeliidos;
    private javax.swing.JLabel lblCamposObligatorios;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblConfirmacion;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
