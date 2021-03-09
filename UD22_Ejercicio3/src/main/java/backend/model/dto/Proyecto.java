/**
 * 
 */
package backend.model.dto;

/**
 * @author Miguel A. Sastre
 *
 */
public class Proyecto {
	private String id;
	private String nombre;
	private double horas;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the horas
	 */
	public double getHoras() {
		return horas;
	}
	/**
	 * @param horas the horas to set
	 */
	public void setHoras(double horas) {
		this.horas = horas;
	}
}
