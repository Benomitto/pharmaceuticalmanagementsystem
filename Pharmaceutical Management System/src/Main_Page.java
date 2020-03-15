import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main_Page extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Page frame = new Main_Page();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocation(50, 10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 300, 659);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdministratorLoginPage = new JLabel("Administrator Login Page");
		lblAdministratorLoginPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Admin ad = new Admin();
				ad.show();
				ad.setResizable(false);
				ad.setLocation(50,10);
				dispose();
			}
		});
		lblAdministratorLoginPage.setForeground(Color.WHITE);
		lblAdministratorLoginPage.setBounds(44, 196, 200, 20);
		lblAdministratorLoginPage.setFont(new Font("Arial", Font.BOLD, 17));
		panel.add(lblAdministratorLoginPage);
		
		JButton btnNewButton = new JButton("Drug Suppliers");
		btnNewButton.setBounds(349, 67, 150, 150);
		contentPane.add(btnNewButton);
		
		JButton btnPurchaseDetails = new JButton("Purchase Details");
		btnPurchaseDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPurchaseDetails.setBounds(583, 67, 150, 150);
		contentPane.add(btnPurchaseDetails);
		
		JButton btnSupplierDetails = new JButton("Supplier Details");
		btnSupplierDetails.setBounds(810, 67, 150, 150);
		contentPane.add(btnSupplierDetails);
		
		JButton btnReport = new JButton("Report");
		btnReport.setBounds(1040, 67, 150, 150);
		contentPane.add(btnReport);
		
		JButton btnWholesaleCustomerDetails = new JButton("Wholesale Customers");
		btnWholesaleCustomerDetails.setBounds(349, 386, 150, 150);
		contentPane.add(btnWholesaleCustomerDetails);
		
		JButton btnDrugDetails = new JButton("Drug Details");
		btnDrugDetails.setBounds(583, 386, 150, 150);
		contentPane.add(btnDrugDetails);
		
		JButton btnBills = new JButton("Bills");
		btnBills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBills.setBounds(811, 386, 150, 150);
		contentPane.add(btnBills);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(1040, 386, 150, 150);
		contentPane.add(btnExit);
	}
}
