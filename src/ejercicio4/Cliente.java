package ejercicio4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import default_package.AuxMethod;

/**
 * @author Miguel A. Sastre
 *
 */
public class Cliente {

	private static String[] obtenerKeys(Hashtable<String, Articulo> stock) {
		int punt = 0;
		String [] keys = new String[stock.size()];
		Iterator<String> it = stock.keySet().iterator();
		
		while (it.hasNext()) {
			keys[punt] = it.next();
			punt++;
		}
		
		return keys;
	}
	
	private static double costeCesta(Hashtable<String, Articulo> cesta ) {
		Set<String> it = cesta.keySet();
		double coste = 0;
		for (String articulo : it) {
			coste += cesta.get(articulo).factura();
		}
		
		return coste;
	}
	
	private static double solicitarPago(double costeCesta) {
		double pagado;
		do {
			pagado = AuxMethod.solicitarDatosDouble("El coste de la cesta es: " + String.format("%1$,.2f",costeCesta) + "\nIngrese la cantidad que va a pagar:");
		} while (pagado < costeCesta);
				
		
		
		return pagado;
	}
	
	public static void comprar(Hashtable<String, Articulo> stock, ArrayList<Venta> ventas) {
		Object nombreArticulo;
		Hashtable<String, Articulo> cesta = new Hashtable<String,Articulo>();
		boolean exit = false, cestaCompleta = false;
		int cant = 0;
		
		do {
			do {
				nombreArticulo =  AuxMethod.menuDesplegable(obtenerKeys(stock));
				System.out.println("El valor es " + nombreArticulo);
				if(nombreArticulo == null) break;
				if(cesta.get(nombreArticulo.toString()) != null)
					AuxMethod.mostrarInfo("Ya ha elegido ese articulo para su cesta");
			} while (!(cesta.get(nombreArticulo.toString()) == null));
			
			
			if(nombreArticulo != null) {
				 cant = AuxMethod.solicitarDatosInt("Cuantas unidades quieres de " + nombreArticulo + "\n");
				cesta.put(nombreArticulo.toString(), 
						new Articulo(nombreArticulo.toString(),
								stock.get(nombreArticulo).retirarStock(cant),
								stock.get(nombreArticulo).getPrecio(),
								stock.get(nombreArticulo).getIva()
								)
						);
			}
			else
				exit = true;	
		
			cestaCompleta = (AuxMethod.darOpciones(new String[] {"Añadir más productos","Salir"}) == 1) ? true: false;
			
			if(cestaCompleta) {
				exit = true;
				if(!cesta.isEmpty()) {
					double costeCesta = costeCesta(cesta);
					ventas.add(new Venta(cesta,cant,solicitarPago(costeCesta),costeCesta));
				}	
			}
		} while (!exit);
	}

}
