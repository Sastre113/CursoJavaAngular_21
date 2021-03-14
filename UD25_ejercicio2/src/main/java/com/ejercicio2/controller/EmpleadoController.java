/**
 * 
 */
package com.ejercicio2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio2.dto.Empleado;
import com.ejercicio2.service.EmpleadoServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImpl.listarEmpleados();
	}

	@PostMapping("/empleados")
	public Empleado añadirEmpleados(Empleado empleado) {
		return empleadoServiceImpl.añadirEmpleado(empleado);
	}

	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleados(@PathVariable(name="dni")String dni,Empleado empleado) {
		Empleado ptEmpleado = new Empleado();
		
		ptEmpleado = empleadoServiceImpl.getEmpleadosXDni(dni);
		
		ptEmpleado.setNombre(empleado.getNombre());
		ptEmpleado.setApellido(empleado.getApellido());
		ptEmpleado.setDepartamento(empleado.getDepartamento());
		
		return empleadoServiceImpl.actualizarEmpleado(ptEmpleado);
	}

	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleados(@PathVariable(name="dni") String dni) {
		empleadoServiceImpl.eliminarEmpleado(dni);
	}

	@GetMapping("/empleados/{dni}")
	public Empleado getEmpleadosXId(@PathVariable(name="dni") String dni) {
		return empleadoServiceImpl.getEmpleadosXDni(dni);
	}

	
}
