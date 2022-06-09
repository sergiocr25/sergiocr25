/*
*	grupo  : GDAM
*	alumno : Sergio Valverde Ruiz-Olivares
*	n.exp. : 7754
*	fecha  : 09/06/2022
 */
package Cheese;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * Método main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
	
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         Producto pera = new Producto("1","fruta", 5, 20);
         Producto manzana = new Producto("2","fruta", 5, 30);
         ArrayList<Producto> prodsList = new ArrayList<>();
         prodsList.add(pera);
         prodsList.add(manzana);         
         pera.imprime_etiqueta();
         manzana.imprime_etiqueta();
     }
}
