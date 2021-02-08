/**
 * 
 */
package default_package;

/**
 * @author Miguel A. Sastre
 *
 */

/*
 * Crearemos una clase llamada Electrodomestico con las siguientes características: 
 * 	• Sus atributos son: 
 * 		precio base 
 * 		color
 * 		consumo energético (letras entre A y F)
 * 		peso
 * Indica que se podrán heredar. 
 * 
 * 	• Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello. 
 * 	• Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas. 
 * 	• Los constructores que se implementaran serán: 
 * 		o Un constructor por defecto. 
 * 		o Un constructor con el precio y peso. El resto por defecto. 
 * 		o Un constructor con todos los atributos.
 */
public class Electrodomestico {

	private static final String COLOR = "Blanco";
	private static final char CONSUMOENERGETICO = 'F';
	private static final double PRECIOBASE = 100.0;
	private static final double PESO = 5.0;
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	
	/**
	 * 
	 */
	public Electrodomestico() {
		this(PRECIOBASE,COLOR,CONSUMOENERGETICO,PESO);
	}


	/**
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = this.COLOR;
		this.consumoEnergetico = this.CONSUMOENERGETICO;
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
}
