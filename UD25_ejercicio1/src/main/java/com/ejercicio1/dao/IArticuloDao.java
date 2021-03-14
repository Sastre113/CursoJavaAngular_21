/**
 * 
 */
package com.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio1.dto.Articulo;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IArticuloDao extends JpaRepository<Articulo, Long> {

}
