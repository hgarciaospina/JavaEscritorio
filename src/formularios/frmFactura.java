/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Datos;
import clases.Opcion;
import clases.Producto;
import clases.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
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
public class frmFactura extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private DefaultTableModel miTabla;
    
    public void setDatos(Datos misDatos){
        this.misDatos = misDatos;
    }
    
    public frmFactura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        lblProducto = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        lblFecha1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        lblTotales = new javax.swing.JLabel();
        txtTotalCantidad = new javax.swing.JTextField();
        txtTotalValor = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nueva Factura");
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

        lblFecha.setText("Fecha:");

        txtFecha.setEnabled(false);

        lblCliente.setText("Cliente:");

        lblProducto.setText("Producto:");

        btnBuscarCliente.setText("....");
        btnBuscarCliente.setToolTipText("Busca un cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("....");
        btnBuscarProducto.setToolTipText("Busca un producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        lblFecha1.setText("Cantidad:");

        btnEliminar.setToolTipText("Elimina producto de la factura");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        btnAdicionar.setToolTipText("Adiciona producto a la factura");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEliminarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        btnEliminarTodo.setToolTipText("Eliminar todos los producto de la factura");
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grabarfactura.png"))); // NOI18N
        btnGrabar.setToolTipText("Graba la factura");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetalle);

        lblTotales.setText("Totales:");

        txtTotalCantidad.setEditable(false);
        txtTotalCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtTotalValor.setEditable(false);
        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbProducto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdicionar, btnEliminar, btnEliminarTodo, btnGrabar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtTotalCantidad, txtTotalValor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblFecha1)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEliminarTodo)
                    .addComponent(btnGrabar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotales)
                    .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtTotalCantidad, txtTotalValor});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            //Cargamos clientes en el combobox desde la base de datos
            Opcion opc = new Opcion("NA", "Seleccione un cliente...");
            cmbCliente.addItem(opc);
            ResultSet rsCli = misDatos.getClientes();
            while(rsCli.next()){
                opc = new Opcion(
                        rsCli.getString("idCliente"),
                        rsCli.getString("nombres") + " "
                        + rsCli.getString("apellidos"));
                cmbCliente.addItem(opc);
            }
            
            //Cargamos productos en el combobox desde la base de datos
            opc = new Opcion("NA", "Seleccione un producto...");
            cmbProducto.addItem(opc);
            ResultSet rsPro = misDatos.getProductos();
            while(rsPro.next()){
                opc = new Opcion(
                        rsPro.getString("idProducto"),
                        rsPro.getString("descripcion"));
                cmbProducto.addItem(opc);
            }
            
            //Cargamos la fecha del sistema
            txtFecha.setText(Utilidades.formatDate(new Date()));
            //Mostramos totales en ceros
            txtTotalCantidad.setText("0");
            txtTotalValor.setText("0");
            //Formateamos la tabla
            llenarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (cmbProducto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Debe selecconar un producto");
            cmbProducto.requestFocus();
            return;
        }
        
        if (txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Debe ingresar una cantidad");
            txtCantidad.requestFocus();
            return;
        }
          
        if (!Utilidades.isNumeric(txtCantidad.getText())){
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una cantidad númerica");
            txtCantidad.setText("");
            txtCantidad.requestFocusInWindow();
            return;
        } 
        
        int cantidad = Integer.parseInt(txtCantidad.getText());
        if (cantidad <= 0){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una cantidad mayor a cero");
            txtCantidad.setText("");
            txtCantidad.requestFocusInWindow();
            return;
        } 
        
        //Buscamos los datos del producto seleccionado
        Producto miProducto = 
                misDatos.getProducto(((Opcion)cmbProducto.getSelectedItem()).getValor());
        
        //Adicionamos el producto a la tabla
        String registro[] = new String[5];
        registro[0] = miProducto.getIdProducto();
        registro[1] = miProducto.getDescripcion();
        //El precio es númerico lo concatenamos con ""  para converirlo a string
        registro[2] = "" + miProducto.getPrecio();
        registro[3] = "" + cantidad;
        //Calculamos el valor de la compra que es igual a la cantidad * precio del producto
        registro[4] = "" + (cantidad * miProducto.getPrecio());
        miTabla.addRow(registro);
        
        //Inicializamos campos
        cmbProducto.setSelectedIndex(0);
        txtCantidad.setText("");
        cmbProducto.requestFocusInWindow();
        
        //cada vez que adicionamos una línea de detalle actualizamos totales
        totales();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Debe seleccionar un cliente");
            cmbCliente.requestFocusInWindow();
            return;
        }
        //Antes debemos de validar de que txtTotalCantidad no venga vació 
        if (!txtTotalCantidad.getText().isEmpty()) {
            //Convertimos la cantidad ingresada en txtTotalCantidad en entero
             int totCan = new Integer(txtTotalCantidad.getText());
            if ((totCan == 0)) {
                JOptionPane.showMessageDialog(rootPane, 
                        "Debe de ingresar detalles de la factura");
                cmbProducto.requestFocusInWindow();
                return;
            }
        }
        
        int rta = JOptionPane.showConfirmDialog(rootPane, 
                "Está seguro de grabar esta factura?");
        if (rta != 0) {
            return;
        }
        
        //Adicionamos un consecutivo a la factura
        int numFac = misDatos.getNumFac();
        
        //Encabezado de factura
        misDatos.agregarFactura(
            numFac,
            ((Opcion) cmbCliente.getSelectedItem()).getValor(),
            new Date());
              
        //Detalle de factura
        int num = 0;
        num = tblDetalle.getRowCount();
        for (int i = 0; i < num; i++) {
            misDatos.agregarDetalleFactura(
                    numFac, 
                    i+1,
                    Utilidades.objectToString(tblDetalle.getValueAt(i, 0)),
                    Utilidades.objectToString(tblDetalle.getValueAt(i, 1)),
                    Utilidades.objectToInt(tblDetalle.getValueAt(i, 2)),
                    Utilidades.objectToInt(tblDetalle.getValueAt(i, 3)));
        } 
        JOptionPane.showMessageDialog(rootPane, 
              "Factura: " + numFac + " generada con éxito");
        
        //Inicializamos campos
        cmbCliente.setSelectedIndex(0);
        limpiarTabla(); //Borra los registros de detalles de la tabla
        totales(); //Dejamos lo totales en cero (0)
        cmbCliente.requestFocusInWindow(); //Colocamos el foco en el combo clientes
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, 
                "Está seguro de eliminar los detalles de la factura?");
        if (rta != 0) {
            return;
        }
        limpiarTabla();
        totales();
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (cmbProducto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Debe selecconar un producto");
            cmbProducto.requestFocus();
            return;
        }
        try {
            DefaultTableModel modelo=(DefaultTableModel) tblDetalle.getModel();
            int filas=tblDetalle.getRowCount();
            for (int i = 0;filas>i; i++) {
                String idTabla = Utilidades.objectToString(tblDetalle.getValueAt(i, 0));
                String idCombo = ((Opcion)cmbProducto.getSelectedItem()).getValor();
                if (idTabla.equals(idCombo)) {
                   modelo.removeRow(i);
                   //Actualizamos totales
                    totales();
                   return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        frmBusquedaCliente miBusqueda = new frmBusquedaCliente(null, closable);
        miBusqueda.setDatos(misDatos);
        miBusqueda.setLocationRelativeTo(null);
        miBusqueda.setVisible(true);
        //Devuelve el dato id del cliente seleccionado en la búsqueda
        String rta = miBusqueda.getRespuesta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbCliente.getItemCount(); i++) {
            if (((Opcion)cmbCliente.getItemAt(i)).getValor().equals(rta)) {
                cmbCliente.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        frmBusquedaProducto miBusqueda = new frmBusquedaProducto(null, closable);
        miBusqueda.setDatos(misDatos);
        miBusqueda.setLocationRelativeTo(null);
        miBusqueda.setVisible(true);
        //Devuelve el dato id del cliente seleccionado en la búsqueda
        String rta = miBusqueda.getRespuesta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbProducto.getItemCount(); i++) {
            if (((Opcion)cmbProducto.getItemAt(i)).getValor().equals(rta)) {
                cmbProducto.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox<Object> cmbCliente;
    private javax.swing.JComboBox<Object> cmbProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTotales;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotalCantidad;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables
    
    private void llenarTabla() {
        //´Encabezados de la tabla
        String titulos[] = { "ID Producto", "Descripción", "Precio", "Cantidad",
            "Valor"};
        miTabla = new DefaultTableModel(null, titulos);
        tblDetalle.setModel(miTabla);
        
        //Alinear campos númericos a la derecha 
        DefaultTableCellRenderer tcr = new   DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetalle.getColumnModel().getColumn(2).setCellRenderer(tcr);
        tblDetalle.getColumnModel().getColumn(3).setCellRenderer(tcr);
        tblDetalle.getColumnModel().getColumn(4).setCellRenderer(tcr);
    }   
    
    private void totales(){
        int num = 0;
        int sumCan = 0;
        int sumVal = 0;
        num = tblDetalle.getRowCount();
        for (int i = 0; i < num; i++) {
            //Convertimos a entero para poder sumar las cantidades
            sumCan += Utilidades.objectToInt(tblDetalle.getValueAt(i, 3));
            //Convertimos a entero para poder sumar los valores de los productos comprados
            sumVal += Utilidades.objectToInt(tblDetalle.getValueAt(i, 4));
        }
        //Concatenamos a sumCan con "" para convertirlo a String y poderlo mostrar en txtTotalCantidad
        txtTotalCantidad.setText("" + sumCan);
        txtTotalValor.setText("" + sumVal);
    }
    
    public void limpiarTabla(){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tblDetalle.getModel();
            int filas=tblDetalle.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

