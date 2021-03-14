/**
 * 
 */
package com.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio3.dto.Cajero;


/**
 * @author Miguel A. Sastre
 *
 */
public interface ICajeroDao extends JpaRepository<Cajero, Long> {

}
