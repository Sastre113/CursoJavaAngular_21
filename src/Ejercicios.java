import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 * @author Miguel A. Sastre
 *
 */

public class Ejercicios {

	static final String enunciadosBrutos = "Salir"
			+ ";Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los"
			+ " dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que" + " funciona."
			+ ";Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida"
			+ " por consola. Por ejemplo:si introduzco “Fernando”, me aparezca “Bienvenido Fernando”."
			+ ";Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir"
			+ " (recuerda usar JOptionPane)." + ";Haz una aplicación que calcule el área de un circulo (pi*R2"
			+ "). El radio se pedirá por teclado"
			+ "(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el"
			+ " método pow de Math."
			+ ";Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también"
			+ " debemos indicarlo."
			+ ";Lee un número por teclado que pida el precio de un producto (puede tener decimales) y"
			+ " calcule el precio final con IVA. El IVA sera una constante que sera del 21%"
			+ ";Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while."
			+ ";Haz el mismo ejercicio anterior con un bucle for."
			+ ";Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle"
			+ " que desees." + ";Realiza una aplicación que nos pida un número de ventas a introducir, después nos"
			+ " pedirá tantas ventas por teclado como número de ventas se hayan indicado.\nAl final"
			+ " mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no."
			+ ";Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral"
			+ " o no. Usa un switch para ello."
			+ ";Escribe una aplicación con un String que contenga una contraseña cualquiera. Después"
			+ " se te pedirá que introduzcas la contraseña, con 3 intentos.\nCuando aciertes ya no pedirá mas"
			+ " la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición"
			+ " de salida (3 intentos y si acierta sale, aunque le queden intentos)."
			+ ";Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos (int) y un signo"
			+ " aritmético (String), según este último se realizara la operación correspondiente.\n Al final"
			+ " mostrara el resultado en un cuadro de dialogo.";

	/*
	 * 1) Declara 2 variables numéricas (con el valor que desees), he indica cual es
	 * mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores
	 * para comprobar que funciona.
	 */

	static void ejercicio1() {
		int valores[] = new int[2];
		Scanner inputData = new Scanner(System.in);

		System.out.println("Introduce 2 números, y te digo cual es mayor.");
		for (int i = 0; i < 2; i++) {
			System.out.print("Introduce el número " + (i + 1) + " : ");
			valores[i] = inputData.nextInt();
		}

		if (valores[0] == valores[1])
			System.out.println(valores[0] + " es igual " + valores[1]);
		else if (valores[0] > valores[1])
			System.out.println(valores[0] + " es mayor que " + valores[1]);
		else
			System.out.println(valores[1] + " es mayor que " + valores[0]);
	}

	/*
	 * 2) Declara un String que contenga tu nombre, después muestra un mensaje de
	 * bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca
	 * “Bienvenido Fernando”.
	 */

	static void ejercicio2(Scanner scan) {
		System.out.println("Introduce tu nombre: ");
		String name = scan.next();
		System.out.println("Bienvenido " + name);
	}

	/*
	 * 3) Modifica la aplicación anterior, para que nos pida el nombre que queremos
	 * introducir (recuerda usar JOptionPane).
	 */

	static void ejercicio3() {
		System.out.println("Busca la nueva ventana flotante");
		String name = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido " + name);
	}

	/*
	 * 4) Haz una aplicación que calcule el área de un circulo (pi*R). El radio se
	 * pedirá por teclado (recuerda pasar de String a double con
	 * Double.parseDouble). Usa la constante PI y el método pow de Math.
	 */

	static void ejercicio4() {
		System.out.println("Busca la nueva ventana flotante");
		String radioStr = JOptionPane.showInputDialog("Calcular área del circulo. Introduce el radio.");
		double valor = Double.parseDouble(radioStr);
		JOptionPane.showMessageDialog(null, "El área es: " + (Math.pow(valor, 2) * Math.PI));
	}

	/*
	 * 5) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si
	 * no lo es, también debemos indicarlo.
	 */
	static void ejercicio5() {
		System.out.println("Busca la nueva ventana flotante");
		String numStr = JOptionPane.showInputDialog("Calculadora de números divisibles por 2. Introduce un número.");
		double num = Double.parseDouble(numStr);

		if (esDivisible(num, 2))
			JOptionPane.showMessageDialog(null, "El numero " + num + " es divisble por 2");
		else
			JOptionPane.showMessageDialog(null, "El numero " + num + " NO es divisble por 2");
	}

