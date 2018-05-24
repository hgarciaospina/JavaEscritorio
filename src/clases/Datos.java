package clases;

public class Datos {
    private int maxUsu = 50;
    private int maxPro = 100;
    private Usuario misUsuarios[] = new Usuario[maxUsu];
    private Producto misProductos[] = new Producto[maxPro];
    private int conUsu = 0;
    private int conPro = 0;
    
    public Datos(){
        
        Usuario miUsuario;
        
        miUsuario = new Usuario("henry", "Henry", "García Ospina", "123", 1);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
        miUsuario = new Usuario("pepe", "Pedro", "Infante", "123", 2);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
        miUsuario = new Usuario("maria", "María", "Conchita", "123", 1);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
        
        Producto miProducto;
        
        miProducto = new Producto("1", "Coca Cola x 350 ML", 1500, 0, "");
        misProductos[conPro] = miProducto;
        conPro++;
        miProducto = new Producto("2", "Pan de leche", 2500, 1, "Se vende mejor caliente");
        misProductos[conPro] = miProducto;
        conPro++;
        miProducto = new Producto("3", "Salchicho", 3500, 2, "Delicioso con queso");
        misProductos[conPro] = miProducto;
        conPro++;
        miProducto = new Producto("4", "Hamburguesas", 2500, 3, "Calientes son lo mejor");
        misProductos[conPro] = miProducto;
        conPro++;
       
    }
    
    public int numeroUsuarios(){
        return conUsu;
    }
    
     public int numeroProductos(){
        return conPro;
    }
    
    public Usuario[] getUsuarios() {
        return misUsuarios;
    }
    
    public Producto[] getProductos() {
        return misProductos;
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
    
    public int posicionProducto(String producto){
        int aux = -1;
        for (int i = 0; i < conPro; i++) {
            if(misProductos[i].getIdProducto().equals(producto)) {
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
    
     public String agregarProducto(Producto miProducto){
        if (conPro == maxPro ) {
            return "Se ha alcanzado el número máximo de productos";
        }
        
        misProductos[conPro] = miProducto;
        conPro++;
        return "Producto agregado correctamente";
    }
    
    public String modificarUsuario(Usuario miUsuario, int pos){
        misUsuarios[pos].setNombres(miUsuario.getNombres());
        misUsuarios[pos].setApellidos(miUsuario.getApellidos());
        misUsuarios[pos].setClave(miUsuario.getClave());
        misUsuarios[pos].setPerfil(miUsuario.getPerfil());
        return "Usuario modificado correctamente";
    }
    
    public String modificarProducto(Producto miProducto, int pos){
        misProductos[pos].setDescripcion(miProducto.getDescripcion());
        misProductos[pos].setPrecio(miProducto.getPrecio());
        misProductos[pos].setIva(miProducto.getIva());
        misProductos[pos].setNota(miProducto.getNota());
        return "Producto modificado correctamente";
    }
    
     public String borrarUsuario(int pos){
         for (int i = pos; i < conUsu - 1; i++) {
             misUsuarios[i] = misUsuarios[i + 1];
         }
         conUsu--;
        return "Usuario eliminado correctamente";
    }
    
    public String borrarProducto(int pos){
         for (int i = pos; i < conPro - 1; i++) {
             misProductos[i] = misProductos[i + 1];
         }
         conPro--;
        return "Producto eliminado correctamente";
    } 
}
