/**
 * 
 */
package backend.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backend.controller.Controlador;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Miguel A. Sastre
 *
 */
public class InterfazGrafica extends JFrame implements ActionListener {

	Controlador controlador;
	private JPanel contentPane;
	JButton btnCientifico,btnAsignadoA,btnProyecto;

	public InterfazGrafica() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitular = new JLabel("¿Que quieres gestionar?");
		lblTitular.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitular.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitular.setBounds(100, 40, 230, 33);
		contentPane.add(lblTitular);
		
		btnCientifico = new JButton("Cientifico");
		btnCientifico.setBounds(48, 84, 89, 23);
		contentPane.add(btnCientifico);
		
		btnAsignadoA = new JButton("AsignadoA");
		btnAsignadoA.setBounds(178, 84, 89, 23);
		contentPane.add(btnAsignadoA);
		
		btnProyecto = new JButton("Proyecto");
		btnProyecto.setBounds(306, 84, 89, 23);
		contentPane.add(btnProyecto);
		
		btnCientifico.addActionListener(this);
		btnAsignadoA.addActionListener(this);
		btnProyecto.addActionListener(this);
	}
	
	/**
	 * @param controlador the controlador to set
	 */
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == btnCientifico)
			this.controlador.showGestionCientificos();
		if(arg0.getSource() == btnAsignadoA)
			this.controlador.showGestionAsignado();
		if(arg0.getSource() == btnProyecto)
			this.controlador.showGestionProyectos();
		
	}
}
