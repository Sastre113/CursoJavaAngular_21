/**
 * 
 */
package com.ejercicio4.dto;

import java.util.Date;

import javax.persistence.*;

/**
 * @author Miguel A. Sastre
 *
 */
@Entity
@Table(name="reserva")//en caso que la tabla sea diferente
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date comienzo;
	private Date fin;
	
	@ManyToOne
	@JoinColumn(name="equipo_id")
	private Equipo equipo;
	
	@ManyToOne
	@JoinColumn(name="investigador_id")
	private Investigador investigador;
	
	
	/**
	 * Constructor por defecto 
	 */
	
	public Reserva() { }


	/**
	 * @param id
	 * @param comienzo
	 * @param fin
	 * @param equipo
	 * @param investigador
	 */
	public Reserva(int id, Date comienzo, Date fin, Equipo equipo, Investigador investigador) {
		super();
		this.id = id;
		this.comienzo = comienzo;
		this.fin = fin;
		this.equipo = equipo;
		this.investigador = investigador;
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
	 * @return the comienzo
	 */
	public Date getComienzo() {
		return comienzo;
	}


	/**
	 * @param comienzo the comienzo to set
	 */
	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}


	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}


	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}


	/**
	 * @return the equipo
	 */
	public Equipo getEquipos() {
		return equipo;
	}


	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipos(Equipo equipo) {
		this.equipo = equipo;
	}


	/**
	 * @return the investigador
	 */
	public Investigador getInvestigadores() {
		return investigador;
	}


	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigadores(Investigador investigador) {
		this.investigador = investigador;
	}


	@Override
	public String toString() {
		return "Reserva [id=" + id + ", comienzo=" + comienzo + ", fin=" + fin + ", equipo=" + equipo
				+ ", investigador=" + investigador + "]";
	}

	
}
