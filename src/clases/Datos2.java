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

    public Datos2() throws SQLException {
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
                    + usuario + "' and clave = '" + clave + "'";
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
                    + usuario + "'";
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

    public boolean existeUsuario(String usuario) {
        try {
            String sql = "select (1) from usuarios where idUsuario = '"
                    + usuario + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {  //Si existe el usuario retorna true
                return true;
            } else {
                return false; //Sino existe retorna false 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return false; //Si hay algún error retorna false
        }
    }

    public String agregarUsuario(Usuario miUsuario) {
        try {
            String sql = "insert into usuarios values('"
                    + miUsuario.getIdUsuario() + "', '"
                    + miUsuario.getNombres() + "', '"
                    + miUsuario.getApellidos() + "', '"
                    + miUsuario.getClave() + "', "
                    + miUsuario.getPerfil() + ")";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuario agregado correctamente";
        } catch (SQLException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return "Ocurrio un error al intentar agregar el usuario";
        }
    }

    public String modificarUsuario(Usuario miUsuario) {
        try {
            String sql = "update usuarios set "
                    + "nombres = '" + miUsuario.getNombres() + "', "
                    + "apellidos = '" + miUsuario.getApellidos() + "', "
                    + "clave = '" + miUsuario.getClave() + "', "
                    + "idPerfil = " + miUsuario.getPerfil() + " "
                    + "where idUsuario = '" + miUsuario.getIdUsuario() + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuario modificado correctamente";
        } catch (SQLException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return "Ocurrio un error al intentar modificar el usuario";
        }
    }

    public String borrarUsuario(String usuario) {
        try {
            String sql = "delete from usuarios where idUsuario='" + usuario + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuario eliminado correctamente";
        } catch (SQLException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return "Ocurrio un error al intentar eliminar el usuario";
        }
    }

    public ResultSet getUsuarios() {
        try {
            String sql = "Select * from usuarios order by apellidos";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int numeroUsuarios() {
        try {
            String sql = "Select count(*) as num from usuarios";
            Statement st = cnn.createStatement();
            //Se usa ResultSet cuando se retornan datos
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
