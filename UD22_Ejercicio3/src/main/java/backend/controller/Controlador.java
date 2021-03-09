/**
 * 
 */
package backend.controller;

import java.util.LinkedList;

import backend.model.dto.*;
import backend.model.service.*;
import backend.view.*;

/**
 * @author Miguel A. Sastre
 *
 */
public class Controlador {

	/*
	 * Clases services
	 */
	
	private AsignadoAService asignadoService;
	private CientificoService cientificoService;
	private ProyectoService proyectoService;
	
	/*
	 * Interfaz
	 */
	
	private InterfazGrafica interfazGrafica;
	private GestionCientificos gestionCientificos;
	private GestionProyectos gestionProyectos;
	private GestionAsignado gestionAsignado;
	
	
	/**
	 * Getters & Setters
	 */
	
	
	/**
	 * @return the asignadoService
	 */
	public AsignadoAService getAsignadoService() {
		return asignadoService;
	}
	/**
	 * @param asignadoService the asignadoService to set
	 */
	public void setAsignadoService(AsignadoAService asignadoService) {
		this.asignadoService = asignadoService;
	}
	/**
	 * @return the cientificoService
	 */
	public CientificoService getCientificoService() {
		return cientificoService;
	}
	/**
	 * @param cientificoService the cientificoService to set
	 */
	public void setCientificoService(CientificoService cientificoService) {
		this.cientificoService = cientificoService;
	}
	/**
	 * @return the proyectoService
	 */
	public ProyectoService getProyectoService() {
		return proyectoService;
	}
	/**
	 * @param proyectoService the proyectoService to set
	 */
	public void setProyectoService(ProyectoService proyectoService) {
		this.proyectoService = proyectoService;
	}
	/**
	 * @return the interfazGrafica
	 */
	public InterfazGrafica getInterfazGrafica() {
		return interfazGrafica;
	}
	/**
	 * @param interfazGrafica the interfazGrafica to set
	 */
	public void setInterfazGrafica(InterfazGrafica interfazGrafica) {
		this.interfazGrafica = interfazGrafica;
	}
	/**
	 * @return the GestionCientificos
	 */
	public GestionCientificos getGestionCientificos() {
		return gestionCientificos;
	}
	/**
	 * @param GestionCientificos the GestionCientificos to set
	 */
	public void setGestionCientificos(GestionCientificos gestionCientificos) {
		this.gestionCientificos = gestionCientificos;
	}
	/**
	 * @return the GestionProyectos
	 */
	public GestionProyectos getGestionProyectos() {
		return gestionProyectos;
	}
	/**
	 * @param GestionProyectos the GestionProyectos to set
	 */
	public void setGestionProyectos(GestionProyectos gestionProyectos) {
		this.gestionProyectos = gestionProyectos;
	}
	/**
	 * @return the GestionAsignado
	 */
	public GestionAsignado getGestionAsignado() {
		return gestionAsignado;
	}
	/**
	 * @param GestionAsignado the GestionAsignado to set
	 */
	public void setGestionAsignado(GestionAsignado gestionAsignado) {
		this.gestionAsignado = gestionAsignado;
	}
	
	/** 
	 * Métodos para hacer visible las vistas
	 */
	
	public void showGestionCientificos() {
		this.gestionCientificos.setVisible(true);
	}
	
	public void showGestionProyectos() {
		this.gestionProyectos.setVisible(true);
	}
	
	public void showGestionAsignado() {
		this.gestionAsignado.setVisible(true);
	}
	
	/**
	 *  Métodos CRUD
	 */
	
	public void añadirCientifico(Cientifico nuevoCientifico) {
		this.cientificoService.validarAñadir(nuevoCientifico);
	}
	
	public Cientifico buscarCientifico(String cientifico) {
		return this.cientificoService.validarBuscarCientifico(cientifico);
	}
	
	public LinkedList<Cientifico> obtenerTodosCientifico(){
		return this.cientificoService.validarBuscarTodos();
	}
	
	public void eliminarCientifico(String cientifico) {
		this.cientificoService.validarEliminar(cientifico);
	}
	
	
	public void añadirProyecto(Proyecto nuevoProyecto) {
		this.proyectoService.validarAñadir(nuevoProyecto);
	}
	
	public Proyecto buscarProyecto(String id) {
		return this.proyectoService.validarBuscarProyecto(id);
	}
	
	public LinkedList<Proyecto> obtenerTodosProyecto(){
		return this.proyectoService.validarBuscarTodos();
	}
	
	public void eliminarProyecto(String id) {
		this.proyectoService.validarEliminar(id);
	}
	
	
	public void añadirAsignadoA(AsignadoA nuevoAsignado) {
		this.asignadoService.validarAñadir(nuevoAsignado);
	}
	
	public AsignadoA buscarAsignadoA(String cientifico) {
		return this.asignadoService.validarBuscarAsignado(cientifico);
	}
	
	public LinkedList<AsignadoA> obtenerTodosAsignadoA(){
		return this.asignadoService.validarBuscarTodos();
	}
	
	public void eliminarAsignadoA(String cientifico) {
		this.asignadoService.validarEliminar(cientifico);
	}
	
}
