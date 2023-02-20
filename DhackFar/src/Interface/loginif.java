package Interface;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import persone.User;

public class loginif {

	private JFrame frmLogin;
	private JTextField userfield;
	private JTextField passfield;
	private JTextField RISULTATO;

	public loginif() {
		login();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	protected void login() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(loginif.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		frmLogin.getContentPane().setBackground(new Color(222, 254, 252));
		frmLogin.getContentPane().setForeground(new Color(0, 0, 0));
		frmLogin.setVisible(true);
		frmLogin.setTitle("DhackFar1.0");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				User user = new User(userfield.getText(), passfield.getText());
				boolean corretto = user.login(user.getNome(), user.getPassword());
				if (corretto) {
					// apri nuova scheda
					RISULTATO.setText("Autenticazione effettuata.");
					frmLogin.setVisible(false);
					homeif home = new homeif(user);
				} else {
					RISULTATO.setText("Nome utente o password non corretti.");
				}
			}
		});

		JLabel lblNewLabel = new JLabel("Inserire username");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_1 = new JLabel("Inserire password");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		userfield = new JTextField();
		userfield.setColumns(10);

		passfield = new JTextField();
		passfield.setColumns(10);

		RISULTATO = new JTextField();
		RISULTATO.setEditable(false);
		RISULTATO.setHorizontalAlignment(SwingConstants.CENTER);
		RISULTATO.setForeground(new Color(0, 0, 0));
		RISULTATO.setBackground(null);
		RISULTATO.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frmLogin.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(139)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(RISULTATO, Alignment.LEADING).addComponent(passfield, Alignment.LEADING)
								.addComponent(userfield, Alignment.LEADING).addComponent(btnNewButton,
										Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
						.addContainerGap(163, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING,
						groupLayout.createSequentialGroup().addGap(61)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE).addGap(88))
				.addGroup(groupLayout.createSequentialGroup().addGap(34)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(64)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(34)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(userfield, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addGap(30)
						.addComponent(lblNewLabel_1).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(passfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(RISULTATO, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		frmLogin.getContentPane().setLayout(groupLayout);
	}

}
