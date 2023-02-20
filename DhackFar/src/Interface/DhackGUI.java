package Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class DhackGUI {

	private JFrame frmDhackfar;
	private JTextField txtCiao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					DhackGUI window = new DhackGUI();
					window.frmDhackfar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DhackGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDhackfar = new JFrame();
		frmDhackfar.setTitle("DhackFar1.0");
		frmDhackfar.getContentPane().setForeground(new Color(0, 0, 0));
		frmDhackfar.getContentPane().setBackground(new Color(222, 254, 252));
		frmDhackfar.setBounds(100, 100, 450, 300);
		frmDhackfar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon(DhackGUI.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frmDhackfar.setVisible(false);
				loginif login = new loginif();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));

		txtCiao = new JTextField();
		txtCiao.setText(LocalDateTime.now().toString());
		txtCiao.setEditable(false);
		txtCiao.setBackground(null);
		txtCiao.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("BENVENUTO");
		lblNewLabel_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 30));

		GroupLayout groupLayout = new GroupLayout(frmDhackfar.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap()
								.addComponent(txtCiao, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
								.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup().addGap(141).addComponent(btnNewButton,
								GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGap(113).addComponent(lblNewLabel_1,
								GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblNewLabel))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup().addGap(54)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGap(31)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE).addComponent(txtCiao,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		frmDhackfar.getContentPane().setLayout(groupLayout);
	}

}
