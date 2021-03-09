package Backend;

import Backend.model.service.ClienteService;
import Backend.view.*;
import Backend.controller.ControllerEj2;
import Backend.model.service.*;

/**
 * @author Miguel A. Sastre
 *
 */
public class mainAppEj2 {

	ClienteService clienteServ;
	VideoService videoServ;
	VentPrincipal ventanaPrincipal;
	VentanaBuscarCliente ventanaBuscarCliente;
	VentanaBuscarVideo ventanaBuscarVideo;
	VentanaInsertarCliente ventanaInsertarCliente;
	VentanaInsertarVideo ventanaInsertarVideo;
	VentanaMostrarTodosVideos ventanaMostrarTodos;
	ControllerEj2 controller;

	public static void main(String[] args) {
		mainAppEj2 miPrincipal=new mainAppEj2();
		miPrincipal.iniciar();
	}

	/**
	 * Permite instanciar todas las clases con las que trabaja
	 * el sistema
	 */
	private void iniciar() {
		/*Se instancian las clases*/
		ventanaPrincipal =new VentPrincipal();
		ventanaInsertarCliente=new VentanaInsertarCliente();
		ventanaInsertarVideo=new VentanaInsertarVideo();
		ventanaBuscarCliente= new VentanaBuscarCliente();
		ventanaBuscarVideo= new VentanaBuscarVideo();
		ventanaMostrarTodos = new VentanaMostrarTodosVideos();
		clienteServ =new ClienteService();
		videoServ =new VideoService();
		controller= new ControllerEj2();
		
		/*Se establecen las relaciones entre clases*/
		ventanaPrincipal.setCoordinador(controller);
		ventanaInsertarCliente.setCoordinador(controller);
		ventanaInsertarVideo.setCoordinador(controller);
		ventanaBuscarCliente.setCoordinador(controller);
		ventanaBuscarVideo.setCoordinador(controller);
		ventanaMostrarTodos.setCoordinador(controller);
		clienteServ.setClienteController(controller);
		
		/*Se establecen relaciones con la clase coordinador*/
		controller.setVentanaPrincipal(ventanaPrincipal);
		controller.setVentanaInsertarCliente(ventanaInsertarCliente);
		controller.setVentanaInsertarVideo(ventanaInsertarVideo);
		controller.setVentanaBuscarCliente(ventanaBuscarCliente);
		controller.setVentanaBuscarVideo(ventanaBuscarVideo);
		controller.setVentanaMostrarTodosVideos(ventanaMostrarTodos);
		controller.setClienteServ(clienteServ);
		controller.setVideoServ(videoServ);
				
		ventanaPrincipal.setVisible(true);
	}

}
