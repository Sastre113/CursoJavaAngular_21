/**
 * 
 */
package com.ejercicio3.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Miguel A. Sastre
 *
 */

@Entity
@Table(name="maquinaregistradora")//en caso que la tabla sea diferente
public class MaquinaRegistradora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private Long piso;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Venta> venta;
	
	public MaquinaRegistradora() {
		
	}


	/**
	 * @param codigo
	 * @param piso
	 * @param venta
	 */
	public MaquinaRegistradora(Long codigo, Long piso, List<Venta> venta) {
		this.codigo = codigo;
		this.piso = piso;
		this.venta = venta;
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
	 * @return the piso
	 */
	public Long getPiso() {
		return piso;
	}


	/**
	 * @param piso the piso to set
	 */
	public void setPiso(Long piso) {
		this.piso = piso;
	}


	/**
	 * @return the venta
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}


	/**
	 * @param venta the venta to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}


	@Override
	public String toString() {
		return "MaquinaRegistradora [codigo=" + codigo + ", piso=" + piso + ", venta=" + venta + "]";
	}
}
