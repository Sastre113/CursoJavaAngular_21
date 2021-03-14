/**
 * 
 */
package com.ejercicio2.dto;

import javax.persistence.*;

/**
 * @author Miguel A. Sastre
 *
 */
@Entity
@Table(name="empleado")//en caso que la tabla sea diferente
public class Empleado {
	
	@Id
	private String dni;
	private String nombre;
	private String apellidos;

	
	@ManyToOne
	@JoinColumn(name="departamento_id")
	private Departamento departamento;
	
	/**
	 * Constructor por defecto 
	 */
	
	public Empleado() { }

	
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param departamento
	 */
	public Empleado(String dni, String nombre, String apellido, Departamento departamento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.departamento = departamento;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellidos;
	}



	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}



	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}



	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellidos + ", departamento="
				+ departamento + "]";
	}

	

}
