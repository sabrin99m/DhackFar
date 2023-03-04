package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import persone.User;

public class Nuovoordineif {

	private JFrame newordine;
	private JTextField textField;

	public Nuovoordineif(User utente) {
		nuovoordine(utente);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void nuovoordine(User utente) {
		newordine = new JFrame();
		newordine.getContentPane().setBackground(new Color(222, 254, 252));
		newordine.getContentPane().setLayout(null);
		newordine.setVisible(true);
		ordineprovvisorio ordineprov = new ordineprovvisorio();

		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				newordine.setVisible(false);
				homeif home = new homeif(utente);
			}
		});
		Back.setBackground(null);
		Back.setBounds(337, 229, 89, 23);
		newordine.getContentPane().add(Back);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(153, 11, 273, 46);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		newordine.getContentPane().add(scrollPane_1);

		ArrayList<String> lista = utente.listaIDProdotti();
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 94, 263, 35);
		newordine.getContentPane().add(comboBox);
		comboBox.setEditable(true);

		textField = new JTextField();
		textField.setBounds(305, 93, 121, 37);
		newordine.getContentPane().add(textField);
		textField.setColumns(10);

		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object object = e.getSource();
				if (object == comboBox) {
					int i = comboBox.getSelectedIndex();
					textField.setText(lista.get(i));
				}
			}
		});

		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("Prodotti consigliati");
		textArea.setText(utente.prodotticonsigliati());
		scrollPane_1.setViewportView(textArea);

		for (String string : lista) {
			comboBox.addItem(string);
		}

		ArrayList<String> id = new ArrayList<>();
		ArrayList<Integer> q = new ArrayList<>();

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ordineprov.getModel().addRow(new Object[] { comboBox.getSelectedItem(), textField.getText() });
				id.add(comboBox.getSelectedItem().toString());
				String qu = textField.getText();
				q.add(Integer.parseInt(qu));
			}
		});
		btnNewButton.setBounds(385, 143, 41, 37);
		newordine.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("REVIEW");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ordineprov.visualizzaordineprovvisorio();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(95, 176, 133, 46);
		newordine.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("CONFERMA");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				utente.aggiungiordine(id, q);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(238, 176, 121, 46);
		newordine.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("Prodotto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 70, 112, 23);
		newordine.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Qty");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(310, 68, 49, 25);
		newordine.getContentPane().add(lblNewLabel_1);

		newordine.setTitle("DhackFar1.0");
		newordine.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Nuovoordineif.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		newordine.setBounds(100, 100, 450, 300);
		newordine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
