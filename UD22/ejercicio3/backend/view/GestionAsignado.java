/**
 * 
 */
package backend.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backend.controller.Controlador;
import backend.model.dto.AsignadoA;

import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Miguel A. Sastre
 *
 */
public class GestionAsignado extends JFrame {

	Controlador controlador;
	private JPanel contentPane;
	JTextArea textArea = new JTextArea();

	public GestionAsignado() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				mostrarAsignados();
			}
			@Override
			public void windowActivated(WindowEvent e) {
				mostrarAsignados();
			}
		});
		setBounds(100, 100, 441, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

	/**
	 * @param controlador the controlador to set
	 */
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	
	public void limpiar() {
		this.textArea.setText("");
	}
	public void mostrarAsignados() {
		limpiar();
		LinkedList<AsignadoA> lista = this.controlador.obtenerTodosAsignadoA();
		
		if(!lista.isEmpty()) {
			Iterator<AsignadoA> it = lista.iterator();
			
			while(it.hasNext()) {
				AsignadoA asignado = it.next();
				this.textArea.append(
						"Cientifico: " + asignado.getCientifico()+ "\n" +
						"Asignado a: " + asignado.getProyecto() + "\n"
						+ "---------------------\n"
						);
			}
		}
		
	}
	
}
