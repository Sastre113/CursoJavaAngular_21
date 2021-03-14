/**
 * 
 */
package com.ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio4.dto.Investigador;


/**
 * @author Miguel A. Sastre
 *
 */
public interface IInvestigadorDao extends JpaRepository<Investigador, String> {

}
