/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar listas de productos
 * @author loned
 *
 */
public class ListaProductos {

	/**
	 * nombre de la lista de productos
	 */
	private String nombreLista;
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el n√∫mero de productos contenidos en la lista
     */
    private static int n = 0;
    
    private int getNumProductos() {
        return n;
    }

    private void setNumProductos(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no est√° vac√≠a)
     * 
     * @param campo cadena a analizar
     * @return True: Cadena vac√≠a, False: Cadena correcta
     */
    private boolean parametro_vacio(String campo){
    
        if ((campo.replace(" ","").isEmpty()) || (campo == null))  return (Boolean) null; else return false;
    }
    /**
     * 
     * @param nombre recibe el nombre como par·metro
     */
    public ListaProductos(String nombre) {
    	if (parametro_vacio(nombre)) {
    		this.nombreLista = "noNamed";
    	}
    	else {
    	this.nombreLista = nombre;
    	}
    }
    /**
     * 
     * @return devolvemos this.getNumProductos()
     */
    public int totalProductos(){
            return this.getNumProductos();
    }
    /**
     * 
     * @param prod recibe el objeto producto
     * @return devuelve el objeto producto
     */
    public Producto registraProducto(Producto prod) {
        if(prod == null)
        {
        	return null;
        }
        else
        if (listaP.containsKey(prod.getcode())) {
           return null;
        }
        listaP.put(prod.getcode(), prod);
        n++;
        this.setNumProductos(n);
        return prod;
    }
    /**
     * 
     * @param codigo recibimos como par·metro un String que se llama cÛdigo
     * @return devolvemos prod
     */
    public Producto descartaProducto(String codigo) { 

        Producto prod = encuentraProducto(codigo);
        if (prod != null) {
	        listaP.remove(codigo);
	        n--;
	        this.setNumProductos(n);
        }
        return prod;
    }
    /**
     * 
     * @param codigo recibimos como par·metro un String llamado cÛdigo
     * @return devolvemos dependiendo del bucle o prod o listaP.get(cÛdigo)
     */
    public Producto encuentraProducto(String codigo) { 
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
/**
 * Devuelve un array con los productos registrados en la lista
 * @return array de productos
 */
    public ArrayList<Producto> recuperaProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    

}
