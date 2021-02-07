package ejercicio4;
import java.util.Hashtable;

import default_package.AuxMethod;


public class Ejercicio4 {
	/*
	 * 4) Combina los métodos generados en las actividades 2 y 3 creando una
	 * aplicación q ue gestione ventas y control de stock en una misma interfaz.
	 * Utiliza para ello las estructuras de datos que creas conveniente.
	 */
	
	private static Hashtable<String, Articulo> cargarDatosTest() {
		Hashtable<String, Articulo> stock = new Hashtable<String, Articulo>();
		
		stock.put("coca cola", new Articulo("coca cola",10,1.92,0.21));
		stock.put("pepsi", new Articulo("pepsi",20,2.15,0.21));
		stock.put("zumo", new Articulo("zumo",100,0.75,0.21));
		stock.put("naranja", new Articulo("naranja",200,0.23,0.04));
		stock.put("manzana", new Articulo("manzana",200,0.65,0.04));
		stock.put("peras", new Articulo("peras",50,0.45,0.04));
		stock.put("melocoton", new Articulo("melocoton",15,0.30,0.04));
		stock.put("sandia", new Articulo("sandia",3,5,0.04));
		stock.put("uvas", new Articulo("uvas",254,0.10,0.04));
		stock.put("tomates", new Articulo("tomates",164,0.20,0.04));
		stock.put("pimientos", new Articulo("pimientos",64,0.15,0.04));
		
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
				Cliente.comprar(mercadillona.getStock(),mercadillona.getVentas());
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
