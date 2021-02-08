package default_package;

/**
 * @author Miguel A. Sastre
 *
 */
public class Venta {
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
	
	
	private int cantArticulos;
	private double iva;
	private double precioBruto;
	private double precioIVA;
	private double pagado;
	private double devolver;
	

	public Venta (int cantArticulos,double precioBruto,double pagado,double porcertanjeIVA) {
		this.cantArticulos = cantArticulos;
		this.precioBruto = precioBruto;
		this.precioIVA = precioBruto *((porcertanjeIVA/100)+1); 
		this.pagado = pagado;
		this.devolver = pagado - getprecioIVA();
		this.iva = porcertanjeIVA;
	}

	public double getprecioIVA() {
		return precioIVA;
	}

	public double getIva() {
		return iva;
	}

	public int getCantArticulos() {
		return cantArticulos;
	}

	public double getPrecioBruto() {
		return precioBruto;
	}


	public double getPagado() {
		return pagado;
	}

	public double getDevolver() {
		return devolver;
	}
	
	@Override
	public String toString() {
		return "IVA aplicado: " + this.getIva() + "\nPrecio bruto total: "+this.getPrecioBruto()+"\nPrecio con IVA: "
				+ String.format("%1$,.2f",this.getprecioIVA()) + "\nNúmero de artículos: " +this.getCantArticulos() + "\nPagado: " + this.pagado
				+"\nCambio a devolver: " + String.format("%1$,.2f", this.getDevolver()) + "\n";
	}

}
