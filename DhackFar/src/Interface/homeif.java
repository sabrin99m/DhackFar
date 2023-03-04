package Interface;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;

import persone.User;

public class homeif {

	private JFrame frmHome;

	/**
	 * Create the application.
	 */
	public homeif(User utente) {
		home(utente);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void home(User utente) {
		frmHome = new JFrame();
		frmHome.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(homeif.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		frmHome.setTitle("DhackFar1.0");
		frmHome.getContentPane().setBackground(new Color(222, 254, 252));
		frmHome.setVisible(true);

		JButton nuovoOrdine = new JButton("Nuovo Ordine");
		nuovoOrdine.setToolTipText("nuovo ordine");
		nuovoOrdine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Nuovoordineif nuovoordine = new Nuovoordineif(utente);
			}
		});

		JButton btnNewButton = new JButton("Inserisci DDT");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DDT nuovoDdt = new DDT(utente);

			}
		});
		btnNewButton.setToolTipText("inserisci ddt");

		JButton btnNewButton_1 = new JButton("Visualizza Ordini");
		btnNewButton_1.setToolTipText("visualizza ordini");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				viewOrdini ifOrdini = new viewOrdini(utente);
			}
		});

		JButton btnNewButton_2 = new JButton("Visualizza Giacenze");
		btnNewButton_2.setToolTipText("visualizza giacenze");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Giacenzeif magazzino = new Giacenzeif(utente);
			}
		});

		JButton btnNewButton_3 = new JButton("Visualizza Scadenze");
		btnNewButton_3.setToolTipText("visualizza scadenze");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Scadenzeif magazzino = new Scadenzeif(utente);
			}
		});

		JButton btnNewButton_4 = new JButton("LogOff");
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmHome.setVisible(false);
				DhackGUI backtoinizio = new DhackGUI();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmHome.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(81)
				.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGap(18).addComponent(btnNewButton_3).addGap(77))
				.addGroup(groupLayout.createSequentialGroup().addGap(29).addGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING).addComponent(btnNewButton_4)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(nuovoOrdine, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 117,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(30, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(65).addComponent(btnNewButton_1,
								GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup().addGap(66)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(nuovoOrdine, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))))
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
				.addGap(73).addComponent(btnNewButton_4).addContainerGap()));
		frmHome.getContentPane().setLayout(groupLayout);
		frmHome.setBounds(100, 100, 450, 300);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
