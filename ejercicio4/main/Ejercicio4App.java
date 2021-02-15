/**
 * 
 */
package main;

import java.util.Scanner;

import excepcion.ExcepcionMatematica;
import models.Matematicas;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio4App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		
		do {
			System.out.println("0.Suma positiva\n1.Suma negativa\n2.Multiplicación positiva\n3.División\n4.Raiz cuadrada");
			int a,b,opcion = scan.nextInt();
			
			switch(opcion) {
			case 0:
				System.out.println("a = ");
				a = scan.nextInt();
				System.out.println("b = ");
				b = scan.nextInt();
				try {
					System.out.println(Matematicas.sumaPositiva(a, b));
				} catch (ExcepcionMatematica e) {
					e.numeroNegativo();
				}
				
				break;
			case 1:
				System.out.println("a = ");
				a = scan.nextInt();
				System.out.println("b = ");
				b = scan.nextInt();
				try {
					System.out.println(Matematicas.sumaNegativa(a, b));
				} catch (ExcepcionMatematica e) {
					e.numeroPositivo();
				}
				
				break;
			case 2:
				System.out.println("a = ");
				a = scan.nextInt();
				System.out.println("b = ");
				b = scan.nextInt();
				try {
					System.out.println(Matematicas.multiplicacionPositiva(a, b));
				} catch (ExcepcionMatematica e) {
					e.numeroNegativo();
				}	
				break;
			case 3:
				System.out.println("a = ");
				a = scan.nextInt();
				System.out.println("b = ");
				b = scan.nextInt();
				System.out.println(Matematicas.division(a, b));
				
				break;
			case 4:
				double z = scan.nextDouble();
				System.out.println(Matematicas.raizCuadrada(z));
				break;
			default:
				exit = true;
				break;
			}
		} while(!exit);
	}

}
