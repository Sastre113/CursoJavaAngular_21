/**
 * 
 */
package Backend.controller;

/**
 * @author Miguel A. Sastre
 *
 */

import Backend.view.*;

import java.util.LinkedList;

import Backend.model.dto.ClienteDto;
import Backend.model.dto.VideoDto;
import Backend.model.service.*;

public class ControllerEj2 {
	
	/*
	 *  Clases services
	 */
	private ClienteService clienteServ;
	private VideoService videoServ;

	/*
	 *  Interfaz
	 */
	
	private VentPrincipal ventanaPrincipal;
	private VentanaInsertarVideo ventanaInsertarVideo;
	private VentanaInsertarCliente ventanaInsertarCliente;
	private VentanaBuscarVideo ventanaBuscarVideo;
	private VentanaBuscarCliente ventanaBuscarCliente;
	private VentanaMostrarTodosVideos ventanaMostrarTodosVideos;
	
	/*
	 * Métodos getters y setters 
	 */
	
	/**
	 * @return the clienteServ
	 */
	public ClienteService getClienteServ() {
		return clienteServ;
	}
	/**
	 * @param clienteServ the clienteServ to set
	 */
	public void setClienteServ(ClienteService clienteServ) {
		this.clienteServ = clienteServ;
	}
	/**
	 * @return the videoServ
	 */
	public VideoService getVideoServ() {
		return videoServ;
	}
	/**
	 * @param videoServ the videoServ to set
	 */
	public void setVideoServ(VideoService videoServ) {
		this.videoServ = videoServ;
	}
	/**
	 * @return the ventanaPrincipal
	 */
	public VentPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}
	/**
	 * @param ventanaPrincipal the ventanaPrincipal to set
	 */
	public void setVentanaPrincipal(VentPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
	/**
	 * @return the ventanaInsertarVideo
	 */
	public VentanaInsertarVideo getVentanaInsertarVideo() {
		return ventanaInsertarVideo;
	}
	/**
	 * @param ventanaInsertarVideo the ventanaInsertarVideo to set
	 */
	public void setVentanaInsertarVideo(VentanaInsertarVideo ventanaInsertarVideo) {
		this.ventanaInsertarVideo = ventanaInsertarVideo;
	}
	/**
	 * @return the ventanaInsertarCliente
	 */
	public VentanaInsertarCliente getVentanaInsertarCliente() {
		return ventanaInsertarCliente;
	}
	/**
	 * @param ventanaInsertarCliente the ventanaInsertarCliente to set
	 */
	public void setVentanaInsertarCliente(VentanaInsertarCliente ventanaInsertarCliente) {
		this.ventanaInsertarCliente = ventanaInsertarCliente;
	}
	/**
	 * @return the ventanaBuscarVideo
	 */
	public VentanaBuscarVideo getVentanaBuscarVideo() {
		return ventanaBuscarVideo;
	}
	/**
	 * @param ventanaBuscarVideo the ventanaBuscarVideo to set
	 */
	public void setVentanaBuscarVideo(VentanaBuscarVideo ventanaBuscarVideo) {
		this.ventanaBuscarVideo = ventanaBuscarVideo;
	}
	/**
	 * @return the ventanaBuscarCliente
	 */
	public VentanaBuscarCliente getVentanaBuscarCliente() {
		return ventanaBuscarCliente;
	}
	/**
	 * @param ventanaBuscarCliente the ventanaBuscarCliente to set
	 */
	public void setVentanaBuscarCliente(VentanaBuscarCliente ventanaBuscarCliente) {
		this.ventanaBuscarCliente = ventanaBuscarCliente;
	}
	
	/**
	 * @return the ventanaMostrarTodosVideos
	 */
	public VentanaMostrarTodosVideos getVentanaMostrarTodosVideos() {
		return ventanaMostrarTodosVideos;
	}
	/**
	 * @param ventanaMostrarTodosVideos the ventanaMostrarTodosVideos to set
	 */
	public void setVentanaMostrarTodosVideos(VentanaMostrarTodosVideos ventanaMostrarTodosVideos) {
		this.ventanaMostrarTodosVideos = ventanaMostrarTodosVideos;
	}
	
	/*
	 * Métodos para hacer visible las visstas
	 */
	
	
	public void showVentanaInsertarCliente() {
		this.ventanaInsertarCliente.setVisible(true);
	}
	
	public void showVentanaInsertarVideo() {
		this.ventanaInsertarVideo.setVisible(true);
	}
	
	public void showVentanaBuscarCliente() {
		this.ventanaBuscarCliente.setVisible(true);
	}
	
	public void showVentanaBuscarVideo() {
		this.ventanaBuscarVideo.setVisible(true);
	}
	
	public void showMostrarTodo() {
		this.ventanaMostrarTodosVideos.setVisible(true);
	}
	
	
	
	/*
	 * Métodos CRUD
	 */
	
	public void insertarCliente(ClienteDto nuevoCliente) {
		this.clienteServ.validarRegistro(nuevoCliente);
	}
	
	public ClienteDto buscarCliente(String id) {
		return this.clienteServ.validarConsulta(id);
	}
	
	public void insertarVideo(VideoDto nuevoVideo) {
		this.videoServ.validarRegistro(nuevoVideo);
	}
	
	public VideoDto buscarVideo(String id) {
		return this.videoServ.validarConsulta(id);
	}
	
	public LinkedList<VideoDto> obtenerVideos(){
		return  this.videoServ.getAllVideo();
	}
	
	
}
