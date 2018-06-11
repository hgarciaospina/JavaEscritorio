package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos2 {
    private Connection cnn; //Connection (java.sql) 
    
    public Datos2() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db = "jdbc:mysql://localhost/facturacion";
            cnn = DriverManager.getConnection(db, "root", "Leandro2009");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validarUsuario(String usuario, String clave) {
        try {
            // select(1)Devuelve el número 1 si existe o null sino existe
            String sql = "select (1) from usuarios where idUsuario = '"
                    + usuario +"' and clave = '"+ clave + "'"; 
            //Stament (java.sql)
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
          } catch (SQLException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return false;
          }
    }    

    public int getPerfil(String usuario) {
        try {
            String sql = "select idPerfil from usuarios where idUsuario = '"
                    + usuario +"'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("idPerfil");
            } else {
                return -1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
