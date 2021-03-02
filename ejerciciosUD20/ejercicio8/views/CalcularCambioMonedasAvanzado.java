/**
 * 
 */
package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Miguel A. Sastre
 *
 */
public class CalcularCambioMonedasAvanzado extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCantidadAConvertir;
	private JTextField textFieldResultados;
	JButton btnCalcular = new JButton("€ a pts");
	private boolean euroAPts = true;


	/**
	 * Create the frame.
	 */
	public CalcularCambioMonedasAvanzado() {
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
		btnCalcular.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10)
					calcularCambio();
			}
		});
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					calcularCambio();
			}
		});
		
		btnCalcular.setBounds(20, 51, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnCambiarCambio = new JButton("Cambiar");
		btnCambiarCambio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10)
					cambiarCambio();
			}
		});
		btnCambiarCambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarCambio();	
			}
		});
		btnCambiarCambio.setBounds(137, 51, 89, 23);
		contentPane.add(btnCambiarCambio);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				vaciarTextField();
			}
		});
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vaciarTextField();
			}
		});
		btnBorrar.setBounds(268, 51, 89, 23);
		contentPane.add(btnBorrar);
	}
	
	public void calcularCambio() {
		try {
			if(euroAPts)
				textFieldResultados.setText(String.format("%.2f",(Double.valueOf(textFieldCantidadAConvertir.getText()) * 166.386)));
			else
				textFieldResultados.setText(String.format("%.2f",(Double.valueOf(textFieldCantidadAConvertir.getText()) / 166.386)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha introducido ningún valor");
		}
		
	}
	
	public void cambiarCambio() {
		if(euroAPts) {
			btnCalcular.setText("Pts a €");
			euroAPts = false;
			if(!textFieldCantidadAConvertir.getText().equals(""))
				calcularCambio();
		}	
		else {
			btnCalcular.setText("€ a pts");
			euroAPts = true;
			if(!textFieldCantidadAConvertir.getText().equals(""))
				calcularCambio();
		}
	}

	public void vaciarTextField() {
		textFieldCantidadAConvertir.setText("");
		textFieldResultados.setText("");
	}
}
