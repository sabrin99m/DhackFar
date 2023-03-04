package Interface;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ordineprovvisorio {

	private JFrame ordineprov;
	private DefaultTableModel model;
	private JTable table_1;

	/**
	 * Create the application.
	 */
	public ordineprovvisorio() {
		creaordineprovvisorio();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void creaordineprovvisorio() {
		ordineprov = new JFrame();
		ordineprov.setTitle("DhackFar1.0");
		ordineprov.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ordineprovvisorio.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		ordineprov.setBounds(100, 100, 450, 300);
		ordineprov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ordineprov.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 22, 436, 209);
		ordineprov.getContentPane().add(scrollPane);

		table_1 = new JTable();
		model = new DefaultTableModel(new Object[][] {}, new String[] { "ProdottoID", "Quantity" });
		table_1.setModel(model);
		scrollPane.setViewportView(table_1);

		JLabel lblNewLabel = new JLabel("Ordine Provvisorio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 0, 139, 25);
		ordineprov.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ordineprov.setVisible(false);
			}
		});
		btnNewButton.setBounds(337, 229, 89, 23);
		ordineprov.getContentPane().add(btnNewButton);

	}

	public void visualizzaordineprovvisorio() {
		ordineprov.setVisible(true);
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

}
