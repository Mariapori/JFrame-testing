import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ikkuna extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String[] tavat = { "+", "-", "*", "/"};
	public Ikkuna() {
		this.setTitle("Mariaporin laskin");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(300, 200));
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JTextField num1 = new JTextField();
		num1.setPreferredSize(new Dimension(100,20));
		JTextField num2 = new JTextField();
		num2.setPreferredSize(new Dimension(100,20));
		JComboBox<String> tapa = new JComboBox<String>(tavat);
	    JButton b = new JButton("Laske");
	    b.setBounds(300 / 2,200 / 2, 30, 10);
	    b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int numero1 = Integer.parseInt(num1.getText());
	    		int numero2 = Integer.parseInt(num2.getText());
	    		int vastaus = 0;
	    		
	    		switch(tapa.getSelectedItem().toString()) {
	    		case "+":
	    			vastaus = numero1 + numero2;
	    			break;
	    		case "-":
	    			vastaus = numero1 - numero2;
	    			break;
	    		case "*":
	    			vastaus = numero1 * numero2;
	    			break;
	    		case "/":
	    			vastaus = numero1 / numero2;
	    			break;
	    		}
	    		
	    		JOptionPane.showMessageDialog(null, "Vastaus on " + vastaus, "Vastaus", JOptionPane.PLAIN_MESSAGE);
	    	}
	    });
	    panel.add(num1);
	    panel.add(tapa);
	    panel.add(num2);
		panel.add(b);
		this.add(panel);
		this.pack();
		this.setVisible(true);
	
	}

}
