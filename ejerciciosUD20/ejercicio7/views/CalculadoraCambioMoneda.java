/**
 * 
 */
package views;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Miguel A. Sastre
 *
 */
public class CalculadoraCambioMoneda extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCantidadAConvertir;
	private JTextField textFieldResultados;
	JButton btnCalcular = new JButton("€ a pts");
	private boolean euroAPts = true;


	/**
	 * Create the frame.
	 */
	public CalculadoraCambioMoneda() {
		setTitle("Calculadora de cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCant = new JLabel("Cantidad a convertir");
		lblCant.setHorizontalAlignment(SwingConstants.CENTER);
		lblCant.setBounds(10, 15, 117, 30);
		contentPane.add(lblCant);
		
		textFieldCantidadAConvertir = new JTextField();
		textFieldCantidadAConvertir.setBounds(137, 20, 86, 20);
		contentPane.add(textFieldCantidadAConvertir);
		textFieldCantidadAConvertir.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(258, 23, 70, 14);
		contentPane.add(lblResultado);
		
		textFieldResultados = new JTextField();
		textFieldResultados.setEditable(false);
		textFieldResultados.setBounds(338, 20, 86, 20);
		contentPane.add(textFieldResultados);
		textFieldResultados.setColumns(10);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					if(euroAPts)
						textFieldResultados.setText("" + String.format("%.2f",(Double.valueOf(textFieldCantidadAConvertir.getText()) * 166.386)));
					else
						textFieldResultados.setText("" +  String.format("%.2f",(Double.valueOf(textFieldCantidadAConvertir.getText()) / 166.386)));
			}
		});
		
		btnCalcular.setBounds(134, 51, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnCambiarCambio = new JButton("Cambiar");
		btnCambiarCambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(euroAPts) {
					btnCalcular.setText("Pts a €");
					euroAPts = false;
				}	
				else {
					btnCalcular.setText("€ a pts");
					euroAPts = true;
				}
					
			}
		});
		btnCambiarCambio.setBounds(239, 51, 89, 23);
		contentPane.add(btnCambiarCambio);
	}

}
