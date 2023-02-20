package Interface;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import persone.User;

public class Magazzinoif {

	private JFrame Magazzino;
	private JTextArea textArea;

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @wbp.parser.entryPoint
	 */
	protected void visualizza(User utente) {
		Magazzino = new JFrame();
		Magazzino.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Magazzinoif.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		Magazzino.setTitle("DhackFar1.0");
		Magazzino.setVisible(true);
		Magazzino.setBounds(100, 100, 450, 300);
		Magazzino.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Magazzino.getContentPane().setLayout(null);

		textArea = new JTextArea();
		textArea.setBounds(0, 0, 436, 263);
		Magazzino.getContentPane().add(textArea);
		textArea.setColumns(10);

		System.out.println(utente.visualizzaGiacenze());
		textArea.setText(utente.visualizzaGiacenze());

	}
}
