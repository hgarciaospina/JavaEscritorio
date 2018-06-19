package formularios;

import clases.Datos;
import clases.Opcion;
import clases.Reporte;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HENRY
 */
public class frmReporteFacturas extends javax.swing.JInternalFrame {

    Datos misDatos;
    
    public void setDatos(Datos misDatos){
        this.misDatos = misDatos;
    }
    
    public frmReporteFacturas() {
        initComponents();
        //Se agrupan los botones mediante bgrTipoBusqueda para que sean excluyentes
        bgrTipo.add(rbtTodo);
        bgrTipo.add(rbtSeleccion);
        
        bgrFiltro.add(rbtFecha);
        bgrFiltro.add(rbtFactura);
        bgrFiltro.add(rbtCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrFiltro = new javax.swing.ButtonGroup();
        bgrTipo = new javax.swing.ButtonGroup();
        lblArchivo = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        btnSeleccionArchivo = new javax.swing.JButton();
        rbtFecha = new javax.swing.JRadioButton();
        rbtFactura = new javax.swing.JRadioButton();
        rbtCliente = new javax.swing.JRadioButton();
        rbtTodo = new javax.swing.JRadioButton();
        rbtSeleccion = new javax.swing.JRadioButton();
        lblInicial = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();
        dchFechaInicial = new com.toedter.calendar.JDateChooser();
        dchFechaFinal = new com.toedter.calendar.JDateChooser();
        lblFacturaInicial = new javax.swing.JLabel();
        lblFacturaFinal = new javax.swing.JLabel();
        cmbFacturaInicial = new javax.swing.JComboBox<>();
        cmbFacturaFinal = new javax.swing.JComboBox<>();
        lblClienteInicial = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        btnGenerarReporte = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Reporte Facturas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportes.png"))); // NOI18N
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

        lblArchivo.setText("Archivo:");

        txtArchivo.setText("Reporte");

        btnSeleccionArchivo.setText("...");
        btnSeleccionArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionArchivoActionPerformed(evt);
            }
        });

        rbtFecha.setForeground(new java.awt.Color(255, 0, 0));
        rbtFecha.setSelected(true);
        rbtFecha.setText("Fecha");
        rbtFecha.setEnabled(false);
        rbtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFechaActionPerformed(evt);
            }
        });

        rbtFactura.setForeground(new java.awt.Color(255, 0, 0));
        rbtFactura.setText("Número de Factura");
        rbtFactura.setEnabled(false);
        rbtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFacturaActionPerformed(evt);
            }
        });

        rbtCliente.setForeground(new java.awt.Color(255, 0, 0));
        rbtCliente.setText("Cliente");
        rbtCliente.setEnabled(false);
        rbtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtClienteActionPerformed(evt);
            }
        });

        rbtTodo.setForeground(new java.awt.Color(0, 0, 204));
        rbtTodo.setSelected(true);
        rbtTodo.setText("Todas");
        rbtTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTodoActionPerformed(evt);
            }
        });

        rbtSeleccion.setForeground(new java.awt.Color(0, 0, 204));
        rbtSeleccion.setText("Selección");
        rbtSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSeleccionActionPerformed(evt);
            }
        });

        lblInicial.setText("Fecha inicial:");

        lblFinal.setText("Fecha final:");

        dchFechaInicial.setEnabled(false);

        dchFechaFinal.setEnabled(false);

        lblFacturaInicial.setText("Factura inicial:");

        lblFacturaFinal.setText("Factura final:");

        cmbFacturaInicial.setActionCommand("cmbFacturaInicial");
        cmbFacturaInicial.setEnabled(false);

        cmbFacturaFinal.setEnabled(false);

        lblClienteInicial.setText("Cliente:");

        cmbCliente.setEnabled(false);

        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reports.png"))); // NOI18N
        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(rbtFactura))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rbtFecha)))
                        .addGap(39, 39, 39)
                        .addComponent(rbtCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtTodo)
                                .addGap(18, 18, 18)
                                .addComponent(rbtSeleccion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblArchivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeleccionArchivo)))))
                .addGap(0, 47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFacturaInicial)
                    .addComponent(lblInicial)
                    .addComponent(lblClienteInicial)
                    .addComponent(lblFacturaFinal)
                    .addComponent(lblFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbFacturaFinal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbFacturaInicial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dchFechaInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dchFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerarReporte)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArchivo)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionArchivo))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtTodo)
                    .addComponent(rbtSeleccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtFecha)
                    .addComponent(rbtFactura)
                    .addComponent(rbtCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFinal)
                    .addComponent(dchFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFacturaInicial)
                    .addComponent(cmbFacturaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFacturaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFacturaFinal))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarReporte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTodoActionPerformed
       habilitarCampos();
    }//GEN-LAST:event_rbtTodoActionPerformed

    private void habilitarCampos(){
        if (rbtTodo.isSelected()) {
            rbtFecha.setEnabled(false);
            rbtFactura.setEnabled(false);
            rbtCliente.setEnabled(false);
            
            dchFechaInicial.setEnabled(false);
            dchFechaFinal.setEnabled(false);
            
            cmbCliente.setEnabled(false);
            
            cmbFacturaInicial.setEnabled(false);
            cmbFacturaFinal.setEnabled(false);
            
        }else{
             rbtFecha.setEnabled(true);
             rbtFactura.setEnabled(true);
             rbtCliente.setEnabled(true);
        }
        
        if (rbtFecha.isSelected()) {
            dchFechaInicial.setEnabled(true);
            dchFechaFinal.setEnabled(true);
            
            cmbCliente.setEnabled(false);
            
            cmbFacturaInicial.setEnabled(false);
            cmbFacturaFinal.setEnabled(false);
        }
        
        if (rbtFactura.isSelected()) {
            dchFechaInicial.setEnabled(false);
            dchFechaFinal.setEnabled(false);
            
            cmbCliente.setEnabled(false);
            
            cmbFacturaInicial.setEnabled(true);
            cmbFacturaFinal.setEnabled(true);
        }
        
        if (rbtCliente.isSelected()) {
            dchFechaInicial.setEnabled(false);
            dchFechaFinal.setEnabled(false);
            
            cmbCliente.setEnabled(true);
            
            cmbFacturaInicial.setEnabled(false);
            cmbFacturaFinal.setEnabled(false);
        }
    }
    
    private void rbtSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSeleccionActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtSeleccionActionPerformed

    private void rbtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFechaActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtFechaActionPerformed

    private void rbtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFacturaActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtFacturaActionPerformed

    private void rbtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtClienteActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtClienteActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        if (txtArchivo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar o ingresar un nombre de archivo");
            return;
        }
        try {
             String archivo;
             String sql;
             archivo = txtArchivo.getText() + ".pdf";
             sql = "select factura.idFactura, factura.idCliente, "
                   + "CONCAT(nombres,' ', apellidos) as nombreFull, " 
                   + "fecha, idLinea, idProducto, descripcion, precio, "
                   + "cantidad, precio * cantidad as valor "
                   + "from factura "
                   + "inner join clientes on factura.idCliente = clientes.idCliente "
                   + "inner join detalleFactura on factura.idFactura = detalleFactura.idFactura";
             Reporte.reporteFacturas(archivo, misDatos.getConsulta(sql));
             JOptionPane.showMessageDialog(null, "Reporte generado exitosamente...");
        } catch (Exception ex) {
            Logger.getLogger(frmReporteFacturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            //Cargamos clientes en el combobox desde la base de datos
            Opcion opc = new Opcion("NA", "Seleccione un cliente...");
            /*En los combos clientes se debe entrar a propiedades, seleccionar
              code y cambiar <String> por <Object>
            */
            cmbCliente.addItem(opc);
            ResultSet rsCli = misDatos.getClientes();
            while(rsCli.next()){
                opc = new Opcion(
                        rsCli.getString("idCliente"),
                        rsCli.getString("nombres") + " "
                        + rsCli.getString("apellidos"));
                cmbCliente.addItem(opc);
            }
            
            //Cargmos las facturas en los combox desde la base de datos
            opc = new Opcion("NA", "Seleccione una factura...");
            /*En los combos facturas se debe entrar a propiedades, seleccionar
              code y cambiar <String> por <Object>
            */
            cmbFacturaInicial.addItem(opc);
            cmbFacturaFinal.addItem(opc);
            ResultSet rsFac = misDatos.getFacturas();
            while(rsFac.next()){
                opc = new Opcion(
                        rsFac.getString("idFactura"),
                        rsFac.getString("idFactura"));
                cmbFacturaInicial.addItem(opc);
                cmbFacturaFinal.addItem(opc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSeleccionArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionArchivoActionPerformed
        frmSelectorArchivo miArchivo = new  frmSelectorArchivo(null, closable);
        //Centra el formulario en la pantalla
        miArchivo.setLocationRelativeTo(null);
        miArchivo.setVisible(true);
        String archivo = miArchivo.getArchivo();
        if (!archivo.equals("")) {
            txtArchivo.setText(archivo);
        }
        
    }//GEN-LAST:event_btnSeleccionArchivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrFiltro;
    private javax.swing.ButtonGroup bgrTipo;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnSeleccionArchivo;
    private javax.swing.JComboBox<Object> cmbCliente;
    private javax.swing.JComboBox<Object> cmbFacturaFinal;
    private javax.swing.JComboBox<Object> cmbFacturaInicial;
    private com.toedter.calendar.JDateChooser dchFechaFinal;
    private com.toedter.calendar.JDateChooser dchFechaInicial;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblClienteInicial;
    private javax.swing.JLabel lblFacturaFinal;
    private javax.swing.JLabel lblFacturaInicial;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblInicial;
    private javax.swing.JRadioButton rbtCliente;
    private javax.swing.JRadioButton rbtFactura;
    private javax.swing.JRadioButton rbtFecha;
    private javax.swing.JRadioButton rbtSeleccion;
    private javax.swing.JRadioButton rbtTodo;
    private javax.swing.JTextField txtArchivo;
    // End of variables declaration//GEN-END:variables
}
