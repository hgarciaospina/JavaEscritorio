package formularios;

import clases.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author HENRY
 */
public class frmCambioClave extends javax.swing.JDialog {
    
    private String clave;
    private String usuario;
    private Datos misDatos;
    
    
    public void setClave(String clave) {
        this.clave = clave;
    }
     
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    } 
    
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }
    
    public frmCambioClave(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClaveActual = new javax.swing.JLabel();
        txtClaveActual = new javax.swing.JPasswordField();
        lblClaveActual1 = new javax.swing.JLabel();
        txtClaveNueva = new javax.swing.JPasswordField();
        lblClaveActual2 = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cambio de Clave");
        setIconImage(null);
        setResizable(false);

        lblClaveActual.setText("Clave actual:");

        lblClaveActual1.setText("Clave Nueva:");

        lblClaveActual2.setText("Confirmación:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accept.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addGap(26, 26, 26)
                .addComponent(btnCancelar)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClaveActual2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClaveActual1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClaveActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClaveActual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClaveActual)
                    .addComponent(txtClaveActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClaveActual1)
                    .addComponent(txtClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClaveActual2)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String claveActual = new String(txtClaveActual.getPassword());
        String claveNueva = new String(txtClaveNueva.getPassword());
        String confirmacion = new String(txtConfirmacion.getPassword());
        
        if (claveActual.equals("")) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Debe ingresar la clave actual");
            txtClaveActual.requestFocusInWindow();
            return;
        }
        
        if (claveNueva.equals("")) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Debe ingresar una clave nueva");
            txtClaveNueva.requestFocusInWindow();
            return;
        }
        
        if (confirmacion.equals("")) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Debe ingresar una clave de confirmación");
            txtConfirmacion.requestFocusInWindow();
            return;
        }
        
        if (!claveActual.equals(clave)) {
            JOptionPane.showMessageDialog(rootPane, 
                    "La clave no corresponde al usuario actual");
            txtClaveActual.setText("");
            txtClaveActual.requestFocusInWindow();
            return;
        }
        
        if (!claveNueva.equals(confirmacion)) {
            JOptionPane.showMessageDialog(rootPane, 
                    "La clave nueva y su confirmación no corresponden");
            txtClaveActual.setText("");
            txtConfirmacion.setText("");
            txtClaveActual.requestFocusInWindow();
            return;
        }
        
        //Cambiamos la clave del usuario
        misDatos.cambiarClave(usuario, claveNueva);
        JOptionPane.showMessageDialog(rootPane, 
                    "El Cambio de clave del usuario " + usuario + " ha sido exitosa");
        this.dispose();
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
            java.util.logging.Logger.getLogger(frmCambioClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCambioClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCambioClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCambioClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCambioClave dialog = new frmCambioClave(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblClaveActual;
    private javax.swing.JLabel lblClaveActual1;
    private javax.swing.JLabel lblClaveActual2;
    private javax.swing.JPasswordField txtClaveActual;
    private javax.swing.JPasswordField txtClaveNueva;
    private javax.swing.JPasswordField txtConfirmacion;
    // End of variables declaration//GEN-END:variables
}
