/*
*	grupo  :1ºGDAM
*	alumno :Rodrigo Álvarez lago
*	n.exp. :7230
*	fecha  :01-06-22
 */

//Finalizado

package Cheese;

/**
 *
 * @author ___
 */
public class Main {
    
     public static void main(String[] args) {
    
         ListaProductos Lp = new ListaProductos();
         Producto Pro = new Producto();
         
         Producto Pro1 = new Producto("000100055","Tipo lacteo", 6, 6);
         Producto Pro2 = new Producto("000116151","Tipo salsa", 2, 0.957);
         Producto Pro3 = new Producto("008485401","Tipo carne", 12, 1);
         Producto Pro4 = new Producto("478520001","Tipo fruta", 9, 1.8);
         
         Lp.addProducto(Pro1);
         Lp.addProducto(Pro2);
         Lp.addProducto(Pro3);
         Lp.addProducto(Pro4);  
         
         Pro1.imprime_etiqueta();
         Pro2.imprime_etiqueta();
         Pro3.imprime_etiqueta();
         Pro4.imprime_etiqueta();
         
         
         System.out.println("1º Gdam: Entornos de desarrollo");
    }        
}
