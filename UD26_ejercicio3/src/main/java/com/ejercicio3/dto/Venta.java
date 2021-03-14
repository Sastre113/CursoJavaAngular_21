/**
 * 
 */
package com.ejercicio3.dto;

import javax.persistence.*;

/**
 * @author Miguel A. Sastre
 *
 */
@Entity
@Table(name="venta")//en caso que la tabla sea diferente
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="maquinaregistradora_id")
	private MaquinaRegistradora maquinaRegistradora;
	
	@ManyToOne
	@JoinColumn(name="producto_id")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="cajero_id")
	private Cajero cajero;
	
	/**
	 * Constructor por defecto 
	 */
	
	public Venta() { }

	/**
	 * @param id
	 * @param precio
	 * @param maquinaRegistradora
	 * @param producto
	 * @param cajero
	 */
	public Venta(int id,MaquinaRegistradora maquinaRegistradora, Producto producto, Cajero cajero) {
		this.id = id;
		this.maquinaRegistradora = maquinaRegistradora;
		this.producto = producto;
		this.cajero = cajero;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the maquinaRegistradora
	 */
	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	/**
	 * @param maquinaRegistradora the maquinaRegistradora to set
	 */
	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the cajero
	 */
	public Cajero getCajero() {
		return cajero;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", maquinaRegistradora=" + maquinaRegistradora + ", producto="
				+ producto + ", cajero=" + cajero + "]";
	}

}
