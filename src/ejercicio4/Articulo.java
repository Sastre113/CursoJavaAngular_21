package ejercicio4;

public class Articulo {

	private String nombre; // Nombre del articulo
	private int cantidad; // Cantidad disponible/Comprada de este producto
	private double precio; // Precio por unidad
	private double iva; // Iva aplicado
	
	
	public Articulo(String nombre, int cantidad, double precio, double iva) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio; 
		this.iva = iva;
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

	public double getIva() {
		return iva;
	}
	
	public int retirarStock(int cantRetirada) {
		int cantidadRetirada = 0;
		
		if(this.cantidad < cantRetirada) {
			cantidadRetirada = this.cantidad;
			this.cantidad = 0;
		}else {
			cantidadRetirada = cantRetirada;
			this.cantidad -= cantRetirada;
		}
			
		return cantidadRetirada;
	}
	
	public void agregarStock(int cantAgregada) {
		this.cantidad += cantAgregada;
	}
	
	public double factura() {
		return (this.getCantidad() * this.getPrecio()) * (1 + this.getIva());
	}
	
	@Override
	public String toString() {
		return "\nArticulo: " + this.nombre + "\nCantidad: "+ this.cantidad + "\nPrecio unitario(Sin IVA): "+ 
				String.format("%1$,.2f €",this.precio)  + "\nIVA aplicado: " + String.format("%1$,.2f",this.iva) + "\n" ;
	}
}
