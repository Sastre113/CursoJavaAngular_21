/**
 * 
 */
package com.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio1.dto.Fabricante;


/**
 * @author Miguel A. Sastre
 *
 */
public interface IFabricanteDao extends JpaRepository<Fabricante, Long> {

}
