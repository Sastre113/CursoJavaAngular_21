/**
 * 
 */
package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

/**
 * @author Miguel A. Sastre
 *
 */
public class Encuestador extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup bgSO = new ButtonGroup();
	private final ButtonGroup bgEspecialidad = new ButtonGroup();



	/**
	 * Create the frame.
	 */
	public Encuestador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblSO = new JLabel("Sistema Operativo Preferido");
		lblSO.setHorizontalAlignment(SwingConstants.LEFT);
		lblSO.setBounds(23, 30, 141, 14);
		contentPane.add(lblSO);
		
		JRadioButton rbtnWindows = new JRadioButton("Windows");
		bgSO.add(rbtnWindows);
		rbtnWindows.setBounds(33, 51, 109, 23);
		rbtnWindows.setActionCommand("Windows");
		contentPane.add(rbtnWindows);
		
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		bgSO.add(rdbtnLinux);
		rdbtnLinux.setBounds(33, 77, 109, 23);
		rdbtnLinux.setActionCommand("Linux");
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		bgSO.add(rdbtnMac);
		rdbtnMac.setBounds(33, 103, 109, 23);
		rdbtnMac.setActionCommand("Mac");
		contentPane.add(rdbtnMac);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblEspecialidad.setBounds(23, 133, 66, 14);
		contentPane.add(lblEspecialidad);
		
		JRadioButton rdbtnProgrmacion = new JRadioButton("Programación");
		bgEspecialidad.add(rdbtnProgrmacion);
		rdbtnProgrmacion.setBounds(33, 152, 109, 23);
		rdbtnProgrmacion.setActionCommand("Programación");
		contentPane.add(rdbtnProgrmacion);
		
		JRadioButton rdbtnDiseñoGrafico = new JRadioButton("Diseño gráfico");
		bgEspecialidad.add(rdbtnDiseñoGrafico);
		rdbtnDiseñoGrafico.setBounds(33, 178, 109, 23);
		rdbtnDiseñoGrafico.setActionCommand("Diseño gráfico");
		contentPane.add(rdbtnDiseñoGrafico);
		
		JRadioButton rdbtnAdministracion = new JRadioButton("Administración");
		bgEspecialidad.add(rdbtnAdministracion);
		rdbtnAdministracion.setBounds(33, 207, 109, 23);
		rdbtnAdministracion.setActionCommand("Administración");
		contentPane.add(rdbtnAdministracion);
		
		JLabel lblHorasDedicadas = new JLabel("Horas dedicadas al ordenador");
		lblHorasDedicadas.setHorizontalAlignment(SwingConstants.LEFT);
		lblHorasDedicadas.setBounds(23, 237, 180, 14);
		contentPane.add(lblHorasDedicadas);
		
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setToolTipText("prueba");
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(33, 271, 200, 23);
		contentPane.add(slider);
		
		JLabel lblNewLabel_1 = new JLabel("0                            5                           10");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(40, 295, 200, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Enviar Encuesta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarInfo("" +
							"SO preferido: " + bgSO.getSelection().getActionCommand() +
							"\nEspecialidad: " + bgEspecialidad.getSelection().getActionCommand() +
							"\nHoras dedicadas al ordenador: "+ slider.getValue()
						);
				bgSO.clearSelection();
				bgEspecialidad.clearSelection();
				slider.setValue(5);
			}
		});
		btnNewButton.setBounds(117, 346, 174, 23);
		contentPane.add(btnNewButton);
	}
	
	public static void mostrarInfo(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
}
