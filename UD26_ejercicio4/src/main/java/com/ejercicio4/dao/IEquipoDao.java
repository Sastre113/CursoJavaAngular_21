/**
 * 
 */
package com.ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio4.dto.Equipo;


/**
 * @author Miguel A. Sastre
 *
 */
public interface IEquipoDao extends JpaRepository<Equipo, String> {

}
