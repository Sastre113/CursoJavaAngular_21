package ejercicio4;

import java.util.Hashtable;
import java.util.List;

/**
 * @author Miguel A. Sastre
 *
 */
public class Venta {
	
	private int idVenta;
	private double precioTotal;
	private double pagado;
	private double devolver;
	private Hashtable<String, Articulo> articulos;

	public Venta (Hashtable<String, Articulo> articulos, int cantArticulos ,double pagado, double precioTotal) {
		this.articulos = articulos;
		this.precioTotal = precioTotal;
		this.pagado = pagado;
		this.devolver = pagado - precioTotal;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPagado() {
		return pagado;
	}

	public double getDevolver() {
		return devolver;
	}

	public Hashtable<String, Articulo> getArticulos() {
		return articulos;
	}
	
	@Override
	public String toString() {
		return "\nPrecio Total: " + this.getPrecioTotal() + "\nPagado: " + this.getPagado() + 
				"\nCambio devuelto: "+ String.format("%1$,.2f €",this.getDevolver()) + "\n";
	}
}
