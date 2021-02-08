package default_package;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio2 {
	/*
	 * 2) Crea una aplicación que gestione el flujo de ventas de una caja de
	 * supermercado. El programa guardara la cantidades del carrito de compra dentro
	 * de una lista. 
	 * Mostrará por pantalla la siguiente informacion: 
	 * • IVA aplicado (21% o 4%) 
	 * • precio total bruto y precio mas IVA. 
	 * • Numero de artículos comprados. 
	 * • Cantidad pagada. 
	 * • Cambio a devolver al cliente.
	 */

	static ArrayList<Venta> ventas = new ArrayList<Venta>();
	
	static private void mostrarVentas() {
		Iterator<Venta> it = ventas.iterator();
		String text = "--------------\n";
		while(it.hasNext()) {
			text += it.next().toString();
			text += "--------------\n";
		}
		
		AuxMethod.mostrarInfo(text);
	}
	
	public static void main() {
		String [] opciones = {"Mostrar ventas","Añadir nueva venta"};
		int opcion;
		boolean exit = false;
		
		ventas.add(new Venta(4,51.3,70,21));
		ventas.add(new Venta(12,160,200,4));
		
		do {
			opcion =  AuxMethod.darOpciones(opciones);
			System.out.println(opcion);
			switch(opcion) {
			case 0: // Mostrar venta
				if (ventas.isEmpty()) {
					AuxMethod.mostrarInfo("No hay ventas almacenadas.");
				} else {
					mostrarVentas();
				}
				break;
			case 1: // Añadir venta
				String ivaOption [] = {"4","21"};
				int cantArticulos = AuxMethod.solicitarDatosInt("Introducir nº de artículos comprados");
				double iva = (AuxMethod.darOpciones(ivaOption, "Elija el tipo de IVA") == 0) ? 4:21,
				precioBruto = AuxMethod.solicitarDatosDouble("Introducir precio bruto de compra"),
				pagado = AuxMethod.solicitarDatosDouble("Introducir cantidad pagada");
				ventas.add(new Venta(cantArticulos,precioBruto,pagado,iva));
				break;
			default:
				exit = true;
				break;
			}
			
		} while (!exit);
	}

}
