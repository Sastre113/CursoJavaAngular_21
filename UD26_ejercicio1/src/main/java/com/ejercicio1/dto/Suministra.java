/**
 * 
 */
package com.ejercicio1.dto;

import javax.persistence.*;

/**
 * @author Miguel A. Sastre
 *
 */
@Entity
@Table(name="suministra")//en caso que la tabla sea diferente
public class Suministra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "precio")
	private Double precio;

	
	@ManyToOne
	@JoinColumn(name="pieza_id")
	private Pieza pieza;
	
	
	@ManyToOne
	@JoinColumn(name="proveedor_id")
	private Proveedor proveedor;
	
	/**
	 * Constructor por defecto 
	 */
	
	public Suministra() { }

	/**
	 * @param id
	 * @param precio
	 * @param pieza
	 * @param proveedor
	 */
	public Suministra(int id, Double precio, Pieza pieza, Proveedor proveedor) {
		this.id = id;
		this.precio = precio;
		this.pieza = pieza;
		this.proveedor = proveedor;
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
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the pieza
	 */
	public Pieza getPieza() {
		return pieza;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", precio=" + precio + ", pieza=" + pieza + ", proveedor=" + proveedor + "]";
	}

	
}
