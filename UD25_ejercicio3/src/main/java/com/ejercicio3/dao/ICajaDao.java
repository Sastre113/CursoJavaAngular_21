/**
 * 
 */
package com.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio3.dto.Caja;

/**
 * @author Miguel A. Sastre
 *
 */
public interface ICajaDao extends JpaRepository<Caja, String> {

}
