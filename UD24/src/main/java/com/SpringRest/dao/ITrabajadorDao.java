/**
 * 
 */
package com.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringRest.dto.Trabajador;


/**
 * @author Miguel A. Sastre
 *
 */
public interface ITrabajadorDao extends JpaRepository<Trabajador,Integer> {

}
