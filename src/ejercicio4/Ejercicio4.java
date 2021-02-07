package ejercicio4;
import java.util.Hashtable;

import default_package.AuxMethod;


public class Ejercicio4 {
	/*
	 * 4) Combina los métodos generados en las actividades 2 y 3 creando una
	 * aplicación que gestione ventas y control de stock en una misma interfaz.
	 * Utiliza para ello las estructuras de datos que creas conveniente.
	 */
	
	private static Hashtable<String, Articulo> cargarDatosTest() {
		Hashtable<String, Articulo> stock = new Hashtable<String, Articulo>();
		
		stock.put("coca cola", new Articulo("coca cola",10,1.92,0.21));
		stock.put("pepsi", new Articulo("pepsi",20,2.15,0.21));
		
		return stock;
	}
	
	
	public static void main() {
		String [] opciones = {"Cliente","Tienda"};
		int opcion;
		boolean exit = false;
		Tienda mercadillona = new Tienda(cargarDatosTest());
		do {
			opcion =  AuxMethod.darOpciones(opciones,"Como desea acceder a la aplicación");
			System.out.println(opcion);
			switch(opcion) {
			case 0: // Cliente
				Cliente.comprar(mercadillona.stock);
				break;
			case 1: // Tienda
				mercadillona.gestion();
				break;
			default:
				exit = true;
				break;
			}
			
		} while (!exit);
	}

}
