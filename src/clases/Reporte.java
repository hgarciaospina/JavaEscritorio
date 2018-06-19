package clases;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.PageSize;
import formularios.frmReporteFacturas;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reporte {
    public static void reporteFacturas(String archivo, ResultSet rs){
        try {
             Document documento;
             documento = new Document();
             PdfWriter.getInstance(documento, new FileOutputStream(archivo));
             
             //Creamos una instancoa de tipo PdfPTable para crear la tabla
             PdfPTable tabla;
             
             Font fuente  = new Font();
             
             //Colocamos el título del reporte
             String texto = "";
             texto = "REPORTE FACTURAS";
             Paragraph parrafo;
             parrafo = new Paragraph(texto);
             documento.open();
             documento.add(parrafo);
             
             //Adiciona una línea en blanco entre el encabezado y la tabla
             parrafo = new Paragraph(" ");
             documento.add(parrafo);
             
             boolean existenRegistros = false;
             existenRegistros = rs.next();
             
             //Declaramos variables de totales
             int totCanFac = 0;
             int totValFac = 0;
             int totCanGen = 0;
             int totValGen = 0;
             
             //Iniciamos el cuerpo del reporte
             while(existenRegistros) {
                tabla = new PdfPTable(2); //(2) -> Una tabla con dos columnas
                //Imprimimos el encabezado de la factura
                tabla.addCell("Factura No. : ");
                tabla.addCell(rs.getString("idFactura"));
                tabla.addCell( "ID Cliente: ");
                tabla.addCell(rs.getString("idCliente"));
                tabla.addCell( "Nombre del Cliente: ");
                tabla.addCell(rs.getString("nombreFull"));
                tabla.addCell( "Fecha de facturación: ");
                tabla.addCell(rs.getString("fecha"));
                
                parrafo = new Paragraph(); 
                parrafo.add(tabla);
                documento.add(parrafo);
                
                
                //Antes de empezar a recorrer las líneas de factura
                totCanFac = 0;
                totValFac = 0;
                
                
                //Adiciona una línea en blanco
                parrafo = new Paragraph(" ");
                documento.add(parrafo);
                
                /* Imprimimos los encabezados del detalle definiendo una tabla
                   con 6 columnas
                */
                tabla = new PdfPTable(6);
                tabla.setWidths(new float[] { 0.8f, 1.2f, 2, 2, 1.2f, 2 });
                tabla.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
                
                tabla.addCell("Línea");
                tabla.addCell("ID Producto");
                tabla.addCell("Descripcion");
                tabla.addCell("Precio");
                tabla.addCell("Cantidad");
                tabla.addCell("Valor");
                
                parrafo = new Paragraph();
                parrafo.add(tabla);
                documento.add(parrafo);
                
                /* Se adiciona una línea en blanco despues del encabezado de
                   líneas de detalle */ 
               
                tabla = new PdfPTable(6);
                tabla.setWidths(new float[] { 0.8f, 1.2f, 2, 2, 1.2f, 2 });
                tabla.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
                
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                
                parrafo = new Paragraph();
                parrafo.add(tabla);
                documento.add(parrafo);
                
                int facturaActual;
                facturaActual = rs.getInt("idFactura");
                
                while(existenRegistros && facturaActual == rs.getInt("idFactura")){
                    tabla = new PdfPTable(6);
                    tabla.setWidths(new float[] { 0.8f, 1.2f, 2, 2, 1.2f, 2 });
                    tabla.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
                     
                    tabla.addCell(rs.getString("idLinea"));
                    tabla.addCell(rs.getString("idProducto"));
                    tabla.addCell(rs.getString("descripcion"));
                    tabla.addCell(rs.getString("precio"));
                    tabla.addCell(rs.getString("cantidad"));
                    tabla.addCell(rs.getString("valor"));
                    
                    parrafo = new Paragraph();
                    parrafo.add(tabla);
                    documento.add(parrafo);
                    
                    //Acumulamos por cada línea de detalle de la factura
                    
                    /* Acumulamos la cantidad de artículos de la línea 
                        de detalle */
                    totCanFac += rs.getInt("cantidad");
                    
                    /* Acumulamos el valor total de la cantidad de artículos
                       de la línea de detalle */
                    totValFac += rs.getInt("valor");
                    
                    existenRegistros = rs.next();
                }
                
                 /* Se adiciona una línea en blanco antes de los totales 
                   de la factura*/ 
               
                tabla = new PdfPTable(6);
                tabla.setWidths(new float[] { 0.8f, 1.2f, 2, 2, 1.2f, 2 });
                tabla.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
                
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                
                parrafo = new Paragraph();
                parrafo.add(tabla);
                documento.add(parrafo);
                
                /* Una vez recorrida todas las línes de detalle de la factura
                   se imprimen los totales acumulados
                */
               
                tabla = new PdfPTable(6);
                tabla.setWidths(new float[] { 1, 1, 2, 2, 1.2f, 2 }); 
                tabla.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
                
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell("TOTAL FACTURA");
                tabla.addCell(" ");
                tabla.addCell("" + totCanFac);
                tabla.addCell("" + totValFac);

                parrafo = new Paragraph();
                parrafo.add(tabla);
                documento.add(parrafo);
                
                //Acumulamos totales generales
                totCanGen += totCanFac;
                totValGen += totValFac;
                
                //Adicionamos una línea en blanco
                parrafo = new Paragraph(" ");
                documento.add(parrafo);  
            }
             
            tabla = new PdfPTable(6);
            tabla.setWidths(new float[] { 1, 1, 2, 2, 1.2f, 2 }); 
                    
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell("TOTAL GENERAL");
            tabla.addCell("" + totCanGen);
            tabla.addCell("" + totValGen);

            parrafo = new Paragraph();
            parrafo.add(tabla);
            documento.add(parrafo);
            
            documento.close();
        } catch (Exception ex) {
            Logger.getLogger(frmReporteFacturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
