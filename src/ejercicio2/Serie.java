/**
 * 
 */
package ejercicio2;

/**
 * @author Miguel A. Sastre
 *
 */

/*
 * Crearemos una clase llamada Serie con las siguientes características: 
 * 	• Sus atributos son titulo, numero de temporadas, entregado, genero y creador. 
 * 	• Por defecto, el numero de temporadas es de 3 temporadas y entregado false. 
 * 		El resto de atributos serán valores por defecto según el tipo del atributo. 
 *	• Los constructores que se implementaran serán: 
 *		o Un constructor por defecto. 
 * 		o Un constructor con el titulo y creador. El resto por defecto. 
 * 		o Un constructor con todos los atributos, excepto de entregado.
 */
public class Serie implements Entregable {

	/**
	 * Constantes
	 */
	
	private static final String DEFAULT_TITULO = "";
	private static final int DEFAULT_TOTAL_TEMPORADAS = 3;
	private static final boolean DEFAULT_ENTREGADO = false;
	private static final String DEFAULT_GENERO = "";
	private static final String DEFAULT_CREADOR = "";
	
	/**
	 * Atributos
	 */
	
	protected String titulo;
	protected int totalTemporadas;
	protected boolean entregado;
	protected String genero;
	private String creador;
	
	
	
	
	/**
	 * 
	 */
	public Serie() {
		this(DEFAULT_TITULO,DEFAULT_TOTAL_TEMPORADAS,DEFAULT_GENERO,DEFAULT_CREADOR);
	}



	/**
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this(titulo,DEFAULT_TOTAL_TEMPORADAS,DEFAULT_GENERO,creador);
	}



	/**
	 * @param titulo
	 * @param totalTemporadas
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int totalTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.totalTemporadas = totalTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = this.DEFAULT_ENTREGADO;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getTotalTemporadas() {
		return totalTemporadas;
	}



	public void setTotalTemporadas(int totalTemporadas) {
		this.totalTemporadas = totalTemporadas;
	}

	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getCreador() {
		return creador;
	}



	public void setCreador(String creador) {
		this.creador = creador;
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
		
		if((int) a > this.getTotalTemporadas())
			compare = 1;
		else if((int) a < this.getTotalTemporadas())
			compare = -1;
		
		return compare;
	}
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", totalTemporadas=" + totalTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
