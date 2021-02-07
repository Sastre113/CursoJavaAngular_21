package ejercicio4;

public class Articulo {

	private String nombre;
	private int cantidad;
	private double precio;
	private double iva;
	private double precioConIva;
	
	
	public Articulo(String nombre, int cantidad, double precio, double iva) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.iva = iva;
		this.precioConIva = precio * (iva+1);
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public double getPrecioConIva() {
		return precioConIva;
	}

	public double getIva() {
		return iva;
	}
	
	public void retirarStock(int cantRetirada) {
		this.cantidad -= cantRetirada;
	}
	
	public void agregarStock(int cantAgregada) {
		this.cantidad += cantAgregada;
	}
	
	@Override
	public String toString() {
		return "\nArticulo: " + this.nombre + "\nCantidad: "+ this.cantidad + "\nPrecio sin iva: "+ 
				String.format("%1$,.2f €",this.precio)  + "\nIVA aplicado: " + String.format("%1$,.2f",this.iva) + "\nPrecio con IVA: " +  String.format("%1$,.2f €",this.precioConIva) + "\n" ;
	}
}
