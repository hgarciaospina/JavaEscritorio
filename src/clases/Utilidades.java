package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
  
  public static Date stringToDate(String fecha){
    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/mm/yyyy");
    Date aux = null;
    try {
        aux = formatoDelTexto.parse(fecha);
    }catch (ParseException ex){        
    }
    return aux;
   }
}  
    