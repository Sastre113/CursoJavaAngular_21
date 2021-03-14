/**
 * 
 */
package com.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio1.dto.Proveedor;


/**
 * @author Miguel A. Sastre
 *
 */
public interface IProveedorDao extends JpaRepository<Proveedor, String> {

}
