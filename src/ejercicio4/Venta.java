package ejercicio4;

import java.util.Hashtable;
import java.util.List;

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
	private Hashtable<String, Integer> articulos;

	public Venta (int cantArticulos,Hashtable<String, Integer> articulos,double precioBruto,double pagado,double porcertanjeIVA) {
		this.cantArticulos = cantArticulos;
		this.articulos = articulos;
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
	
	public void añadirArticulo(String nombreArticulo, int cantArticulo) {
		if(!articulos.containsKey(nombreArticulo))
			articulos.put(nombreArticulo, cantArticulo);
	}

	
	@Override
	public String toString() {
		return "IVA aplicado: " + this.getIva() + "\nPrecio sin IVA: "+this.getPrecioBruto()+"\nPrecio con IVA: "
				+ String.format("%1$,.2f",this.getprecioIVA()) + "\nNúmero de artículos: " +this.getCantArticulos() + "\nPagado: " + this.pagado
				+"\nCambio a devolver: " + String.format("%1$,.2f", this.getDevolver()) + "\n";
	}

}
