/**
 * 
 */
package com.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio3.dto.Venta;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IVentaDao extends JpaRepository<Venta, Long> {

}
