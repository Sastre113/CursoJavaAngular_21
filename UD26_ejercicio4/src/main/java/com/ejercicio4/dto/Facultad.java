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
@Table(name="facultad")//en caso que la tabla sea diferente
public class Facultad {
	
	@Id
	private Long codigo;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Equipo> equipo;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Investigador> investigador;
	
	public Facultad() {
		
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param equipo
	 * @param investigador
	 */
	public Facultad(Long codigo, String nombre, List<Equipo> equipo, List<Investigador> investigador) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.equipo = equipo;
		this.investigador = investigador;
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
	 * @param equipo the equipo to set
	 */
	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = investigador;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public List<Investigador> getInvestigador() {
		return investigador;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipo> getEquipo() {
		return equipo;
	}


}
