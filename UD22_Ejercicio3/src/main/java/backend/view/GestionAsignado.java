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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;

/**
 * @author Miguel A. Sastre
 *
 */
public class GestionAsignado extends JFrame implements ActionListener {

	Controlador controlador;
	private JPanel contentPane;
	private JTextField textFieldInsertDNI;
	private JTextField textFieldInsertId;
	private JTextField textFieldBuscarUno;
	private JTextArea textArea;
	private JButton btnObtenerTodos;
	private JButton btnBuscar;
	private JButton btnInsertar;

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
		setBounds(100, 100, 720, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnObtenerTodos = new JButton("Obtener Todos");
		btnBuscar = new JButton("Buscar por DNI");
		btnInsertar = new JButton("Insertar");

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 694, 0);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 11, 335, 268);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		btnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnInsertar.setBounds(10, 11, 89, 23);
		panel_1.add(btnInsertar);

		textFieldInsertDNI = new JTextField();
		textFieldInsertDNI.setBounds(10, 76, 105, 20);
		panel_1.add(textFieldInsertDNI);
		textFieldInsertDNI.setColumns(10);

		textFieldInsertId = new JTextField();
		textFieldInsertId.setBounds(179, 76, 105, 20);
		panel_1.add(textFieldInsertId);
		textFieldInsertId.setColumns(10);

		JLabel lblDni = new JLabel("Dni Cientifico");
		lblDni.setHorizontalAlignment(SwingConstants.CENTER);
		lblDni.setBounds(10, 58, 105, 14);
		panel_1.add(lblDni);

		JLabel lblId = new JLabel("Id Proyecto");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(179, 58, 105, 14);
		panel_1.add(lblId);

		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBuscar.setBounds(10, 138, 105, 23);
		panel_1.add(btnBuscar);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 125, 315, 2);
		panel_1.add(separator);

		textFieldBuscarUno = new JTextField();
		textFieldBuscarUno.setBounds(10, 172, 86, 20);
		panel_1.add(textFieldBuscarUno);
		textFieldBuscarUno.setColumns(10);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(217, 128, 0, 118);
		panel_1.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(145, 138, 6, 108);
		panel_1.add(separator_2);

		btnObtenerTodos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnObtenerTodos.setBounds(179, 138, 105, 23);
		panel_1.add(btnObtenerTodos);

		textArea = new JTextArea();
		textArea.setBounds(355, 16, 339, 263);
		contentPane.add(textArea);

		
		
		btnObtenerTodos.addActionListener(this);
		btnBuscar.addActionListener(this);
		btnInsertar.addActionListener(this);
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

	private void mostrarAsignados() {
		limpiar();
		LinkedList<AsignadoA> lista = this.controlador.obtenerTodosAsignadoA();

		if (lista != null) {
			Iterator<AsignadoA> it = lista.iterator();

			while (it.hasNext()) {
				AsignadoA asignado = it.next();
				this.textArea.append("Cientifico: " + asignado.getCientifico() + "\n" + "Asignado a: "
						+ asignado.getProyecto() + "\n" + "---------------------\n");
			}
		}
	}

	private void insertarAsignado() {
		AsignadoA nuevoAsignado = new AsignadoA();
		nuevoAsignado.setCientifico(this.textFieldInsertDNI.getText());
		nuevoAsignado.setProyecto(this.textFieldInsertId.getText());
		this.controlador.añadirAsignadoA(nuevoAsignado);
	}


	private void buscarAsignado() {
		try {
			AsignadoA asignado = this.controlador.buscarAsignadoA(this.textFieldBuscarUno.getText());
			this.textArea.setText(
					"DNI cientifico: " + asignado.getCientifico() +
					"ID proyecto: " + asignado.getProyecto() + "\n"
					);
		} catch (Exception e) {
			this.textArea.setText("Error 404");
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnObtenerTodos) {
			mostrarAsignados();
		}
		if (arg0.getSource() == btnInsertar) {
			insertarAsignado();
		}
		if (arg0.getSource() == btnBuscar) {
			buscarAsignado();
		}

	}

}
