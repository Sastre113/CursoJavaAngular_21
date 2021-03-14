/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import com.ejercicio3.dto.MaquinaRegistradora;
import com.ejercicio3.dto.Venta;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IVentaService {
	
	public List<Venta> listarVenta();
	
	public Venta añadirVenta(Venta venta);

	public Venta actualizarVenta(Venta venta);
	
	public void eliminarVenta(Long id);
	
	public Venta getVentaXId(Long id);
}
