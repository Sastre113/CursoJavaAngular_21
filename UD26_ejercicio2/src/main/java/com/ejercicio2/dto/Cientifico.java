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
@Table(name="cientifico")//en caso que la tabla sea diferente
public class Cientifico {
	
	@Id
	private String dni;
	@Column (name = "nomapel")
	private String nomApel;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<AsignadoA> asignadoA;
	
	public Cientifico() {
		
	}
	
	
	/**
	 * @param dni
	 * @param nomApel
	 * @param asignadoA
	 */
	public Cientifico(String dni, String nomApel, List<AsignadoA> asignadoA) {
		this.dni = dni;
		this.nomApel = nomApel;
		this.asignadoA = asignadoA;
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
	 * @return the nomApel
	 */
	public String getNomApel() {
		return nomApel;
	}


	/**
	 * @param nomApel the nomApel to set
	 */
	public void setNomApel(String nomApel) {
		this.nomApel = nomApel;
	}


	/**
	 * @return the asignadoA
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
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
		return "Cientifico [dni=" + dni + ", nomApel=" + nomApel + ", asignadoA=" + asignadoA + "]";
	}
}
