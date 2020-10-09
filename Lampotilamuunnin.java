package muunnin;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lampotilamuunnin {
	private static JTextField textField;
	private static JPanel panel;

	public static void main(String[] args) {

		JFrame ikkuna = new JFrame("Celsius Converter");
		JLabel tekstikentt�1 = new JLabel("Celcius: ");
		JTextField sy�te = new JTextField();
		JLabel tekstikentt�2 = new JLabel("Fahrenheit: ");
		JButton nappi1 = new JButton("Convert");

		ikkuna.getContentPane().setLayout(new GridLayout(2, 2));
		ikkuna.getContentPane().add(sy�te);
		ikkuna.getContentPane().add(tekstikentt�1);
		ikkuna.getContentPane().add(tekstikentt�2);
		ikkuna.setSize(600, 125);
		
		nappi1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String tulos= sy�te.getText();
				double tulos1 = Double.parseDouble(tulos);
				double tulos2=(tulos1*1.8+32);
				tekstikentt�2.setText("Fahrenheit: " + tulos2);
				
			}
			
			
		});

		// Lis�t��n komponentit ikkunaan. //

		ikkuna.add(tekstikentt�1);
		ikkuna.add(sy�te);
		ikkuna.add(nappi1);
		ikkuna.add(tekstikentt�2);

		ikkuna.setVisible(true);
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
