package clases;
/**
 *
 * @author HENRY
 */
public class Utilidades {
    
  public static boolean isNumeric(String cadena){
     try {   
        Integer.parseInt(cadena);
        return true;
     }catch (NumberFormatException nfe){
        return false; 
     }
  }   
}
    

