/**
 * 
 */
package ejercicio1;

/**
 * @author Miguel A. Sastre
 *
 */
public class Lavadora extends Electrodomestico {
	
	
	/**
	 * Constantes
	 */
	
	protected final double DEFAULT_CARGAR = 5;
	
	/**
	 * Atributos
	 */
	
	protected double carga;
		

	public Lavadora() {
		super();
		this.carga = this.DEFAULT_CARGAR;
	}
	
	public Lavadora(double carga) {
		super();
		this.carga = carga;
	}

	public Lavadora(double precio,double peso) {
		super(precio,peso);
		this.carga = this.DEFAULT_CARGAR;
	}
	
	public double precioFinal() {
		return (this.carga > 30) ? super.precioFinal() + 50: super.precioFinal();
	}
	

	public double getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
	
	
	
}
