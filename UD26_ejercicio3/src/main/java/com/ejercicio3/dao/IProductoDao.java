/**
 * 
 */
package com.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio3.dto.Producto;


/**
 * @author Miguel A. Sastre
 *
 */
public interface IProductoDao extends JpaRepository<Producto, Long> {

}
