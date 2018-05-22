package clases;

import formularios.frmLogin;

/**
 *
 * @author HENRY
 */
public class JavaEscritorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo el objeto datos
        Datos misDatos = new Datos();
        
        // Llamamos el formulario de login
        frmLogin miLogin = new frmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
