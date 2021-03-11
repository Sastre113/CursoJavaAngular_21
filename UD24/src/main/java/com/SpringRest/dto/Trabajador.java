/**
 * 
 */
package com.SpringRest.dto;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.*;

/**
 * @author Miguel A. Sastre
 *
 */

@Entity
@Table(name="trabajador")
public class Trabajador {
	
	enum Trabajo{
		TESTER(1300),ANALISTA(2100),INGENIERO(2000),DISEÑADOR(1600),DESARROLLADOR(1200);
		private Double salario;
		
		Trabajo(double salario){
			this.salario = salario;
		}
		
		Double getSalario() {
			return this.salario;
		}
		
		
		static Double obtenerSalarioPorTrabajo(String trabajo) {
			boolean encontrado = false;
			Double sueldo = 0.0;
			List<Trabajo> lista = Arrays.asList(Trabajo.values());
			Iterator<Trabajo> it = lista.iterator();
			
			while(!encontrado && it.hasNext()) {
				Trabajo aux = it.next();
				if(aux.toString().compareToIgnoreCase(trabajo) == 0) {
					encontrado = true;
					sueldo = aux.getSalario();
				}
			}
			
			return sueldo;
		}
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nomapel")
	private String nomApel;
	private String trabajo;
	private Double salario;
	
	public Trabajador() {
		
	}

	/**
	 * @param id
	 * @param nomApel
	 * @param trabajo
	 */
	public Trabajador(Integer id, String nomApel, String trabajo) {
		this.id = id;
		this.nomApel = nomApel;
		this.trabajo = trabajo ;
		this.salario = Trabajo.obtenerSalarioPorTrabajo(trabajo);
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNomApel() {
		return nomApel;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNomApel(String nombre) {
		this.nomApel = nombre;
	}


	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	/**
	 * @return the salario
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nomApel=" + nomApel + ", trabajo=" + trabajo
				+ ", salario=" + salario + "]";
	}
	
	
	
}
