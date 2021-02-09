/**
 * 
 */
package default_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @author Miguel A. Sastre
 *
 */

/*
 * Colores disponibles = blanco, negro, azul,rojo y gris. No importa si
 * mayuscula o minuscula
 * 
 */

public class Electrodomestico {

	/**
	 * Constantes
	 */
	private static final String DEFAULT_COLOR = "Blanco";
	private static final char DEFAULT_CONSUMO = 'F';
	private static final double DEFAULT_PRECIOBASE = 100.0;
	private static final double DEFAULT_PESO = 5.0;
	private static final ArrayList<String> DEFAULT_COLORS = new ArrayList<String>(Arrays.asList("blanco", "negro", "azul","rojo", "gris"));
	private static final Hashtable<Character,Integer> EQV_CONSUMO = new Hashtable<Character,Integer>(){{
		put('A',100);
		put('B',80);
		put('C',60);
		put('D',50);
		put('E',30);
		put('F',10);
		}};
	private static final LinkedHashMap<Integer,Integer> EQV_PESO = new LinkedHashMap<>() {{
		put(80,100);
		put(50,80);
		put(20,50);
		put(0,10);
		}};

	
	
	
	/**
	 * Atributos
	 */

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		this(DEFAULT_PRECIOBASE, DEFAULT_COLOR, DEFAULT_CONSUMO, DEFAULT_PESO);
	}

	/**
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = this.DEFAULT_COLOR;
		this.consumoEnergetico = this.DEFAULT_CONSUMO;
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

	/*
	 * Comprueba que la letra es correcta, sino es correcta usara la letra
	 * por defecto. Se invocara al crear el objeto y no sera visible.
	 */
	private char comprobarConsumoEnergetico(char letra) {
		return (letra > 64 && letra < 71) ? letra : this.DEFAULT_CONSUMO;
	}
	/*
	 * Comprueba que el color es correcto, sino lo es usa el color por
	 * defecto. Se invocara al crear el objeto y no sera visible.
	 */

	private String comprobarColor(String color) {
		return (this.DEFAULT_COLORS.contains(color) == true) ? color : this.DEFAULT_COLOR;
	}

	/*
	 * Según el consumo energético, aumentara su precio, y según su tamaño,
	 * también.
	 */

	public double precioFinal() {
		double sobreCoste = this.EQV_CONSUMO.get(this.consumoEnergetico);
		Iterator<Integer> it = this.EQV_PESO.keySet().iterator();
		boolean exit = false;
		
		while(it.hasNext() && !exit) {
			Integer key = it.next();	
			if(this.peso >= key) {
				sobreCoste += EQV_PESO.get(key);
				exit = true;
			}
			
		}	
		return sobreCoste + this.precioBase;
	}

	/*
	 * Getters & setters
	 */

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
