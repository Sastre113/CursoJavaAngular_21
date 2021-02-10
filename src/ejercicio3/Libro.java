/**
 * 
 */
package ejercicio3;

/**
 * @author Miguel A. Sastre
 *
 */
public class Libro {
	
	protected int isbn;
	protected String titulo;
	protected String autor;
	protected int numPaginas;
	
	/**
	 * 
	 */
	public Libro() {
		
	}

	/**
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numPaginas
	 */
	public Libro(int isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		return this.titulo + " con ISBN = " + isbn + " , creado por "+ this.autor + " tiene " + this.numPaginas + " páginas.";
	}
}
