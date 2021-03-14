/**
 * 
 */
package com.ejercicio4.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Miguel A. Sastre
 *
 */

@Entity
@Table(name="equipo")//en caso que la tabla sea diferente
public class Equipo {
	
	@Id
	@Column (name = "numserie")
	private String numSerie;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "numserie")
	private List<Reserva> reserva;
	
	@ManyToOne
	@JoinColumn(name="facultad_id")
	private Facultad facultad;
	
	
	public Equipo() {
		
	}
	

	/**
	 * @param numSerie
	 * @param nombre
	 * @param reserva
	 * @param facultad
	 */
	public Equipo(String numSerie, String nombre, List<Reserva> reserva, Facultad facultad) {
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.reserva = reserva;
		this.facultad = facultad;
	}
	
	

	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}


	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
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
	 * @return the reserva
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}


	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}


	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}


	@Override
	public String toString() {
		return "Equipo [numSerie=" + numSerie + ", nombre=" + nombre + ", reserva=" + reserva + ", facultad="
				+ facultad + "]";
	}

}
