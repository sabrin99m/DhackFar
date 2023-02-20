package Interface;

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

	private JFrame frmDhackfar;
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
		frmDhackfar = new JFrame();
		frmDhackfar.setVisible(true);
		frmDhackfar.setTitle("DhackFar1.0");
		frmDhackfar.setBounds(100, 100, 450, 300);
		frmDhackfar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				User user = new User(userfield.getText(), passfield.getText());
				boolean corretto = user.login(user.getNome(), user.getPassword());
				if (corretto) {
					// apri nuova scheda
					RISULTATO.setText("Autenticazione effettuata.");
				} else {
					RISULTATO.setText("Nome utente o password non corretti.");
					// nome utente o password non corretti
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
		RISULTATO.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frmDhackfar.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(139)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(RISULTATO, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passfield, Alignment.LEADING).addComponent(userfield, Alignment.LEADING)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134,
										Short.MAX_VALUE)))
				.addContainerGap(163, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(34)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(userfield, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(lblNewLabel_1).addGap(18)
						.addComponent(passfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(RISULTATO, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		frmDhackfar.getContentPane().setLayout(groupLayout);
	}

}
