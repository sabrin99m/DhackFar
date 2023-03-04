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

public class viewOrdini {

	private JFrame viewordini;

	public viewOrdini(User utente) {
		vediordini(utente);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void vediordini(User utente) {
		viewordini = new JFrame();
		viewordini.getContentPane().setBackground(new Color(222, 254, 252));
		viewordini.setTitle("DhackFar1.0");
		viewordini.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(viewOrdini.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		viewordini.setVisible(true);
		viewordini.setBounds(100, 100, 450, 300);
		viewordini.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewordini.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 408, 220);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		viewordini.getContentPane().add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setColumns(2);
		textArea.setRows(0);
		scrollPane.setViewportView(textArea);
		textArea.setText(utente.visualizzaOrdini());

		JButton Back = new JButton("Back");
		Back.setBounds(337, 229, 89, 23);
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				viewordini.setVisible(false);
				homeif home = new homeif(utente);
			}
		});
		Back.setBackground(null);
		viewordini.getContentPane().add(Back);
	}
}
