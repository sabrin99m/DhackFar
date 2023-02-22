package Interface;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import persone.User;

public class Scadenzeif {

	private JFrame magazzinoscadenze;

	/**
	 * Create the application.
	 */
	public Scadenzeif(User utente) {
		visualizzascadenze(utente);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void visualizzascadenze(User utente) {
		magazzinoscadenze = new JFrame();
		magazzinoscadenze.getContentPane().setBackground(new Color(222, 254, 252));
		magazzinoscadenze.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Scadenzeif.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		magazzinoscadenze.setTitle("DhackFar1.0");
		magazzinoscadenze.setVisible(true);
		magazzinoscadenze.setBounds(100, 100, 450, 300);
		magazzinoscadenze.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		magazzinoscadenze.getContentPane().setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setBounds(0, 0, 410, 223);
		magazzinoscadenze.getContentPane().add(textArea);

		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				magazzinoscadenze.setVisible(false);
				homeif home = new homeif(utente);
			}
		});
		Back.setBackground(null);
		Back.setBounds(337, 229, 89, 23);
		magazzinoscadenze.getContentPane().add(Back);
	}
}
