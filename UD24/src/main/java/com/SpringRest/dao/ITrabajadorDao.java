/**
 * 
 */
package com.SpringRest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringRest.dto.Trabajador;


/**
 * @author Miguel A. Sastre
 *
 */
public interface ITrabajadorDao extends JpaRepository<Trabajador,Integer> {

	//Listar Trabajadores por campo "trabajo"
	public List<Trabajador> findByTrabajo(String trabajo);
}
