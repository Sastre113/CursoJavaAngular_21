/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;
import com.ejercicio1.dto.Proveedor;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IProveedorService {
	
	public List<Proveedor> listarProveedores();
	
	public Proveedor añadirProveedor(Proveedor pieza);
	
	public Proveedor actualizarProveedor(Proveedor pieza);
	
	public void eliminarProveedor(String id);
	
	public Proveedor getProveedorXId(String id);
	
}
