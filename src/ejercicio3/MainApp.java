package ejercicio3;

/**
 * @author Miguel A. Sastre
 *
 */

public class MainApp {
	
	private static void mayorPaginas(Libro libro1, Libro libro2) {
		Libro mayorPaginas;
		mayorPaginas = (libro1.getNumPaginas() > libro2.getNumPaginas()) ? libro1:libro2;
		
		System.out.println(mayorPaginas.getTitulo() + " tiene más páginas");
	}
	
	public static void main(String[] args) {
		Libro theWitcher = new Libro(9781478,"La espada del destino","Andrzej Sapkowski",200);
		Libro lotr = new Libro();
		
		// Agregando manualmente los atributos.
		lotr.setTitulo("La comunidad del anillo");
		lotr.setIsbn(9780553);
		lotr.setAutor("J.R.R Tolkien");
		lotr.setNumPaginas(568);
		
		System.out.println(theWitcher.toString());
		System.out.println(lotr.toString());
		mayorPaginas(lotr,theWitcher);
	}
}
