/**
 * 
 */
package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Miguel A. Sastre
 *
 */
public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField operandoY;
	private JTextField operandoX;
	private JTextField resultadoOperacion;

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		operandoX = new JTextField();
		operandoX.setBounds(34, 101, 86, 20);
		contentPane.add(operandoX);
		operandoX.setColumns(10);
		
		operandoY = new JTextField();
		operandoY.setBounds(130, 101, 86, 20);
		contentPane.add(operandoY);
		operandoY.setColumns(10);
		
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultadoOperacion.setText(operandoX.getText() + " + " + operandoY.getText() + " = " +
						(Double.valueOf(operandoX.getText()) + Double.valueOf(operandoY.getText())) 
						 
				);
			}
		});
		btnSumar.setBounds(34, 132, 89, 23);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultadoOperacion.setText(operandoX.getText() + " - " + operandoY.getText() + " = " +
						(Double.valueOf(operandoX.getText()) - Double.valueOf(operandoY.getText())) 
						 
				);
			}
		});
		btnRestar.setBounds(130, 132, 89, 23);
		contentPane.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultadoOperacion.setText(operandoX.getText() + " * " + operandoY.getText() + " = " +
						(Double.valueOf(operandoX.getText()) * Double.valueOf(operandoY.getText())) 
						 
				);
			}
		});
		btnMultiplicar.setBounds(34, 166, 89, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultadoOperacion.setText(operandoX.getText() + " / " + operandoY.getText() + " = " +
						(Double.valueOf(operandoX.getText()) / Double.valueOf(operandoY.getText())) 
						 
				);
			}
		});
		btnDividir.setBounds(130, 166, 89, 23);
		contentPane.add(btnDividir);
		
		resultadoOperacion = new JTextField();
		resultadoOperacion.setEditable(false);
		resultadoOperacion.setColumns(10);
		resultadoOperacion.setBounds(34, 30, 182, 41);
		contentPane.add(resultadoOperacion);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(73, 226, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(82, 11, 86, 14);
		contentPane.add(lblResultado);
		
		JLabel lblOperandoX = new JLabel("Operando X");
		lblOperandoX.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperandoX.setBounds(44, 82, 71, 14);
		contentPane.add(lblOperandoX);
		
		JLabel lblOperandoY = new JLabel("Operando Y");
		lblOperandoY.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperandoY.setBounds(134, 82, 76, 14);
		contentPane.add(lblOperandoY);
		
		
		
		
		
	}

}
