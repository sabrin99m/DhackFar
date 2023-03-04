package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import persone.User;

public class DDT {

	private JFrame frameddt;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public DDT(User utente) {
		nuovoDDT(utente);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void nuovoDDT(User utente) {
		frameddt = new JFrame();
		frameddt.getContentPane().setBackground(new Color(222, 254, 252));
		frameddt.getContentPane().setLayout(null);
		frameddt.setVisible(true);

		JLabel lblNewLabel = new JLabel("Inserire numero DDT: ");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(144, 82, 177, 30);
		frameddt.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(144, 119, 161, 30);
		frameddt.getContentPane().add(textField);
		textField.setColumns(10);

		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameddt.setVisible(false);
				homeif home = new homeif(utente);
			}
		});
		Back.setBackground(null);
		Back.setBounds(337, 229, 89, 23);
		frameddt.getContentPane().add(Back);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				com.archetype.Package.DDT ddt = new com.archetype.Package.DDT(Long.parseLong(textField.getText()));
				utente.InserisciDDT(ddt);
			}
		});
		btnNewButton.setBounds(179, 161, 89, 23);
		frameddt.getContentPane().add(btnNewButton);

		frameddt.setTitle("DhackFar1.0");
		frameddt.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DDT.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		frameddt.setBounds(100, 100, 450, 300);
		frameddt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
