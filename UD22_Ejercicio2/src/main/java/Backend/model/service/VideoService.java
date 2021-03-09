/**
 * 
 */
package Backend.model.service;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Backend.controller.ControllerEj2;
import Backend.model.dao.VideoDao;
import Backend.model.dto.VideoDto;

/**
 * @author Miguel A. Sastre
 *
 */
public class VideoService {
	private ControllerEj2 videoController;
	
	
	public void setController(ControllerEj2 videoController) {
		this.setVideoController(videoController);
	}
	
	public void validarRegistro(VideoDto nuevoVideo) {
		VideoDao video;
		
		if(nuevoVideo.getTitle().length() > 3) {
			video = new VideoDao();
			video.insertarVideo(nuevoVideo);
		} else
			JOptionPane.showMessageDialog(null, "El titulo debe tener más de 3 caracteres", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}
	
	public VideoDto validarConsulta(String id) {
		VideoDao videoDao;
		VideoDto videoDto = null;
		
		try {
			videoDao = new VideoDao();
			videoDto = videoDao.buscarVideo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}

		return videoDto;
	}
	
	
	public LinkedList<VideoDto> getAllVideo(){
		LinkedList<VideoDto> listaVideos = new LinkedList<>();
		
		try {
			listaVideos = new VideoDao().getAllVideo();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return listaVideos;
	}
	
	
	
	/**
	 * @return the videoController
	 */
	public ControllerEj2 getVideoController() {
		return videoController;
	}

	/**
	 * @param videoController the videoController to set
	 */
	public void setVideoController(ControllerEj2 videoController) {
		this.videoController = videoController;
	}
}
