package default_package;

import java.util.Hashtable;
import java.util.Set;


public class Ejercicio3 {
	/*
	 * 3) Crea una base de datos de 10 artículos para controlar el stock de
	 * productos de una tienda por medio de un diccionario de datos
	 * (articulo:precio). El usuario podrá añadir, por medio de interfaz visual
	 * artículos nuevos y cantidades de estos. El usario podrá consultar la
	 * información almacenada en el diccionario referente a un articulo concreto e
	 * incluso listar toda la información en la terminal del programa
	 */

	static Hashtable<String,Double> dBArticulos = new Hashtable<String,Double>(); 
	

	static private void mostrarStock() {
		Set<String> it = dBArticulos.keySet();
		String text = "";
		for(String articulo : it) {
			text += articulo + " " + dBArticulos.get(articulo).toString() + " €\n";
		}
		
		
		AuxMethod.mostrarInfo(text);
	}
	
	
	
	static private void cargarDB() {
		dBArticulos.put("coca cola", 3.0);
		dBArticulos.put("pepsi", 2.9);
		dBArticulos.put("cerveza", 4.5);
		dBArticulos.put("lejia", 6.6);
		dBArticulos.put("chocolate", 2.0);
		dBArticulos.put("agua", 1.0);
		dBArticulos.put("zumo", 1.67);
		dBArticulos.put("cereales", 0.56);
		dBArticulos.put("manzanas", 0.2);
		dBArticulos.put("aceite", 16.0);
	}
	
	
	public static void main() {
		String [] opciones = {"Mostrar stock","Añadir nuevo articulo"};
		int opcion;
		boolean exit = false;
		cargarDB();
		
		
		do {
			opcion =  AuxMethod.darOpciones(opciones);
			System.out.println(opcion);
			switch(opcion) {
			case 0: // Mostrar venta
				if (dBArticulos.isEmpty()) {
					AuxMethod.mostrarInfo("No hay ventas almacenadas.");
				} else {
					mostrarStock();
				}
				break;
			case 1: // Añadir venta
				String nombreArticulo = AuxMethod.solicitarDatosString("Introducir nombre del articulo");
				double precio =  AuxMethod.solicitarDatosDouble("Introducir cuanto vale el articulo");
				dBArticulos.put(nombreArticulo, precio);
				break;
			default:
				exit = true;
				break;
			}
			
		} while (!exit);
	}
}
