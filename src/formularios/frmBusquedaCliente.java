
package formularios;

import clases.Datos;
import clases.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENRY
 */
public class frmBusquedaCliente extends javax.swing.JDialog {

    private Datos misDatos;
    private DefaultTableModel miTabla;
    private String respuesta = "";
    
     public void setDatos(Datos misDatos){
        this.misDatos = misDatos;
    }
    
    
    //Devuelve el dato de búsqueda seleccionado
    public String getRespuesta() {
        return respuesta;
    }
    
    private void llenarTabla() {
        String titulos[] = { "ID Cliente","Nombres", "Apellidos"};
        String registro[] = new String[3];
        miTabla = new DefaultTableModel(null, titulos);
        String sql = null;
        if (txtCriterio.getText().equals("")) {
            sql = "select idCliente, nombres, apellidos from clientes order by idCliente";
        } else {
            if(rbtNombres.isSelected()){
                sql = "select idCliente, nombres, apellidos from clientes "
                        + "where nombres like '" + txtCriterio.getText()
                        + "%'"
                        + " order by nombres, apellidos";    
            }
            if(rbtApellidos.isSelected()) {
                sql = "select idCliente, nombres, apellidos from clientes "
                        + "where apellidos like '" + txtCriterio.getText()
                        + "%'"
                        + " order by apellidos, nombres"; 
            }
            if(rbtID.isSelected()){
                sql = "select idCliente, nombres, apellidos from clientes "
                        + "where idCliente like '" + txtCriterio.getText()
                        + "%'"
                        + " order by idCliente"; 
            }
        } 
        
        ResultSet rs = misDatos.getConsulta(sql);
        try {   
             while (rs.next()) {
                 registro[0] = rs.getString("idCliente");
                 registro[1] = rs.getString("nombres");
                 registro[2] = rs.getString("apellidos");
                 miTabla.addRow(registro);
             }
             tblTabla.setModel(miTabla);  
        } catch (SQLException ex) {
             Logger.getLogger(frmBusquedaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public frmBusquedaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Se agrupan los botones mediante bgrTipoBusqueda para que sean excluyentes
        bgrTipoBusqueda.add(rbtID);
        bgrTipoBusqueda.add(rbtApellidos);
        bgrTipoBusqueda.add(rbtNombres);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrTipoBusqueda = new javax.swing.ButtonGroup();
        rbtID = new javax.swing.JRadioButton();
        rbtNombres = new javax.swing.JRadioButton();
        rbtApellidos = new javax.swing.JRadioButton();
        txtCriterio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rbtID.setSelected(true);
        rbtID.setText("ID");
        rbtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtIDActionPerformed(evt);
            }
        });

        rbtNombres.setText("Nombres");
        rbtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNombresActionPerformed(evt);
            }
        });

        rbtApellidos.setText("Apellidos");
        rbtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtApellidosActionPerformed(evt);
            }
        });

        txtCriterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCriterioActionPerformed(evt);
            }
        });

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

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accept.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtApellidos))
                    .addComponent(txtCriterio))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rbtApellidos, rbtID, rbtNombres});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtID)
                    .addComponent(rbtNombres)
                    .addComponent(rbtApellidos))
                .addGap(18, 18, 18)
                .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarTabla();
        txtCriterio.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void rbtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNombresActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
        llenarTabla();
    }//GEN-LAST:event_rbtNombresActionPerformed

    private void rbtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtApellidosActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
        llenarTabla();
    }//GEN-LAST:event_rbtApellidosActionPerformed

    private void rbtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtIDActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
        llenarTabla();
    }//GEN-LAST:event_rbtIDActionPerformed

    private void txtCriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCriterioActionPerformed
        llenarTabla();
    }//GEN-LAST:event_txtCriterioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        respuesta = "";
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int num = tblTabla.getRowCount();
        if (num == 0) {
            respuesta = "";
            dispose();
        }
        
        for (int i = 0; i < num; i++) {
            //Si seleccionan una fila se devuelve el ID del cliente en respuesta
            if (tblTabla.isRowSelected(i)) {
                respuesta = Utilidades.objectToString(tblTabla.getValueAt(i, 0));
                dispose();
                return;
            }
            //Sino seleccionan ninguna se devuelve el ID de la primera fila
            respuesta = Utilidades.objectToString(tblTabla.getValueAt(0, 0));
            dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(frmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBusquedaCliente dialog = new frmBusquedaCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrTipoBusqueda;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtApellidos;
    private javax.swing.JRadioButton rbtID;
    private javax.swing.JRadioButton rbtNombres;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCriterio;
    // End of variables declaration//GEN-END:variables
}
