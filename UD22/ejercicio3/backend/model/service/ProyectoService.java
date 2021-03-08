/**
 * 
 */
package backend.model.service;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import backend.controller.Controlador;
import backend.model.dao.ProyectoDao;
import backend.model.dto.Proyecto;


/**
 * @author Miguel A. Sastre
 *
 */
public class ProyectoService {
	private Controlador controlador;
	
	public void validarAñadir(Proyecto nuevoProyecto) {
		if(nuevoProyecto.getId().length() == 4)
			new ProyectoDao().añadirProyecto(nuevoProyecto);
		else
			JOptionPane.showMessageDialog(null,"El identificador del proyecto debe tener longitud 4","Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}
	
	
	public Proyecto validarBuscarProyecto(String id) {
		Proyecto proyectoEncontrado = null;
		
		try {
			if(id.length() == 4) 
				proyectoEncontrado = new ProyectoDao().buscarProyecto(id);
			else
				JOptionPane.showMessageDialog(null,"El identificador del proyecto debe tener longitud 4","Advertencia",JOptionPane.WARNING_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		return proyectoEncontrado;
	}
	
	
	public LinkedList<Proyecto> validarBuscarTodos() {
		LinkedList<Proyecto> lista = new LinkedList<>();
		
		try {
			lista = new ProyectoDao().getAllProyecto();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return lista;
	}
	
	public void validarEliminar(String id) {
		new ProyectoDao().eliminarProyecto(id);
	}
	
	
	/**
	 * @return the controlador
	 */
	public Controlador getControlador() {
		return controlador;
	}

	/**
	 * @param controlador the controlador to set
	 */
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	

}
