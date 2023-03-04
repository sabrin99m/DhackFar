package Interface;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import persone.User;

public class Giacenzeif {

	private JFrame MagazzinoGiacenze;
	private JTextArea textArea;

	/**
	 * Create the application.
	 */

	public Giacenzeif(User utente) {
		visualizzagiacenze(utente);
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @wbp.parser.entryPoint
	 */
	protected void visualizzagiacenze(User utente) {
		MagazzinoGiacenze = new JFrame();
		MagazzinoGiacenze.getContentPane().setBackground(new Color(222, 254, 252));
		MagazzinoGiacenze.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Giacenzeif.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		MagazzinoGiacenze.setTitle("DhackFar1.0");
		MagazzinoGiacenze.setVisible(true);
		MagazzinoGiacenze.setBounds(100, 100, 450, 300);
		MagazzinoGiacenze.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MagazzinoGiacenze.getContentPane().setLayout(null);

		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MagazzinoGiacenze.setVisible(false);
				homeif home = new homeif(utente);
			}
		});
		Back.setBackground(null);
		Back.setBounds(337, 229, 89, 23);
		MagazzinoGiacenze.getContentPane().add(Back);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 426, 223);
		MagazzinoGiacenze.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setColumns(10);
		textArea.setText(utente.visualizzaGiacenze());

	}
}
