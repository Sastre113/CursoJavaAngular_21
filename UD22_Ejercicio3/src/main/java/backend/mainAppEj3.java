package backend;


import backend.model.service.*;
import backend.view.*;
import backend.controller.*;

/**
 * @author Miguel A. Sastre
 *
 */
public class mainAppEj3 {
	
	/**
	 *  Controlador y Servicios
	 */
	
	Controlador controlador;
	AsignadoAService asignadoService;
	CientificoService cientificoService;
	ProyectoService proyectoService;
	
	/**
	 * Interfaz Grafica
	 */
	
	InterfazGrafica interfazGrafica;
	GestionAsignado gestionAsginado;
	GestionCientificos gestionCientificos;
	GestionProyectos gestionProyectos;
	

	public static void main(String[] args) {
		mainAppEj3 miApp = new mainAppEj3();
		miApp.iniciar();
	}

	/**
	 * Permite instanciar todas las clases con las que trabaja
	 * el sistema
	 */
	private void iniciar() {
		/*Se instancian las clases*/
		controlador = new Controlador();
		asignadoService = new AsignadoAService();
		cientificoService = new CientificoService();
		proyectoService = new ProyectoService();
		interfazGrafica = new InterfazGrafica();
		gestionAsginado = new GestionAsignado();
		gestionCientificos = new GestionCientificos();
		gestionProyectos = new GestionProyectos();
		
		/*Se establecen las relaciones entre clases*/
		asignadoService.setControlador(controlador);
		cientificoService.setControlador(controlador);
		proyectoService.setControlador(controlador);
		
		interfazGrafica.setControlador(controlador);
		gestionAsginado.setControlador(controlador);
		gestionCientificos.setControlador(controlador);
		gestionProyectos.setControlador(controlador);
		

		/*Se establecen relaciones con la clase coordinador*/
		controlador.setAsignadoService(asignadoService);
		controlador.setCientificoService(cientificoService);
		controlador.setProyectoService(proyectoService);
		controlador.setGestionAsignado(gestionAsginado);
		controlador.setGestionCientificos(gestionCientificos);
		controlador.setGestionProyectos(gestionProyectos);
		controlador.setInterfazGrafica(interfazGrafica);

		this.interfazGrafica.setVisible(true);
	}

}
