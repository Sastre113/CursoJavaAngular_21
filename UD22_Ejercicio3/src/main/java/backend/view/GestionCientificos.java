/**
 * 
 */
package backend.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backend.controller.Controlador;
import backend.model.dto.Cientifico;

import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 * @author Miguel A. Sastre
 *
 */
public class GestionCientificos extends JFrame implements ActionListener {

	Controlador controlador;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldDni;
	private JTextField textFieldNomApell;
	private JTextField textFieldDniBuscar;
	private JTextField textFieldDniEliminar;
	private JButton btnInsertar,btnBuscar,btnEliminar;
	private JTextArea textArea = new JTextArea();

	public GestionCientificos() {
		setBounds(100, 100, 722, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(32, 57, 663, 123);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.gridwidth = 4;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 2;
		gbc_lblDni.gridy = 1;
		panel.add(lblDni, gbc_lblDni);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre  y apellido");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 5;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 10;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textFieldDni = new JTextField();
		GridBagConstraints gbc_textFieldDni = new GridBagConstraints();
		gbc_textFieldDni.gridwidth = 4;
		gbc_textFieldDni.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDni.gridx = 2;
		gbc_textFieldDni.gridy = 2;
		panel.add(textFieldDni, gbc_textFieldDni);
		textFieldDni.setColumns(10);
		
		textFieldNomApell = new JTextField();
		textFieldNomApell.setColumns(10);
		GridBagConstraints gbc_textFieldNomApell = new GridBagConstraints();
		gbc_textFieldNomApell.gridwidth = 5;
		gbc_textFieldNomApell.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNomApell.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNomApell.gridx = 10;
		gbc_textFieldNomApell.gridy = 2;
		panel.add(textFieldNomApell, gbc_textFieldNomApell);
		
		btnInsertar = new JButton("Insertar");
		GridBagConstraints gbc_btnInsertar = new GridBagConstraints();
		gbc_btnInsertar.insets = new Insets(0, 0, 0, 5);
		gbc_btnInsertar.gridx = 19;
		gbc_btnInsertar.gridy = 3;
		panel.add(btnInsertar, gbc_btnInsertar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(32, 221, 663, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDniBuscar = new JLabel("DNI");
		lblDniBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDniBuscar.setBounds(62, 32, 110, 14);
		panel_1.add(lblDniBuscar);
		
		textFieldDniBuscar = new JTextField();
		textFieldDniBuscar.setBounds(62, 62, 110, 20);
		textFieldDniBuscar.setColumns(10);
		panel_1.add(textFieldDniBuscar);
		
		
		textArea.setEditable(false);
		textArea.setBounds(267, 11, 277, 101);
		panel_1.add(textArea);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(568, 89, 65, 23);
		panel_1.add(btnBuscar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(32, 385, 663, 123);
		contentPane.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblDniBuscar_1 = new JLabel("DNI");
		GridBagConstraints gbc_lblDniBuscar_1 = new GridBagConstraints();
		gbc_lblDniBuscar_1.gridwidth = 4;
		gbc_lblDniBuscar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniBuscar_1.gridx = 2;
		gbc_lblDniBuscar_1.gridy = 1;
		panel_2.add(lblDniBuscar_1, gbc_lblDniBuscar_1);
		
		textFieldDniEliminar = new JTextField();
		textFieldDniEliminar.setColumns(10);
		GridBagConstraints gbc_textFieldDniEliminar = new GridBagConstraints();
		gbc_textFieldDniEliminar.gridwidth = 4;
		gbc_textFieldDniEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldDniEliminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDniEliminar.gridx = 2;
		gbc_textFieldDniEliminar.gridy = 2;
		panel_2.add(textFieldDniEliminar, gbc_textFieldDniEliminar);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 19;
		gbc_btnEliminar.gridy = 3;
		panel_2.add(btnEliminar, gbc_btnEliminar);
		
		
		
		 btnInsertar.addActionListener(this);
		 btnBuscar.addActionListener(this);
		 btnEliminar.addActionListener(this);
	}

	/**
	 * @param controlador the controlador to set
	 */
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == btnInsertar){
			Cientifico nuevoCientifico = new Cientifico();
			nuevoCientifico.setDni(this.textFieldDni.getText());
			nuevoCientifico.setNomApels(this.textFieldNomApell.getText());
			this.controlador.añadirCientifico(nuevoCientifico);
		}
		if(arg0.getSource() == btnBuscar) {
			mostrarCientifico(this.controlador.buscarCientifico(this.textFieldDniBuscar.getText()));
		}
		if(arg0.getSource() == btnEliminar) {
			this.controlador.eliminarCientifico(this.textFieldDniEliminar.getText());
		}	
	}
	
	public void mostrarCientifico(Cientifico cientifico) {
		this.textArea.append("Dni: " + cientifico.getDni() + "\nNombre:"+ cientifico.getNomApels() +"\n");
	}
}
