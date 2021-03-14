/**
 * 
 */
package com.ejercicio3.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Miguel A. Sastre
 *
 */

@Entity
@Table(name="cajero")//en caso que la tabla sea diferente
public class Cajero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Venta> venta;
	
	public Cajero() {
		
	}

	/**
	 * @param codigo
	 * @param nomapels
	 * @param precio
	 * @param venta
	 */
	public Cajero(Long codigo, String nomapels, List<Venta> venta) {
		this.codigo = codigo;
		this.nomapels = nomapels;
		this.venta = venta;
	}


	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}



	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}



	/**
	 * @return the nomapels
	 */
	public String getNombre() {
		return nomapels;
	}



	/**
	 * @param nomapels the nomapels to set
	 */
	public void setNombre(String nomapels) {
		this.nomapels = nomapels;
	}




	/**
	 * @return the venta
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}



	/**
	 * @param venta the venta to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}



	@Override
	public String toString() {
		return "Cajero [codigo=" + codigo + ", nomapels=" + nomapels + ", venta=" + venta + "]";
	}
	
}
