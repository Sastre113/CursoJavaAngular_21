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
@Table(name="pelicula")//en caso que la tabla sea diferente
public class Pelicula {
	
	@Id
	@Column (name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "calificacionedad")
	private Long calificacionEdad;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Sala> sala;
	
	public Pelicula() {
		
	}
	
	
	
	/**
	 * @param codigo
	 * @param nombre
	 * @param calificacionEdad
	 * @param sala
	 */
	public Pelicula(Long codigo, String nombre, Long calificacionEdad, List<Sala> sala) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
		this.sala = sala;
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
	 * @return the calificacionEdad
	 */
	public Long getCalificacionEdad() {
		return calificacionEdad;
	}

	/**
	 * @param calificacionEdad the calificacionEdad to set
	 */
	public void setCalificacionEdad(Long calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	/**
	 * @return the sala
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	



	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacionEdad=" + calificacionEdad
				+ ", sala=" + sala + "]";
	}
	
	
	
}
