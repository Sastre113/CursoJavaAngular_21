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
@Table(name="investigador")//en caso que la tabla sea diferente
public class Investigador {
	
	@Id
	private String dni;
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name = "dni")
	private List<Reserva> reserva;
	
	@ManyToOne
	@JoinColumn(name="investigador_facultad_id")
	private Facultad facultad;
	
	public Investigador() {
		
	}
	
	

	/**
	 * @param dni
	 * @param nomapels
	 * @param precio
	 * @param reserva
	 * @param facultad
	 */
	public Investigador(String dni, String nomapels, List<Reserva> reserva, Facultad facultad) {
		this.dni = dni;
		this.nomapels = nomapels;
		this.reserva = reserva;
		this.facultad = facultad;
	}


	

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}



	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}



	/**
	 * @return the nomapels
	 */
	public String getNomapels() {
		return nomapels;
	}



	/**
	 * @param nomapels the nomapels to set
	 */
	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
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
		return "Investigador [dni=" + dni + ", nomapels=" + nomapels + ", reserva=" + reserva + ", facultad="
				+ facultad + "]";
	}
}
