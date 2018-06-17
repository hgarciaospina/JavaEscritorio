package formularios;

import clases.Datos;
import clases.Opcion;
import clases.Utilidades;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
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
        lblClienteFinal = new javax.swing.JLabel();
        cmbClienteInicial = new javax.swing.JComboBox<>();
        cmbClienteFinal = new javax.swing.JComboBox<>();
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

        lblClienteInicial.setText("Cliente Inicial:");

        lblClienteFinal.setText("Cliente final:");

        cmbClienteInicial.setEnabled(false);

        cmbClienteFinal.setEnabled(false);

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
                .addContainerGap()
                .addComponent(lblInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dchFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClienteFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClienteInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacturaFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacturaInicial, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbFacturaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbFacturaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbClienteInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(cmbClienteFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rbtTodo)
                        .addGap(18, 18, 18)
                        .addComponent(rbtSeleccion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeleccionArchivo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dchFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(rbtFactura))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rbtFecha)))
                        .addGap(39, 39, 39)
                        .addComponent(rbtCliente)))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblClienteFinal, lblClienteInicial, lblFacturaFinal, lblFacturaInicial, lblFinal, lblInicial});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbClienteFinal, cmbClienteInicial, cmbFacturaFinal, cmbFacturaInicial, dchFechaInicial});

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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacturaInicial)
                    .addComponent(cmbFacturaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFacturaFinal)
                            .addComponent(cmbFacturaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClienteInicial)
                            .addComponent(cmbClienteInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbClienteFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClienteFinal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerarReporte)
                        .addGap(43, 43, 43))))
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
            
            cmbClienteInicial.setEnabled(false);
            cmbClienteFinal.setEnabled(false);
            
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
            
            cmbClienteInicial.setEnabled(false);
            cmbClienteFinal.setEnabled(false);
            
            cmbFacturaInicial.setEnabled(false);
            cmbFacturaFinal.setEnabled(false);
        }
        
        if (rbtFactura.isSelected()) {
            dchFechaInicial.setEnabled(false);
            dchFechaFinal.setEnabled(false);
            
            cmbClienteInicial.setEnabled(false);
            cmbClienteFinal.setEnabled(false);
            
            cmbFacturaInicial.setEnabled(true);
            cmbFacturaFinal.setEnabled(true);
        }
        
        if (rbtCliente.isSelected()) {
            dchFechaInicial.setEnabled(false);
            dchFechaFinal.setEnabled(false);
            
            cmbClienteInicial.setEnabled(true);
            cmbClienteFinal.setEnabled(true);
            
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
             Document documento;
             archivo =  txtArchivo.getText() + ".pdf";
             documento = new Document();
             PdfWriter.getInstance(documento, new FileOutputStream(archivo));
             Paragraph parrafo = new Paragraph("Reporte generado");
             documento.open();
             documento.add(parrafo);
             documento.close();
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
            cmbClienteInicial.addItem(opc);
            cmbClienteFinal.addItem(opc);
            ResultSet rsCli = misDatos.getClientes();
            while(rsCli.next()){
                opc = new Opcion(
                        rsCli.getString("idCliente"),
                        rsCli.getString("nombres") + " "
                        + rsCli.getString("apellidos"));
                cmbClienteInicial.addItem(opc);
                cmbClienteFinal.addItem(opc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrFiltro;
    private javax.swing.ButtonGroup bgrTipo;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnSeleccionArchivo;
    private javax.swing.JComboBox<Object> cmbClienteFinal;
    private javax.swing.JComboBox<Object> cmbClienteInicial;
    private javax.swing.JComboBox<String> cmbFacturaFinal;
    private javax.swing.JComboBox<String> cmbFacturaInicial;
    private com.toedter.calendar.JDateChooser dchFechaFinal;
    private com.toedter.calendar.JDateChooser dchFechaInicial;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblClienteFinal;
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
