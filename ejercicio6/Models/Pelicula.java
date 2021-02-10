/**
 * 
 */
package Models;

/**
 * @author Miguel A. Sastre
 *
 */
public class Pelicula {
	
	protected String titulo;
	protected double duracion;
	protected int minEdad;
	protected String director;
	/**
	 * @param titulo
	 * @param duracion
	 * @param minEdad
	 * @param director
	 */
	public Pelicula(String titulo, double duracion, int minEdad, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.minEdad = minEdad;
		this.director = director;
	}
	public String getTitulo() {
		return titulo;
	}
	public double getDuracion() {
		return duracion;
	}
	public int getMinEdad() {
		return minEdad;
	}
	public String getDirector() {
		return director;
	}
	
	
}
