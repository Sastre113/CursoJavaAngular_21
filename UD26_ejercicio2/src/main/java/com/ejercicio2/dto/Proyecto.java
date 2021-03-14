/**
 * 
 */
package com.ejercicio2.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Miguel A. Sastre
 *
 */

@Entity
@Table(name="proyecto")//en caso que la tabla sea diferente
public class Proyecto {
	
	@Id
	@Column (name = "id")
	private String id;
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "horas")
	private int horas;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<AsignadoA> asignadoA;
	
	public Proyecto() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param asignadoA
	 */
	
	public Proyecto(String id, String nombre, int horas, List<AsignadoA> asignadoA) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignadoA = asignadoA;
	}



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
	public int getHoras() {
		return horas;
	}



	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}




	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getSuministra() {
		return asignadoA;
	}




	/**
	 * @param asignadoA the asignadoA to set
	 */
	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}



	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignadoA=" + asignadoA + "]";
	}


	
}
