package Backend;

import Backend.controller.Controller;
import Backend.model.service.ClienteServ;
import Backend.view.VentanaBuscar;
import Backend.view.VentanaInsertar;
import Backend.view.VentantaPrincipal;

public class mainApp {
	
	ClienteServ clienteServ;
	VentantaPrincipal ventanaPrincipal;
	VentanaBuscar ventanaBuscar;
	VentanaInsertar ventanaInsertar;
	Controller controller;

	public static void main(String[] args) {
		mainApp miPrincipal=new mainApp();
		miPrincipal.iniciar();
	}

	/**
	 * Permite instanciar todas las clases con las que trabaja
	 * el sistema
	 */
	private void iniciar() {
		/*Se instancian las clases*/
		ventanaPrincipal =new VentantaPrincipal();
		ventanaInsertar=new VentanaInsertar();
		ventanaBuscar= new VentanaBuscar();
		clienteServ =new ClienteServ();
		controller= new Controller();
		
		/*Se establecen las relaciones entre clases*/
		ventanaPrincipal.setCoordinador(controller);
		ventanaInsertar.setCoordinador(controller);
		ventanaBuscar.setCoordinador(controller);
		clienteServ.setClienteController(controller);
		
		/*Se establecen relaciones con la clase coordinador*/
		controller.setVentanaPrincipal(ventanaPrincipal);
		controller.setVentanaInsertar(ventanaInsertar);
		controller.setVentanaBuscar(ventanaBuscar);
		controller.setPersonaServ(clienteServ);
				
		ventanaPrincipal.setVisible(true);
	}

}