	/*
	 * 6) Lee un número por teclado que pida el precio de un producto (puede tener
	 * decimales) y calcule el precio final con IVA. El IVA sera una constante que
	 * sera del 21%
	 */

	static void ejercicio6() {
		final int IVA = 21;
		System.out.println("Busca la nueva ventana flotante");
		String numStr = JOptionPane.showInputDialog("Calcular precio final de un producto. Introduce el precio.");
		double valorFinal = (Double.parseDouble(numStr) * 1.21);
		JOptionPane.showMessageDialog(null, "Precio final: " + valorFinal + " IVA incluido");
	}

	/*
	 * 7) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
	 */

	static void ejercicio7() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
	}
	/*
	 * 8) Haz el mismo ejercicio anterior con un bucle for
	 */

	static void ejercicio8() {
		for (int i = 1; i <= 100; i++)
			System.out.println(i);
	}

	/*
	 * 9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
	 * Utiliza el bucle que desees.
	 */

	static void ejercicio9() {
		for (int i = 1; i <= 100; i++) {
			if (esDivisible(i, 2) || esDivisible(i, 3))
				System.out.println(i);
		}

	}

	/*
	 * 10) Realiza una aplicación que nos pida un número de ventas a introducir,
	 * después nos pedirá tantas ventas por teclado como número de ventas se hayan
	 * indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que
	 * se repite y lo que no.
	 * 
	 */

	static void ejercicio10(Scanner scan) {
		System.out.println("¿Cuantas ventas quieres introducir? ");
		int nVentas = scan.nextInt();
		double sumaTotalVentas = 0;

		System.out.println("Introduce el valor de cada venta");
		for (int i = 0; i < nVentas; i++) {
			System.out.println("Valor venta " + (i + 1));
			sumaTotalVentas = scan.nextDouble() + sumaTotalVentas;
		}

		System.out.println("El valor total de las ventas es " + sumaTotalVentas);
	}

	/*
	 * 11) Crea una aplicación que nos pida un día de la semana y que nos diga si es
	 * un día laboral o no. Usa un switch para ello.
	 */
	
	static void ejercicio11(Scanner scan) {	
		System.out.println("Busca la nueva ventana flotante");
		String diaLaborables [] = {"lunes","martes","miercoles","jueves","viernes","sabado"};
		String diaBuscado = JOptionPane.showInputDialog("Escriba un dia de la semana y te digo si es laborable.");
		String option = "";
		
		if(diaBuscado.compareTo("Domingo") == 0)
			option = "NoLaborable";
		else {
			for(String dia:diaLaborables)
				if(dia.compareTo(diaBuscado.toLowerCase()) == 0) {
					option = "Laborable";
					break;
				}
					
		}
			
	
		switch (option) {
		case "Laborable":
			JOptionPane.showMessageDialog(null, diaBuscado + " es laborable");
			break;
		case "NoLaborable":
			JOptionPane.showMessageDialog(null, diaBuscado + " no es laborable");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El valor dado no es valido");
			break;
		}

	}
	

	/*
	 * 12) Escribe una aplicación con un String que contenga una contraseña
	 * cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
	 * intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
	 * mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3
	 * intentos y si acierta sale, aunque le queden intentos).
	 */

	static void ejercicio12() {
		System.out.println("Busca la nueva ventana flotante");
		String pass = JOptionPane.showInputDialog("Escriba una nueva contraseña");
		String auxPass;
		int intentos = 3;
		
		do {
			auxPass = JOptionPane.showInputDialog("Introduzca la contraseña para entrar. Intentos restantes: " + intentos);
			
			if(auxPass.compareTo(pass) == 0) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				intentos = 0;
			}		
			else {
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta.");
				intentos--;
			}
			
		}while(intentos != 0);
	}
	
	/*
	 * 13) Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos
	 * (int) y un signo aritmético (String), según este último se realizara la
	 * operación correspondiente. Al final mostrara el resultado en un cuadro de
	 * dialogo. Los signos aritméticos disponibles son: +: suma los dos operandos.
	 * -: resta los operandos. *: multiplica los operandos. /: divide los operandos,
	 * este debe dar un resultado con decimales (double) ^: 1º operando como base y
	 * 2º como exponente. %: módulo, resto de la división entre operando1 y
	 * operando2
	 */

	static void CalculadoraInversa() {
		System.out.println("Busca la nueva ventana flotante");
		int operandos [] = new int [2];
		
		for(int i = 0; i < 2; i++) 
			operandos[i] = Integer.parseInt(JOptionPane.
					showInputDialog("Escriba 2 operandos. Operando " + operandos[i] + "."));
		String signoOp = JOptionPane.showInputDialog("Escriba el signo de la operación deseada. (+,-,*,/,^,%) " );
		
		switch(signoOp) {
		case "+":
			JOptionPane.showMessageDialog(null, operandos[0] + " + " + operandos[1] + " = " + (operandos[0] + operandos[1]));
			break;
		case "-":
			JOptionPane.showMessageDialog(null,  operandos[0] + " - " + operandos[1] + " = " + (operandos[0] - operandos[1]));
			break;
		case "*":
			JOptionPane.showMessageDialog(null,  operandos[0] + " * " + operandos[1] + " = " + (operandos[0] * operandos[1]));
			break;
		case "/":
			JOptionPane.showMessageDialog(null,  operandos[0] + " / " + operandos[1] + " = " + (operandos[0] / operandos[1]));
			break;
		case "^":
			JOptionPane.showMessageDialog(null,  operandos[0] + " ^ " + operandos[1] + " = " + (Math.pow(operandos[0], operandos[1])));
			break;
		case "%":
			JOptionPane.showMessageDialog(null,  operandos[0] + " % " + operandos[1] + " = " + (operandos[0] % operandos[1]));
			break;
		}
	}

	/*
	 * Metodos auxiliares
	 */

	static void printEjercio(int option) {
		System.out.println("---------------------------");
		System.out.println("       Ejercicio " + option);
		System.out.println("---------------------------");
	}

	static void printFinEjercicio() {
		System.out.println("---------------------------");
		System.out.println("       Fin Ejercicio       ");
		System.out.println("---------------------------");
	}

	static boolean esDivisible(double dividendo, double divisor) {
		return (dividendo % divisor) == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String[] enunciados = enunciadosBrutos.split(";");
		int option = 0;
		
		
		// Este menu es horrible. Implementar algo mejor para futuras practicas.
		do {
			System.out.println("Elige cual ejercicio quieres ver: ");

			for (int i = 0; i < 14; i++) {
				System.out.println(i + ". " + enunciados[i]);
			}

			option = scan.nextInt();

			switch (option) {
			case 0:
				System.out.println("Hasta luego.");
				scan.close();
				break;
			case 1:
				printEjercio(option);
				ejercicio1();
				printFinEjercicio();
				break;
			case 2:
				printEjercio(option);
				ejercicio2(scan);
				printFinEjercicio();
				break;
			case 3:
				printEjercio(option);
				ejercicio3();
				printFinEjercicio();
				break;
			case 4:
				printEjercio(option);
				ejercicio4();
				printFinEjercicio();
				break;
			case 5:
				printEjercio(option);
				ejercicio5();
				printFinEjercicio();
				break;
			case 6:
				printEjercio(option);
				ejercicio6();
				printFinEjercicio();
				break;
			case 7:
				printEjercio(option);
				ejercicio7();
				printFinEjercicio();
				break;
			case 8:
				printEjercio(option);
				ejercicio8();
				printFinEjercicio();
				break;
			case 9:
				printEjercio(option);
				ejercicio9();
				printFinEjercicio();
				break;
			case 10:
				printEjercio(option);
				ejercicio10(scan);
				printFinEjercicio();
				break;
			case 11:
				printEjercio(option);
				ejercicio11(scan);
				printFinEjercicio();
				break;
			case 12:
				printEjercio(option);
				ejercicio12();
				printFinEjercicio();
				break;
			case 13:
				printEjercio(option);
				CalculadoraInversa();
				printFinEjercicio();
				break;
			default:
				System.err.println("Introduzca un valor valido. (Entero positivo del 0 al 13)");
				break;
			}

		} while (option != 0);

	}

}
