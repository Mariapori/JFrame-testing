import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ikkuna extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int painettu;
	Ikkuna(){
		this.setTitle("Mariaporin testailua");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(600, 600));
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
	    JButton b = new JButton("Paina tästä");
	    b.setBounds(600 / 2,600 / 2, 30, 10);
	    b.addActionListener(this);
		panel.add(b);
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		painettu++;
		JOptionPane.showMessageDialog(null, "Painettu " + painettu, "Huomio!", JOptionPane.INFORMATION_MESSAGE);
	}

}
