/**
 * 
 */
package com.ejercicio3.dto;

import javax.persistence.*;

/**
 * @author Miguel A. Sastre
 *
 */
@Entity
@Table(name="caja")//en caso que la tabla sea diferente
public class Caja {
	
	@Id
	@Column(name = "numreferencia")
	private String numReferencia;
	private String contenido;
	private Double valor;

	
	@ManyToOne
	@JoinColumn(name="almacen_id")
	private Almacen almacen;
	
	/**
	 * Constructor por defecto 
	 */
	
	public Caja() { }

	/**
	 * @param numReferencia
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Caja(String numReferencia, String contenido, Double valor, Almacen almacen) {
		super();
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the numReferencia
	 */
	public String getNumReferencia() {
		return numReferencia;
	}

	/**
	 * @param numReferencia the numReferencia to set
	 */
	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

	

}
