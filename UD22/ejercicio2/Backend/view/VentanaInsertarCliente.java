/**
 * 
 */
package Backend.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import Backend.controller.ControllerEj2;
import Backend.model.dto.ClienteDto;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentanaInsertarCliente extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ControllerEj2 controller;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDireccion;
	private JTextField textFieldDNI;
	private JTextField textFieldFecha;
	JButton btnEnviar = new JButton("Enviar");
	JButton btnCancelar = new JButton("Cancelar");
	
	public VentanaInsertarCliente() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:max(61dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblTitular = new JLabel("Ingresar cliente");
		lblTitular.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTitular.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitular, "7, 2, center, default");
		
		JLabel lblNombre = new JLabel("Nombre");
		contentPane.add(lblNombre, "5, 4, center, default");
		
		JLabel lblApellido = new JLabel("Apellido");
		contentPane.add(lblApellido, "9, 4, center, default");
		
		textFieldNombre = new JTextField();
		contentPane.add(textFieldNombre, "5, 6, center, default");
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		contentPane.add(textFieldApellido, "9, 6, center, default");
		textFieldApellido.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		contentPane.add(lblDireccion, "5, 8, center, default");
		
		JLabel lblDni = new JLabel("DNI");
		contentPane.add(lblDni, "9, 8, center, default");
		
		textFieldDireccion = new JTextField();
		contentPane.add(textFieldDireccion, "5, 10, center, default");
		textFieldDireccion.setColumns(10);
		
		textFieldDNI = new JTextField();
		contentPane.add(textFieldDNI, "9, 10, center, default");
		textFieldDNI.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		contentPane.add(lblFecha, "7, 12, center, default");
		
		textFieldFecha = new JTextField();
		contentPane.add(textFieldFecha, "7, 14, center, default");
		textFieldFecha.setColumns(10);
	
		contentPane.add(btnEnviar, "5, 18, center, default");
		contentPane.add(btnCancelar, "9, 18, center, default");
		
		btnEnviar.addActionListener(this);
		btnCancelar.addActionListener(this);
	}
	
	public void setCoordinador(ControllerEj2 controller) {
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == btnEnviar) {
			try {
				ClienteDto nuevoCliente = new ClienteDto();
				nuevoCliente.setNombre(textFieldNombre.getText());
				nuevoCliente.setApellido(textFieldApellido.getText());
				nuevoCliente.setDireccion(textFieldDireccion.getText());
				nuevoCliente.setDni(Integer.parseInt(textFieldDNI.getText()));
				nuevoCliente.setFecha(textFieldFecha.getText());
				
				this.controller.insertarCliente(nuevoCliente);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
		if(arg0.getSource() == btnCancelar) {
			this.dispose();
		}
	}
}
