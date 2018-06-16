package clases;

import formularios.frmLogin;
import java.sql.SQLException;

/**
 *
 * @author HENRY
 */
public class JavaEscritorio {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // Creo el objeto datos
        Datos misDatos = new Datos();
        
        // Llamamos el formulario de login
        frmLogin miLogin = new frmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
