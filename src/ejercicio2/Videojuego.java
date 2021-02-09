/**
 * 
 */
package ejercicio2;

/**
 * @author Miguel A. Sastre
 *
 */
public class Videojuego implements Entregable{
	/*
	 * Sus atributos son titulo, horas estimadas, entregado, genero y compañia 
	 * • Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de
	 * atributos serán valores por defecto según el tipo del atributo.
	 */
	
	/**
	 * Constantes
	 */
	
	private static final String DEFAULT_TITULO = "";
	private static final double DEFAULT_HORAS = 10;
	private static final boolean DEFAULT_ENTREGADO = false;
	private static final String DEFAULT_GENERO = "";
	private static final String DEFAULT_COMPAÑIA = "";
	
	
	/**
	 * Atributos
	 */
	
	protected String titulo;
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	protected double horas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;
	
	/**
	 * 
	 */
	
	public Videojuego() {
		this(DEFAULT_TITULO,DEFAULT_HORAS,DEFAULT_GENERO,DEFAULT_COMPAÑIA);
	}
	
	/**
	 * @param titulo
	 * @param horas
	 */
	
	public Videojuego(String titulo, double horas) {
		this.titulo = titulo;
		this.horas = horas;
	}
	
	/**
	 * @param titulo
	 * @param horas
	 * @param genero
	 * @param compañia
	 */
	
	public Videojuego(String titulo, double horas, String genero, String compañia) {
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compañia = compañia;
		this.entregado = this.DEFAULT_ENTREGADO;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public double getHoras() {
		return horas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompañia() {
		return compañia;
	}
	


	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;	
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
	int compare = 0;
		
		if((double) a > this.getHoras())
			compare = 1;
		else if((double) a < this.getHoras())
			compare = -1;
		
		return compare;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compañia=" + compañia + "]";
	}
}
