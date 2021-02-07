package ejercicio4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import default_package.AuxMethod;

public class Tienda {

	public static ArrayList<Venta> ventas = new ArrayList<Venta>();
	public static Hashtable<String, Articulo> stock = new Hashtable<String, Articulo>();

	public Tienda(Hashtable<String, Articulo> stock) {
		this.stock = stock;
	}

	private static void mostrarStock() {
		Set<String> it = stock.keySet();
		String text = "------------";
		
		for(String articulo: it) 
			text += stock.get(articulo) + "------------\n";
		
		AuxMethod.mostrarInfo(text);
	}

	private static void mostrarVentas() {
		Iterator<Venta> it = ventas.iterator();
		String text = "------------";
		
		while (it.hasNext()) 
			text += it.next().toString() + "------------\n" ;
	
		AuxMethod.mostrarInfo(text);
	}
	
	private static double ivaElegido(int iva) {
		return (iva == 0) ? 0.04 : 0.21;
	}

	public void gestion() {
		int opcion;
		boolean exit = false;
		String[] opciones = { "Mostrar stock", "Mostrar ventas", "Añadir stock" };
		String[] opcionesIva = {"4","21"};
		do {
			opcion = AuxMethod.darOpciones(opciones, "Elige una opción");
			System.out.println(opcion);
			switch (opcion) {
			case 0:// Mostrar stock
				if(stock.isEmpty())
					AuxMethod.mostrarInfo("No hay articulos almacenados");
				else
					mostrarStock();
				break;
			case 1:// Mostrar ventas
				if(ventas.isEmpty())
					AuxMethod.mostrarInfo("No hay ventas");
				else
					mostrarVentas();			
				break;
			case 2:// Añadir stock
				String articulo = "";
				int cantArticulo, iva;
				double precioSinIva;
				
				do {
					if(articulo.isEmpty())
						articulo = AuxMethod.solicitarDatosString("Introduzca articulo nuevo");
					else
						articulo = AuxMethod.solicitarDatosString("Ya existe \"" + articulo + "\". Debe introducir otro distinto.");				
				} while (stock.containsKey(articulo.toLowerCase()));
				
				cantArticulo = AuxMethod.solicitarDatosInt("Introduzca cantidad a almacenar de \"" + articulo + "\"");
				iva = AuxMethod.darOpciones(opcionesIva,"Introduzca iva que se le aplicara");
				precioSinIva = AuxMethod.solicitarDatosDouble("Introduzca precio sin iva");
				
				stock.put(articulo, new Articulo(articulo.toLowerCase(),cantArticulo,precioSinIva,ivaElegido(iva)));	
				break;
			default:
				exit = true;
				break;
			}

		} while (!exit);
	}
	
	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public Hashtable<String, Articulo> getStock() {
		return stock;
	}
	
}
