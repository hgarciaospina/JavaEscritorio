package clases;

public class Datos {
    private int maxUsu = 50;
    private Usuario misUsuarios[] = new Usuario[maxUsu];
    private int conUsu = 0;
    
    public Datos(){
        Usuario miUsuario = new 
                Usuario("henry", "Henry", "García Ospina", "123", 1);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
    }
    
    public int numeroUsuarios(){
        return conUsu;
    }
    
    public Usuario[] getUsuarios() {
        return misUsuarios;
    }
    
    public boolean validarUsuario(String usuario, String clave){
        boolean aux = false;
        for (int i = 0; i < conUsu; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario) && 
                    misUsuarios[i].getClave().equals(clave)) {
                return true;    
            }
        }
        return false;
    }
    
    public int posicionUsuario(String usuario){
        int aux = -1;
        for (int i = 0; i < conUsu; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario)) {
                return i;    
            }
        }
        return -1;
    }
    
    public String agregarUsuario(Usuario miUsuario){
        if (conUsu == maxUsu ) {
            return "Se ha alcanzado el número máximo de usuarios";
        }
        
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
        return "Usuario agregado correctamente";
    }
    
    public String modificarUsuario(Usuario miUsuario, int pos){
        misUsuarios[pos].setNombres(miUsuario.getNombres());
        misUsuarios[pos].setApellidos(miUsuario.getApellidos());
        misUsuarios[pos].setClave(miUsuario.getClave());
        misUsuarios[pos].setPerfil(miUsuario.getPerfil());
        
        return "Usuario agregado correctamente";
    }
}
