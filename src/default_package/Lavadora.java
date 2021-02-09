/**
 * 
 */
package default_package;

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
		

	/**
	 * 
	 */
	public Lavadora() {
		super();
		this.carga = this.DEFAULT_CARGAR;
	}


	/**
	 * @param carga
	 */
	public Lavadora(double precio,double peso) {
		super(precio,peso);
		this.carga = this.DEFAULT_CARGAR;
	}


	/**
	 * @param carga
	 */
	public Lavadora(double carga,double precioBase, String color, char consumoEnergetico, double peso) {
		super(precioBase,color, consumoEnergetico,peso);
		this.carga = carga;
	}
	
	public double precioFinal() {
		return (this.carga > 30) ? super.precioFinal() + 50: super.precioFinal();
	}
	

	public double getCarga() {
		return carga;
	}
	
	
	
}
