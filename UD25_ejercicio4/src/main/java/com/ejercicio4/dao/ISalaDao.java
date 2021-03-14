/**
 * 
 */
package com.ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio4.dto.Sala;

/**
 * @author Miguel A. Sastre
 *
 */
public interface ISalaDao extends JpaRepository<Sala, Long> {

}
