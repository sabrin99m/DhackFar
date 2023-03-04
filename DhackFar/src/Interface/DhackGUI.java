package Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
	private JTextField dataora;
	private JTextField internetconnection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					DhackGUI window = new DhackGUI();
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
		frmDhackfar.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DhackGUI.class.getResource("/doc/resources/dhack3-removebg-preview-_1_.gif")));
		frmDhackfar.setTitle("DhackFar1.0");
		frmDhackfar.setVisible(true);
		frmDhackfar.getContentPane().setForeground(new Color(0, 0, 0));
		frmDhackfar.getContentPane().setBackground(new Color(222, 254, 252));
		frmDhackfar.setBounds(100, 100, 450, 300);
		frmDhackfar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("DhackFar 4 EasyDhack");
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

		dataora = new JTextField();
		dataora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		String data = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		dataora.setText(data);
		dataora.setEditable(false);
		dataora.setBackground(null);
		dataora.setColumns(10);

		internetconnection = new JTextField();
		internetconnection.setBackground(null);
		internetconnection.setHorizontalAlignment(SwingConstants.RIGHT);
		internetconnection.setEditable(false);
		String site = "www.google.it";
		try (Socket socket = new Socket()) {
			InetSocketAddress addr = new InetSocketAddress(site, 80);
			socket.connect(addr, 3000);
			boolean isconnected = socket.isConnected();
			if (isconnected) {
				internetconnection.setText("Connesso a internet.");
			} else {
				internetconnection.setText("Connessione assente.");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		internetconnection.setColumns(10);

		GroupLayout groupLayout = new GroupLayout(frmDhackfar.getContentPane());
		groupLayout
				.setHorizontalGroup(
						groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup().addGap(153)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 125,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(158, Short.MAX_VALUE))
								.addGroup(groupLayout
										.createSequentialGroup().addContainerGap(306, Short.MAX_VALUE)
										.addComponent(internetconnection, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addComponent(dataora, GroupLayout.PREFERRED_SIZE, 183,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
										.addComponent(lblNewLabel).addGap(19)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(internetconnection, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(79)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addComponent(dataora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(31)));
		frmDhackfar.getContentPane().setLayout(groupLayout);
	}
}
