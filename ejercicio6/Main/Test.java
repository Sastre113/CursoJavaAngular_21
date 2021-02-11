/**
 * 
 */
package Main;


import java.util.Random;
import javax.swing.JOptionPane;
import Models.Cine;
import Models.Espectador;
import Models.Pelicula;

/**
 * @author Miguel A. Sastre
 *
 */
public class Test {
	
	static void menu() {

		String todasOpciones[] = autoGenerarOpciones(2);
		boolean exit = false;
		do {
			Object opcion = JOptionPane.showInputDialog(null, "Elige que Test quieres realizar" , "Test" ,
					JOptionPane.QUESTION_MESSAGE, null, todasOpciones, todasOpciones[0]);

			if (opcion != null) {
				int opcionElegida = Integer.parseInt(opcion.toString().substring(5, 7));
				System.out.println("Opcion elegida " + opcionElegida);

				switch (opcionElegida) {
				case 1:
					test1();
					break;
				case 2:
					test2();
					break;
				}
			} else
				exit = true;

		} while (!exit);
	}
	
	private static String[] autoGenerarOpciones(int size) {
		String[] options = new String[size];

		for (int i = 0; i < size; i++) {
			if (i < 9)
				options[i] = "Test 0" + (i + 1);
			else
				options[i] = "Test " + (i + 1);
		}

		return options;
	}
	
	
	public static void test1() {
		Cine sala1 = new Cine(new Pelicula("Mad Max",2.45,18,"George Miller"), 4.5);
		
		sala1.sentarUsuario("5E", new Espectador("Geralt",113,150));
		sala1.sentarUsuario("8I", new Espectador("Yennefer",98,20));
		sala1.sentarUsuario("1A", new Espectador("Yaskier",32,6));
		sala1.sentarUsuario("2I", new Espectador("Zoltan",72,4)); // No podrá entrar, no tiene suficiente dinero.
		sala1.sentarUsuario("1A", new Espectador("Ciri",72,10));  // 1A esta ocupada, ocupará 1B
		sala1.sentarUsuario("5E", new Espectador("Emiel Regis Rohellec Terzieff-Godefroy",72,10)); //  5E esta ocupada, ocupará 1C
		System.out.println(sala1.toString());
	}
	
	public static void test2() {
		System.out.println("\n\n**********");
		System.out.println("* Test 2 *");
		System.out.println("**********");
		Cine sala = nuevaSala();
		System.out.println("Nueva sala creada: \n" + sala.toString());		
		llenarSala(sala);
		System.out.println("Despues de abrir las puertas: \n" + sala.toString());
	}
	
	
	
	public static Cine nuevaSala() {
		String [] pelicula = randomTitle();
		return new Cine(new Pelicula(pelicula[0],randomDuration(),randomMinAge(),pelicula[1]),randomTicket());
	}
	
	public static void llenarSala(Cine sala) {
		int espectadores = new Random().nextInt(73);
		
		for(int i = 0; i < espectadores; i++)
			sala.sentarUsuario(randomSeat(), new Espectador(randomName(),randomAge(),randomMoney()));
		
		System.out.println("Espectadores que quieren entrar a la sala: " + espectadores + "\n");
	}
	
	/**
	 * Métodos auxiliares para crear nuevas salas.
	 * 
	 */
	
	public static String [] randomTitle() {
		String [] title = {"La comunidad del anillo-Peter Jackson","Las dos torres-Peter Jackson"
				,"El retorno del rey-Peter Jackson","Beetlejuice-Tim Burton","The Matrix-Lana Wachowski",
				"Mad Max-George Miller","El guerrero de la carretera-George Miller","El retorno del jedi-Richard Marquand",
				"Regreso al futuro-Robert Zemeckis"};
		return title[new Random().nextInt(title.length)].split("-");
	}
	
	public static int randomMinAge() {
		int [] pegi = {3,7,12,16,18};		
		return pegi[new Random().nextInt(5)];
	}
	
	public static double randomTicket() {
		return (double) new Random().nextInt(100)/10;
	}
	
	public static double randomDuration() {
		return (double) new Random().nextInt(350)/100;
	}
	
	public static String randomSeat() {
		return (new Random().nextInt(9 - 1) + 1) + Character.toString(new Random().nextInt(74-65) + 65);
	}
	
	
	
	/**
	 * Métodos auxiliares para nuevos espectadores.
	 * 
	 */
	public static String randomName() {
		String [] name = {"Pedro","Maria","Juan","Elisabeth","Geralt","Yennefer","Yaskier","Undomiel","Aragorn",
				"Cirilla","Gandalf","Eowyn","Santiago","Carlota","Fran","Monica","Jose","Josefa","Marcos","Matilda",
				"Maria","Miguel","Emiel Regis Rohellec Terzieff-Godefroy","Cahir Mawr Dyffryn aep Ceallach",
				"Philippa Eilhart","Dijkstra","Vilgefortz","Leo Bonhart","Milva","Triss Merigold","King Foltest"};
		return name[new Random().nextInt(name.length)];
	}
	
	public static int randomAge() {
		return new Random().nextInt(30);
	}
	
	public static double randomMoney() {
		return (double) new Random().nextInt(150)/10;
	}
	
	
	
	
	
}
