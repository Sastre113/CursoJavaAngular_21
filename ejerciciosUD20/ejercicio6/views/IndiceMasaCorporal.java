/**
 * 
 */
package views;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * @author Miguel A. Sastre
 *
 */
public class IndiceMasaCorporal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;
	private JTextField textFieldIMC;



	/**
	 * Create the frame.
	 */
	public IndiceMasaCorporal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 141);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAltura = new JLabel(" Altura (metros)");
		lblAltura.setBounds(44, 14, 93, 14);
		contentPane.add(lblAltura);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(143, 11, 86, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JLabel lblPESO = new JLabel("Peso (kg)");
		lblPESO.setBounds(255, 14, 57, 14);
		contentPane.add(lblPESO);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(318, 11, 86, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		JButton btnCalcularIMC = new JButton("Calcular IMC");
		btnCalcularIMC.setBounds(143, 62, 93, 23);
		btnCalcularIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldIMC.setText(String.format("%.2f", (Double.valueOf(textFieldPeso.getText()) / (Math.pow(Double.valueOf(textFieldAltura.getText()),2)))) );
			}
		});
		contentPane.add(btnCalcularIMC);
		
		JLabel lblIMC = new JLabel("IMC");
		lblIMC.setHorizontalAlignment(SwingConstants.CENTER);
		lblIMC.setBounds(267, 66, 45, 14);
		contentPane.add(lblIMC);
		
		textFieldIMC = new JTextField();
		textFieldIMC.setBounds(318, 63, 86, 20);
		textFieldIMC.setEditable(false);
		contentPane.add(textFieldIMC);
		textFieldIMC.setColumns(10);
	}
}
