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
@Table(name="asignadoa")//en caso que la tabla sea diferente
public class AsignadoA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="cientifico_id")
	private Cientifico cientifico;
	
	
	@ManyToOne
	@JoinColumn(name="proyecto_id")
	private Proyecto proyecto;
	
	/**
	 * Constructor por defecto 
	 */
	
	public AsignadoA() { }
	
	
	/**
	 * @param cientifico
	 * @param proyecto
	 */
	public AsignadoA(Cientifico cientifico, Proyecto proyecto) {
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}


	/**
	 * @return the cientifico
	 */
	public Cientifico getCientifico() {
		return cientifico;
	}

	/**
	 * @param cientifico the cientifico to set
	 */
	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	/**
	 * @return the proyecto
	 */
	public Proyecto getProyecto() {
		return proyecto;
	}

	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "AsignadoA [cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}


}
