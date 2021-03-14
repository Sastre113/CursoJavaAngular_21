/**
 * 
 */
package com.ejercicio2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio2.dto.Departamento;


/**
 * @author Miguel A. Sastre
 *
 */
public interface IDepartamentoDao extends JpaRepository<Departamento, Long> {

}
