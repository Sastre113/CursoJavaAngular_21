/**
 * 
 */
package com.ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio4.dto.Reserva;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IReservaDao extends JpaRepository<Reserva, String> {

}
