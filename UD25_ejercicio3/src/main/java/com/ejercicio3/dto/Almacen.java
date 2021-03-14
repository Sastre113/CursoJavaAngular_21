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
@Table(name="almacen")//en caso que la tabla sea diferente
public class Almacen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String lugar;
	private Long capacidad;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Caja> caja;
	
	public Almacen() {
		
	}

	
	/**
	 * @param codigo
	 * @param lugar
	 * @param capacidad
	 * @param caja
	 */
	public Almacen(Long codigo, String lugar, Long capacidad, List<Caja> caja) {
		super();
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
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
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}


	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	/**
	 * @return the capacidad
	 */
	public Long getCapacidad() {
		return capacidad;
	}


	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;
	}


	/**
	 * @return the caja
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja() {
		return caja;
	}



	/**
	 * @param caja the caja to set
	 */
	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}




	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + ", caja=" + caja + "]";
	}

	
	
}
