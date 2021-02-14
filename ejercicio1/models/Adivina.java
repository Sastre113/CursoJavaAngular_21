package models;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Miguel A. Sastre
 *
 */
public class Adivina {

	/**
	 * Constantes
	 */
	private static int DEFAULT_MAX = 501;
	private static int DEFAULT_MIN = 1;
	
	
	/**
	 * Atributos
	 */
	private int min = 1;
	private int max = 501;
	private int numAdivinar;
	private int intentos;
	
	/**
	 * Constructor por defecto
	 */
	public Adivina() {
		this(DEFAULT_MIN,DEFAULT_MAX);
	}
	
	
	/**
	 * Constructor
	 * 
	 * @param min
	 * @param max
	 */
	public Adivina(int min, int max) {
		this.min = min;
		this.max = max;
		this.intentos = 0;
		this.numAdivinar = generarNumero();
	}
	
	
	public void jugar() {
		
		boolean acierto = false;
		Scanner scan = new Scanner(System.in);
		int player = 0;
		
		
		System.out.println("Debes intentar acertar el nº que he generado aleatoriamente."
				+ "\nEl rango elegido es: [" +this.getMin() +"," + this.getMax() +"]");
		do {
			this.incrementarIntentos();
			System.out.println("Intento : " + this.getIntentos() + "\n");
			try {
				player = scan.nextInt();
				
				if(this.getNumAdivinar() != player) {
					generarMsgAyuda(player);	
				} else
					acierto = true;
				
			} catch (InputMismatchException e) {
				System.err.println("Error, solo admito números enteros");
			}
			
		}while(!acierto);
		
		
		if(acierto) {
			System.out.println("¡¡ Enhorabuena, has acertado. El nº era: " + player +"!!");
			System.out.println("Lo has conseguido en " + this.getIntentos() + " intentos.");
		}
		scan.close();
	}
	
	
	private int generarNumero() {
		return new Random().nextInt(this.getMax() - this.getMin()) - this.getMin();
	}
	
	private void generarMsgAyuda(int numPlayer) {
		System.out.println(this.getNumAdivinar() > numPlayer ? "El nº es mayor": "El nº es menor" );
	}
	
	/*
	 * Getter's & Setter's
	 */
	
	
	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @return the numAdivinar
	 */
	public int getNumAdivinar() {
		return numAdivinar;
	}
	
	/**
	 * @return the intentos
	 */
	public int getIntentos() {
		return intentos;
	}

	/**
	 * @param intentos the intentos to set
	 */
	public void incrementarIntentos() {
		this.intentos += 1;
	}

	
	
	
	
}
