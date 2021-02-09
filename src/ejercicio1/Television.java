/**
 * 
 */
package ejercicio1;

/**
 * @author Miguel A. Sastre
 *
 */
public class Television extends Electrodomestico {
	
	/**
	 * Constantes
	 */
	private static final double DEFAULT_RESOLUCION = 20;
	private static final boolean DEFAULT_TDT = false;
	
	
	/**
	 * Atributos
	 */
	
	protected double resolucion;
	protected boolean tdt;
	
	
	public Television() {
		super();
		this.resolucion = this.DEFAULT_RESOLUCION;
		this.tdt = this.DEFAULT_TDT;
	}

	public Television(double precio, double peso) {
		super(precio,peso);
		this.resolucion = this.DEFAULT_RESOLUCION;
		this.tdt = this.DEFAULT_TDT;
	}
	
	
	public Television(double resolucion, boolean tdt) {
		super();
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		precioFinal += (this.isTdt()) ? 50:0;
		precioFinal *= (this.getResolucion() > 40) ? 1.30:1;
		
		return precioFinal;
	}
	

	public double getResolucion() {
		return resolucion;
	}


	public boolean isTdt() {
		return tdt;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", tdt=" + tdt + "]";
	}
	
}
