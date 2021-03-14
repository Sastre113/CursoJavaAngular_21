/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import com.ejercicio2.dto.Empleado;
import com.ejercicio2.dto.Departamento;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IEmpleadoService {
	
	public List<Empleado> listarEmpleados();
	
	public Empleado añadirEmpleado(Empleado empleado);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(String dni);
	
	public Empleado getEmpleadosXDni(String dni);
}
