/**
 * 
 */
package Backend.model.service;

import javax.swing.JOptionPane;

import Backend.controller.Controller;
import Backend.model.dao.ClienteDao;
import Backend.model.dto.Cliente;


/**
 * @author Miguel A. Sastre
 *
 */
public class ClienteServ {
	private Controller clienteController; 
	public static boolean consultaCliente=false;
	public static boolean modificaCliente=false;
	
	public void setController(Controller clienteController) {
		this.setController(clienteController);
	}
	
	public void validarRegistro(Cliente nuevoCliente) {
		ClienteDao cliente;
		
		if(nuevoCliente.getDni() > Math.pow(10, 7)) {
			cliente = new ClienteDao();
			cliente.registrarCliente(nuevoCliente);
		} else
			JOptionPane.showMessageDialog(null,"El documento de la persona debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
	}
	
	public Cliente validarConsulta(String dni) {
		ClienteDao clienteDao ;
		Cliente clienteBuscado = null;
		
		try {
			int integerDni = Integer.parseInt(dni);
			
			if(integerDni > Math.pow(10, 7)) {
				clienteDao = new ClienteDao();
				consultaCliente = true;
				clienteBuscado = clienteDao.buscarCliente(Integer.parseInt(dni));
			}else {
				JOptionPane.showMessageDialog(null,"El documento de la persona debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
				consultaCliente=false;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Debe ingresar un dato numerico","Error",JOptionPane.ERROR_MESSAGE);
			consultaCliente=false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
			consultaCliente=false;
		}
		
		return clienteBuscado;
	}
	
	public void validarModificacion(Cliente modCliente) {
		ClienteDao cliente;
		if (modCliente.getNombre().length() > 3) {
			cliente = new ClienteDao();
			cliente.modificarCliente(modCliente);	
			modificaCliente=true;
		}else{
			JOptionPane.showMessageDialog(null,"El nombre de la persona debe ser mayor a 5 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
			modificaCliente=false;
		}
	}
	
	public void validarEliminacion(String id) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.eliminarPersona(id);
	}

	/**
	 * @return the clienteController
	 */
	public Controller getClienteController() {
		return clienteController;
	}

	/**
	 * @param clienteController the clienteController to set
	 */
	public void setClienteController(Controller clienteController) {
		this.clienteController = clienteController;
	}
	
	
}
