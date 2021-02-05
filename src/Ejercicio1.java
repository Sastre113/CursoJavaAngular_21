import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio1 {
	/*
	 * 1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o
	 * triangulo. Pediremos que figura queremos calcular su área y según lo
	 * introducido pedirá los valores necesarios para calcular el área. Crea un
	 * método por cada figura para calcular cada área, este devolverá un número
	 * real. Muestra el resultado por pantalla. Aquí te mostramos que necesita cada
	 * figura: · Circulo: (radio^2)*PI · Triangulo: (base * altura) / 2 · Cuadrado:
	 * lado * lado
	 */

	static double circuloArea(double radio) {
		return (Math.pow(radio, 2)*Math.PI);
	}
	
	static double circuloCuadrado(double lado) {
		return (lado * lado);
	}
	
	static double circuloTriangulo(double base, double altura) {
		return (base * altura)/2;
	}

	public static void main() {
		String[] todasOpciones = { "Circulo", "Cuadrado", "Triangulo" };
		Object opcion = JOptionPane.showInputDialog(null, "¿De que figura quieres el área?", "Elige 1 una figura",
				JOptionPane.QUESTION_MESSAGE, null, todasOpciones, todasOpciones[0]);
		
		switch(opcion.toString()) {
		case "Circulo":
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Calcular área del circulo. Introduce el radio."));
			JOptionPane.showMessageDialog(null, "El area del circulo es " + circuloArea(radio));
			break;
		case "Cuadrado":
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Calcular área del cuadrado. Introduce el lado."));
			JOptionPane.showMessageDialog(null, "El area del circulo es " + circuloCuadrado(lado));
			break;
		case "Triangulo":
			double base = Double.parseDouble(JOptionPane.showInputDialog("Calcular área del triangulo. Introduce la base."));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Ahora introduce la altura"));
			JOptionPane.showMessageDialog(null, "El area del circulo es " + circuloTriangulo(base,altura));
			break;
		}
	}

}
