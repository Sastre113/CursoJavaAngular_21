/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public abstract class EjercicioX {
	protected String nombreDB;
	protected String tablas;
	protected String datos;

	public EjercicioX() {
		this.nombreDB = cargarNombreDB();
		this.tablas = cargarTablas();
		this.datos = cargarDatos();
		
	}
	
	/**
	 * @return
	 */
	protected abstract String cargarNombreDB();

	/**
	 * @return
	 */
	protected abstract String cargarTablas();

	/**
	 * @return
	 */
	protected abstract String cargarDatos();


	

	/**
	 * @return the nombreDB
	 */
	public String getNombreDB() {
		return nombreDB;
	}
	/**
	 * @return the tablas
	 */
	public String getTablas() {
		return tablas;
	}
	/**
	 * @return the datos
	 */
	public String getDatos() {
		return datos;
	}
	
	
	
}
