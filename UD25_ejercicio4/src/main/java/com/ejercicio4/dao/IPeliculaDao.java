/**
 * 
 */
package com.ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio4.dto.Pelicula;


/**
 * @author Miguel A. Sastre
 *
 */
public interface IPeliculaDao extends JpaRepository<Pelicula, Long> {

}
