/**
 * 
 */
package Backend.view;

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
import Backend.model.dto.VideoDto;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentanaInsertarVideo extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	private ControllerEj2 controller;
	private JTextField textFieldTitulo;
	private JTextField textFieldDirector;
	private JTextField textFieldCliID;
	JButton btnEnviar = new JButton("Enviar");
	JButton btnCancelar = new JButton("Cancelar");
	
	public VentanaInsertarVideo() {
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
		
		JLabel lblTitular = new JLabel("Ingresar video prestado");
		lblTitular.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTitular.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitular, "7, 2, center, default");
		
		JLabel lblTitulo = new JLabel("Titulo");
		contentPane.add(lblTitulo, "5, 4, center, default");
		
		JLabel lblDirector = new JLabel("Director");
		contentPane.add(lblDirector, "9, 4, center, default");
		
		textFieldTitulo = new JTextField();
		contentPane.add(textFieldTitulo, "5, 6, center, default");
		textFieldTitulo.setColumns(10);
		
		textFieldDirector = new JTextField();
		contentPane.add(textFieldDirector, "9, 6, center, default");
		textFieldDirector.setColumns(10);
		
		JLabel lblCliId = new JLabel("Id de cliente");
		contentPane.add(lblCliId, "7, 8, center, default");
		
		textFieldCliID = new JTextField();
		contentPane.add(textFieldCliID, "7, 10, center, default");
		textFieldCliID.setColumns(10);
	
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
				VideoDto nuevoVideo = new VideoDto();
				nuevoVideo.setTitle(textFieldTitulo.getText());
				nuevoVideo.setDirector(textFieldDirector.getText());
				nuevoVideo.setCli_id(Integer.parseInt(textFieldCliID.getText()));

				
				this.controller.insertarVideo(nuevoVideo);
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
