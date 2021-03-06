/**
 * 
 */
package Backend.controller;

import Backend.model.dto.Cliente;
import Backend.model.service.ClienteServ;
import Backend.view.*;

/**
 * @author Miguel A. Sastre
 *
 */
public class Controller {
	
	private ClienteServ clienteServ;
	private VentantaPrincipal ventanaPrincipal;
	private VentanaMostrarTodo ventanaMostrarTodo;
	private VentanaInsertar ventanaInsertar;
	private VentanaBuscar ventanaBuscar;
	
	/*
	 * Métodos getters y setters 
	 */
	
	/**
	 * @return the personaServ
	 */
	public ClienteServ getPersonaServ() {
		return clienteServ;
	}
	/**
	 * @param personaServ the personaServ to set
	 */
	public void setPersonaServ(ClienteServ personaServ) {
		this.clienteServ = personaServ;
	}
	/**
	 * @return the ventanaPrincipal
	 */
	public VentantaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}
	/**
	 * @param ventanaPrincipal the ventanaPrincipal to set
	 */
	public void setVentanaPrincipal(VentantaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
	/**
	 * @return the ventanaMostrarTodo
	 */
	public VentanaMostrarTodo getVentanaMostrarTodo() {
		return ventanaMostrarTodo;
	}
	/**
	 * @param ventanaMostrarTodo the ventanaMostrarTodo to set
	 */
	public void setVentanaMostrarTodo(VentanaMostrarTodo ventanaMostrarTodo) {
		this.ventanaMostrarTodo = ventanaMostrarTodo;
	}
	/**
	 * @return the ventanaInsertar
	 */
	public VentanaInsertar getVentanaInsertar() {
		return ventanaInsertar;
	}
	/**
	 * @param ventanaInsertar the ventanaInsertar to set
	 */
	public void setVentanaInsertar(VentanaInsertar ventanaInsertar) {
		this.ventanaInsertar = ventanaInsertar;
	}
	/**
	 * @return the ventanaBuscar
	 */
	public VentanaBuscar getVentanaBuscar() {
		return ventanaBuscar;
	}
	/**
	 * @param ventanaBuscar the ventanaBuscar to set
	 */
	public void setVentanaBuscar(VentanaBuscar ventanaBuscar) {
		this.ventanaBuscar = ventanaBuscar;
	}
	
	
	/*
	 * Métodos para hacer visible las visstas
	 */
	
	public void mostrarVentanaInsertar() {
		this.ventanaInsertar.setVisible(true);
	}
	
	public void mostrarVentanaBuscar() {
		this.ventanaBuscar.setVisible(true);
	}
	
	public void mostrarVentanaMostrarTodo() {
		this.ventanaMostrarTodo.setVisible(true);
	}

	/*
	 * Métodos CRUD
	 */
	
	public void registrarCliente(Cliente cliente) {
		this.clienteServ.validarRegistro(cliente);
	}
	
	public Cliente buscarCliente(String dniPersona) {
		return this.clienteServ.validarConsulta(dniPersona);
	}
	
	public void modificarCliente(Cliente cliente) {
		this.clienteServ.validarModificacion(cliente);
	}

	public void eliminarPersona(String id) {
		this.clienteServ.validarEliminacion(id);
	}
}
