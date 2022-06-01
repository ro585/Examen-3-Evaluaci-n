/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    
    
    
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }

    /**
     * Este metodo añade un producto al carro medianteun parametro de entrada que
     * seria el del producto. 
     * @param campo objeto producto a analizar
     * @return null: si el producto está duplicado, sino suma uno a a la lista.
     * Es decir, un producto. 
     */

    public Producto addProducto(Producto prod) {
        
        if(check_null(prod.getcode())) return null; 
        
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }
    
    /**
     * este metodo elimina un producto del carro, comprueba si el no es nulo, es 
     * decir, si existe en la cesta y de ser así lo resta.
     * @param codigo cadena a analizar (codigo)
     * @return produccto para eliminar
     */
    
    public Producto eliminarProducto(String codigo) { 
        
        if(check_null(codigo)) return null; 
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        
        return prod;
    }
    
    /**
     * Este metodo entiendo que busca un producto en la cesta contrastando el codigo
     * de los productos.
     * @param codigo cadena a analizar (codigo)
     * @return el producto si no está en la lista y de estar en la lista retorna el 
     * codigo del producto de la lista. 
     */
    
    public Producto buscarProducto(String codigo) { 
        Producto prod = null;
        
        if(check_null(codigo)) return null; 
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
    
    /**
     * Este metodo añade los productos a la lista
     * @return los productos de la lista
     */
    
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    
    /**
     * esta función va a guardar el numero de productos de la lista
     * @return el numero total de productos
     */
    
    public int totalProductos(){
            return this.getN();
    }
}
