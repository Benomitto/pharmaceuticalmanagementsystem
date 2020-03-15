import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
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
	public Admin() {
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
		
		JLabel lblBack = new JLabel("Back");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Main_Page back = new Main_Page();
				back.show();
				back.setLocation(50,10);
				dispose();
			}
		});
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("Arial", Font.BOLD, 17));
		lblBack.setBounds(93, 252, 46, 14);
		panel.add(lblBack);
		
		JButton btnNewButton = new JButton("Drug Details");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(349, 67, 150, 150);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Purchase Details");
		btnNewButton_1.setBounds(583, 67, 150, 150);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Purchase Report");
		btnNewButton_2.setBounds(810, 67, 150, 150);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Supplier Details");
		btnNewButton_3.setBounds(1040, 67, 150, 150);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Customer Details");
		btnNewButton_4.setBounds(349, 284, 150, 150);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Financial Report");
		btnNewButton_5.setBounds(583, 284, 150, 150);
		contentPane.add(btnNewButton_5);
		
		JButton btnStockReport = new JButton("Stock Report");
		btnStockReport.setBounds(810, 284, 150, 150);
		contentPane.add(btnStockReport);
		
		JButton btnNewButton_6 = new JButton("Bills");
		btnNewButton_6.setBounds(1040, 284, 150, 150);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Employee Details");
		btnNewButton_7.setBounds(353, 496, 150, 150);
		contentPane.add(btnNewButton_7);
		
		JButton btnEmployeeSalary = new JButton("Employee Salary");
		btnEmployeeSalary.setBounds(580, 496, 150, 150);
		contentPane.add(btnEmployeeSalary);
		
		JButton btnFinancialReport = new JButton("Financial Details");
		btnFinancialReport.setBounds(810, 492, 150, 150);
		contentPane.add(btnFinancialReport);
		
		JButton btnFinancialReport_1 = new JButton("Exit");
		btnFinancialReport_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnFinancialReport_1.setBounds(1040, 496, 150, 150);
		contentPane.add(btnFinancialReport_1);
	}

}
