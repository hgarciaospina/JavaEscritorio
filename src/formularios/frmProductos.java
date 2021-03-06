package formularios;

import clases.Datos;
import clases.Producto;
import clases.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENRY
 */
public class frmProductos extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int proAct = 0;
    private boolean nuevo = false;
    private DefaultTableModel miTabla;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    public frmProductos() {
        //initComponentes pone a false los setEditable --> setEditable(false) 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtIDProducto = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
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
        txtPrecio = new javax.swing.JTextField();
        lblApeliidos = new javax.swing.JLabel();
        lblCamposObligatorios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        cmbIVA = new javax.swing.JComboBox<>();
        lblApeliidos1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/products.png"))); // NOI18N
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

        lblUsuario.setText("ID Producto *:");

        txtIDProducto.setEditable(false);

        lblNombres.setText("Descripción *:");

        txtDescripcion.setEditable(false);

        lblClave.setText("IVA*:");
        lblClave.setToolTipText("");

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

        txtPrecio.setEditable(false);
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblApeliidos.setText("Precio *:");
        lblApeliidos.setToolTipText("");

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

        cmbIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "16%", "19%" }));

        lblApeliidos1.setText("Nota :");
        lblApeliidos1.setToolTipText("");

        txtNota.setColumns(20);
        txtNota.setRows(5);
        jScrollPane2.setViewportView(txtNota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApeliidos1)
                            .addComponent(lblNombres)
                            .addComponent(lblUsuario)
                            .addComponent(lblApeliidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
                                .addGap(78, 78, 78))
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCamposObligatorios)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbIVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblApeliidos)
                        .addComponent(lblClave)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblApeliidos1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblCamposObligatorios)
                .addGap(15, 15, 15)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );

        lblUsuario.getAccessibleContext().setAccessibleName("");
        lblNombres.getAccessibleContext().setAccessibleName("");
        lblClave.getAccessibleContext().setAccessibleName("");
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
        txtIDProducto.setEditable(true);
        txtDescripcion.setEditable(true);
        txtPrecio.setEditable(true);
        txtNota.setEditable(true);
        txtNota.setEnabled(true);
        cmbIVA.setEditable(true);
        
        //Limpiar campos
        txtIDProducto.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtNota.setText("");
        cmbIVA.setSelectedIndex(0);

        //Activamos el flag de registro nuevo
        nuevo = true;

        //Damos foco al campo ID
        txtIDProducto.requestFocusInWindow();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Validaciones
        if (txtIDProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un ID de producto");
            txtIDProducto.requestFocusInWindow();
            return;
        }

        if (txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una descripción)");
            txtDescripcion.requestFocusInWindow();
            return;
        }

        if (txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un precio");
            txtPrecio.requestFocusInWindow();
            return;
        }

        if (!Utilidades.isNumeric(txtPrecio.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un precio númerico");
            txtPrecio.requestFocusInWindow();
            return;
        }

        int precio = Integer.parseInt(txtPrecio.getText());
        if (precio <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un precio mayor a cero");
            txtPrecio.requestFocusInWindow();
            return;
        }

        // Si es nuevo validamos que el producto no exista
        if (nuevo) {
            if (misDatos.existeProducto((txtIDProducto.getText()))) {
                JOptionPane.showMessageDialog(rootPane, "El producto ya existe");
                txtIDProducto.requestFocusInWindow();
                return;
            }
        } else {
            if (!misDatos.existeProducto((txtIDProducto.getText()))) {
                JOptionPane.showMessageDialog(rootPane, "El producto no existe");
                txtIDProducto.requestFocusInWindow();
                return;
            }
        }

        // Creamos el objeto producto y lo agregamos a datos
        Producto miProducto;
        miProducto = new Producto(
                txtIDProducto.getText(),
                txtDescripcion.getText(),
                precio,
                cmbIVA.getSelectedIndex(),
                txtNota.getText());

        String msg;
        if (nuevo) {
            msg = misDatos.agregarProducto(miProducto);
        } else {
            msg = misDatos.modificarProducto(miProducto);
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
        txtIDProducto.setEditable(false);
        txtDescripcion.setEditable(false);
        txtPrecio.setEditable(false);
        cmbIVA.setEditable(false);
        txtNota.setEditable(false);

        //Actualizar cambios en la tabla
        llenarTabla();
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
        txtIDProducto.setEditable(false);
        txtDescripcion.setEditable(false);
        txtPrecio.setEditable(false);
        cmbIVA.setEditable(false);
        txtNota.setEditable(false);

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
        txtDescripcion.setEditable(true);
        txtPrecio.setEditable(true);
        cmbIVA.setEditable(true);
        txtNota.setEditable(true);

        //Desactivamos el flag de registro nuevo
        nuevo = false;

        //Damos foco al campo ID
        txtDescripcion.requestFocusInWindow();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        llenarTabla();
        mostrarRegistro();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        proAct = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        proAct = misDatos.numeroProductos() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        proAct++;
        if (proAct == misDatos.numeroProductos()) {
            proAct = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        proAct--;
        if (proAct == -1) {
            proAct = misDatos.numeroProductos() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "Está seguro de borrar el registro?");
        if (rta != 0) {
            return;
        }
        String msg;
        msg = misDatos.borrarProducto(txtIDProducto.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        proAct = 0;
        //Actualiza cambios en la tabla
        llenarTabla();
        mostrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String producto = JOptionPane.showInputDialog("Ingrese código de producto");
        if (producto.equals("")) {
            return;
        }
    
        if (!misDatos.existeProducto(producto)) {
            JOptionPane.showMessageDialog(rootPane, "Producto no existe");
            return;
        }

        int num = 0;
        num = tblTabla.getRowCount();
        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tblTabla.getValueAt(i, 0)).equals(producto)) {
                proAct = i;
                break;
            }
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostrarRegistro() {
        txtIDProducto.setText(Utilidades.objectToString(tblTabla.getValueAt(proAct, 0)));
        txtDescripcion.setText(Utilidades.objectToString(tblTabla.getValueAt(proAct, 1)));
        txtPrecio.setText(Utilidades.objectToString(tblTabla.getValueAt(proAct, 2)));
        cmbIVA.setSelectedIndex(iva(Utilidades.objectToString(tblTabla.getValueAt(proAct, 3))));
        txtNota.setText(Utilidades.objectToString(tblTabla.getValueAt(proAct, 4)));
    }

    private void llenarTabla() {
        try {
            //´Encabezados de la tabla
            String titulos[] = {"ID Producto", "Descripción", "Precio", "IVA", "Notas"};
            //Datos de la tabla
            String registro[] = new String[5];
            miTabla = new DefaultTableModel(null, titulos);
            ResultSet rs = misDatos.getProductos();
            while (rs.next()) {
                registro[0] = rs.getString("idProducto");
                registro[1] = rs.getString("descripcion");
                registro[2] = rs.getString("precio");
                registro[3] = iva(rs.getInt("idIVA"));
                registro[4] = rs.getString("notas");
                miTabla.addRow(registro);
            }
            tblTabla.setModel(miTabla);
               
            //Alinear campos númericos ala derecha
            DefaultTableCellRenderer tcr = new   DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tblTabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            tblTabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(frmProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String iva(int idIVA) {
        switch (idIVA) {
            case 0:
                return "0%";
            case 1:
                return "10%";
            case 2:
                return "16%";
            case 3:
                return "19%";
            default:
                return "No definido";
        }

    }

    private int iva(String IVA) {
        if (IVA.equals("0%")) {
            return 0;
        } else if (IVA.equals("10%")) {
            return 1;
        } else if (IVA.equals("16%")) {
            return 2;
        } else {
            return 3;
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
    private javax.swing.JComboBox<String> cmbIVA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApeliidos;
    private javax.swing.JLabel lblApeliidos1;
    private javax.swing.JLabel lblCamposObligatorios;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
