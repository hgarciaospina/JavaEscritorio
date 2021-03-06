package formularios;

import clases.Cliente;
import clases.Datos;
import clases.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENRY
 */
public class frmClientes extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int cliAct = 0;
    private boolean nuevo = false;
    private DefaultTableModel miTabla;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    public frmClientes() {
        //initComponentes pone a false los setEditable --> setEditable(false) 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDCliente = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblTipoID = new javax.swing.JLabel();
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
        txtApellidos = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        lblCamposObligatorios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        cmbTipoID = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        lblCiudad = new javax.swing.JLabel();
        lblFechaNacmiento = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        dchfechaNacimiento = new com.toedter.calendar.JDateChooser();
        dchfechaIngreso = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customers.png"))); // NOI18N
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

        lblIDCliente.setText("ID Cliente *:");

        txtIDCliente.setEditable(false);

        lblNombres.setText("Nombres *:");

        txtNombres.setEditable(false);

        lblTipoID.setText("Tipo Identificación*:");
        lblTipoID.setToolTipText("");

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

        txtApellidos.setEditable(false);
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblApellidos.setText("Apellidos *:");
        lblApellidos.setToolTipText("");

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

        cmbTipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un documento...", "Cédula de Ciudadanía", "NIT", "Tarjeta de Identidad", "Registro Civil", "Cédula de extranjería", "Pasaporte", " " }));

        txtDireccion.setEditable(false);
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblDireccion.setText("Dirección   :");
        lblDireccion.setToolTipText("");

        txtTelefono.setEditable(false);
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelefono.setText("Telefóno     :");
        lblTelefono.setToolTipText("");

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una ciudad...", "Arauca", "Armenia", "Barranquilla", "Bogotá", "Bucaramanga", "Cali", "Cartagena de Indias", "Florencia", "Ibagué", "Inírida", "Leticia", "Manizales", "Medellín", "Mitú", "Mocoa", "Montería", "Neiva", "Pasto", "Pereira", "Popayán", "Puerto Carreño", "Quibdó", "Riohacha", "San Andrés", "Cúcuta", "San José del Guaviare", "Santa Marta", "Sincelejo", "Tunja", "Valledupar", "Villavicencio", "Yopal" }));

        lblCiudad.setText("Ciudad   *:");
        lblCiudad.setToolTipText("");

        lblFechaNacmiento.setText("Fecha nacimiento:");
        lblFechaNacmiento.setToolTipText("");

        lblFechaIngreso.setText("Fecha ingreso :");
        lblFechaIngreso.setToolTipText("");

        dchfechaNacimiento.setEnabled(false);

        dchfechaIngreso.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCamposObligatorios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombres, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIDCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaNacmiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTipoID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dchfechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(lblCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(lblFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dchfechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(21, Short.MAX_VALUE))))
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
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDCliente)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoID)
                            .addComponent(cmbTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombres)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefono)
                            .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCiudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFechaNacmiento)
                                .addComponent(lblFechaIngreso, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(dchfechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dchfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lblCamposObligatorios)
                .addGap(8, 8, 8)
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        lblIDCliente.getAccessibleContext().setAccessibleName("");
        lblNombres.getAccessibleContext().setAccessibleName("");
        lblTipoID.getAccessibleContext().setAccessibleName("");
        btnPrimero.getAccessibleContext().setAccessibleDescription("");
        btnAnterior.getAccessibleContext().setAccessibleDescription("");
        btnUltimo.getAccessibleContext().setAccessibleDescription("");
        btnSiguiente.getAccessibleContext().setAccessibleDescription("");
        btnModificar.getAccessibleContext().setAccessibleDescription("");
        btnBuscar.getAccessibleContext().setAccessibleDescription("");
        btnNuevo.getAccessibleContext().setAccessibleDescription("");
        btnBorrar.getAccessibleContext().setAccessibleDescription("");
        btnGuardar.getAccessibleContext().setAccessibleDescription("");
        lblApellidos.getAccessibleContext().setAccessibleName("");
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
        txtIDCliente.setEditable(true);
        cmbTipoID.setEditable(true);
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        txtDireccion.setEditable(true);
        txtTelefono.setEditable(true);
        cmbCiudad.setEditable(true);
        dchfechaNacimiento.setEnabled(true);

        //Limpiar campos
        txtIDCliente.setText("");
        cmbTipoID.setSelectedIndex(0);
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        cmbCiudad.setSelectedIndex(0);
        dchfechaNacimiento.setDate(new Date());
        dchfechaIngreso.setDate(new Date());
        //Activamos el flag de registro nuevo
        nuevo = true;

        //Damos foco al campo ID
        txtIDCliente.requestFocusInWindow();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Validaciones
        if (txtIDCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Debe digitar un ID de cliente");
            txtIDCliente.requestFocusInWindow();
            return;
        }

        if (cmbTipoID.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Debe de seleccionar un tipo de identificación");
            cmbTipoID.requestFocusInWindow();
            return;
        }

        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Debe digitar un nombre(s))");
            txtNombres.requestFocusInWindow();
            return;
        }

        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Debe digitar un apellido(s)");
            txtApellidos.requestFocusInWindow();
            return;
        }

        if (dchfechaNacimiento.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane,
                    "La fecha de nacimiento debe de ser anterior a la fecha actual");
            dchfechaNacimiento.requestFocusInWindow();
            return;
        }

        // Si es nuevo validamos que el cliente no exista
        if (nuevo) {
            if (misDatos.existeCliente(txtIDCliente.getText())) {
                JOptionPane.showMessageDialog(rootPane,
                        "El cliente ya existe");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        } else {
            if (!misDatos.existeCliente(txtIDCliente.getText())) {
                JOptionPane.showMessageDialog(rootPane,
                        "El cliente no existe");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        }

        // Creamos el objeto cliente y lo agregamos a datos
        Cliente miCliente;
        miCliente = new Cliente(
                txtIDCliente.getText(),
                cmbTipoID.getSelectedIndex(),
                txtNombres.getText(),
                txtApellidos.getText(),
                txtDireccion.getText(),
                txtTelefono.getText(),
                cmbCiudad.getSelectedIndex(),
                dchfechaNacimiento.getDate(),
                dchfechaIngreso.getDate());

        String msg;
        if (nuevo) {
            msg = misDatos.agregarCliente(miCliente);
        } else {
            msg = misDatos.modificarCliente(miCliente);
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
        txtIDCliente.setEditable(false);
        cmbTipoID.setEditable(false);
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        txtDireccion.setEditable(false);
        txtTelefono.setEditable(false);
        cmbCiudad.setEditable(false);
        dchfechaNacimiento.setEnabled(false);
        dchfechaIngreso.setEnabled(false);

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
        txtIDCliente.setEditable(false);
        cmbTipoID.setEditable(false);
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        txtDireccion.setEditable(false);
        txtTelefono.setEditable(false);
        cmbCiudad.setEditable(false);
        dchfechaNacimiento.setEnabled(false);
        dchfechaIngreso.setEnabled(false);

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
        cmbTipoID.setEditable(true);
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        txtDireccion.setEditable(true);
        txtTelefono.setEditable(true);
        cmbCiudad.setEditable(true);
        dchfechaNacimiento.setEnabled(true);

        //Desactivamos el flag de registro nuevo
        nuevo = false;

        //Damos foco al campo ID
        cmbTipoID.requestFocusInWindow();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        llenarTabla();
        mostrarRegistro();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        cliAct = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        cliAct = misDatos.numeroClientes() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        cliAct++;
        if (cliAct == misDatos.numeroClientes()) {
            cliAct = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        cliAct--;
        if (cliAct == -1) {
            cliAct = misDatos.numeroClientes() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "Está seguro de borrar el registro?");
        if (rta != 0) {
            return;
        }
        String msg;
        msg = misDatos.borrarCliente((txtIDCliente.getText()));
        JOptionPane.showMessageDialog(rootPane, msg);
        cliAct = 0;
        //Actualiza cambios en la tabla
        llenarTabla();
        mostrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cliente = JOptionPane.showInputDialog("Ingrese código del cliente");
        if (cliente.equals("")) {
            return;
        }
        if (!misDatos.existeCliente(cliente)) {
            JOptionPane.showMessageDialog(rootPane, "Cliente no existe");
            return;
        }

        int num = 0;
        num = tblTabla.getRowCount();
        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tblTabla.getValueAt(i, 0)).equals(cliente)) {
                cliAct = i;
                break;
            }
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostrarRegistro() {
        txtIDCliente.setText(Utilidades.objectToString(tblTabla.getValueAt(cliAct, 0)));
        cmbTipoID.setSelectedIndex(tipoID(Utilidades.objectToString(tblTabla.getValueAt(cliAct, 1))));
        txtNombres.setText(Utilidades.objectToString(tblTabla.getValueAt(cliAct, 2)));
        txtApellidos.setText(Utilidades.objectToString(tblTabla.getValueAt(cliAct, 3)));
        txtDireccion.setText(Utilidades.objectToString(tblTabla.getValueAt(cliAct, 4)));
        txtTelefono.setText(Utilidades.objectToString(tblTabla.getValueAt(cliAct, 5)));
        cmbCiudad.setSelectedIndex(ciudad(Utilidades.objectToString(tblTabla.getValueAt(cliAct, 6))));
        dchfechaNacimiento.setDate(Utilidades.objectToDate(tblTabla.getValueAt(cliAct, 7)));
        dchfechaIngreso.setDate(Utilidades.objectToDate(tblTabla.getValueAt(cliAct, 8)));
    }

    private void llenarTabla() {
        try {
            //´Encabezados de la tabla
            String titulos[] = {"ID Cliente", "Tipo ID", "Nombres", "Apellidos",
                "Dirección", "Teléfono", "Ciudad", "F. Nacimiento", "F. Ingreso"};
            //Datos de la tabla
            String registro[] = new String[9];
            miTabla = new DefaultTableModel(null, titulos);
            ResultSet rs = misDatos.getClientes();
            while (rs.next()) {
                registro[0] = rs.getString("idCliente");
                registro[1] = tipoID(rs.getInt("idTipo"));
                registro[2] = rs.getString("nombres");
                registro[3] = rs.getString("apellidos");;
                registro[4] = rs.getString("direccion");
                registro[5] = rs.getString("telefono");
                registro[6] = ciudad(rs.getInt("idCiudad"));
                registro[7] = rs.getString("fechaNacimiento");
                registro[8] = rs.getString("fechaIngreso");
                miTabla.addRow(registro);
            }
            tblTabla.setModel(miTabla);
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String tipoID(int id) {
        switch (id) {
            case 1:
                return "Cédula de ciudadanía";
            case 2:
                return "NIT";
            case 3:
                return "Tarjeta de identidad";
            case 4:
                return "Registro Cívil";
            case 5:
                return "Cédula de extranjería";
            case 6:
                return "Pasaporte";
            default:
                return "No definido";
        }
    }
    
    private int tipoID(String tipo) {
        if(tipo.equals("Cédula de ciudadanía")) return 1;
        else if(tipo.equals("NIT")) return 2;
        else if(tipo.equals("Tarjeta de identidad")) return 3;
        else if(tipo.equals("Registro Cívil")) return 4;
        else if(tipo.equals("Cédula de extranjería")) return 5;
        else return 6;
    }
    
    private String ciudad(int id) {
        switch (id) {
            case 1:
                return "Arauca";
            case 2:
                return "Armenia";
            case 3:
                return "Barranquilla";
            case 4:
                return "Bogotá";
            case 5:
                return "Bucaramanga";
            case 6:
                return "Cali";
            case 7:
                return "Cartagena de Indias";
            case 8:
                return "Cúcuta";
            case 9:
                return "Florencia";
            case 10:
                return "Ibagué";
            case 11:
                return "Inírida";
            case 12:
                return "Leticia";
            case 13:
                return "Manizales";
            case 14:
                return "Medellín";
            case 15:
                return "Mitú";
            case 16:
                return "Mocoa";
            case 17:
                return "Montería";
            case 18:
                return "Neiva";
            case 19:
                return "Pasto";
            case 20:
                return "Popayán";
            case 21:
                return "Puerto Carreño";
            case 22:
                return "Quibdó";
            case 23:
                return "Riohacha";
            case 24:
                return "San Andrés";
            case 25:
                return "San José del Guaviare";
            case 26:
                return "Santa Marta";
            case 27:
                return "Sincelejo";
            case 28:
                return "Tunja";
            case 29:
                return "Valledupar";
            case 30:
                return "Villavicencio";
            case 31:
                return "Yopal";
            default:
                return "No definido";
        }
    }
    
    private int ciudad(String nombre) {
        switch (nombre) {
            case "Arauca":
                return 1;
            case "Armenia":
                return 2;
            case "Barranquilla":
                return 3;
            case "Bogotá":
                return 4;
            case "Bucaramanga":
                return 5;
            case "Cali":
                return 6;
            case "Cartagena de Indias":
                return 7;
            case "Cúcuta":
                return 8;
            case "Florencia":
                return 9;
            case "Ibagué":
                return 10;
            case "Inírida":
                return 11;
            case "Leticia":
                return 12;
            case  "Manizales":
                return 13;
            case "Medellín":
                return 14;
            case "Mitú":
                return 15;
            case "Mocoa":
                return 16;
            case "Montería":
                return 17;
            case "Neiva":
                return 18;
            case "Pasto":
                return 19;
            case "Popayán":
                return 20;
            case "Puerto Carreño":
                return 21;
            case "Quibdó":
                return 22;
            case "Riohacha":
                return 23;
            case "San Andrés":
                return 24;
            case "San José del Guaviare":
                return 25;
            case "Santa Marta":
                return 26;
            case "Sincelejo":
                return 27;
            case "Tunja":
                return 28;
            case "Valledupar":
                return 29;
            case "Villavicencio":
                return 30;
            case "Yopal":
                return 31;
            default:
                return 32;
        }
    }

    private String perfil(int idPerfil) {
        if (idPerfil == 1) {
            return "Administrador";
        } else {
            return "Empleado";
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
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbTipoID;
    private com.toedter.calendar.JDateChooser dchfechaIngreso;
    private com.toedter.calendar.JDateChooser dchfechaNacimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCamposObligatorios;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaNacmiento;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoID;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
