package ics491passBank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AccountCreation extends JFrame {

	private JFrame frame;
	private JPanel contentPane;
	private JTextField uName;
	private JTextField pWord;
	private JTextField sQuestion1;
	private JTextField sAnswer1;
	private JTextField sQuestion2;
	private JTextField sAnswer2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountCreation frame = new AccountCreation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public AccountCreation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter in a username, password, security " + "\n" + "password questions and answers below:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel.setBounds(6, 20, 543, 43);
		contentPane.add(lblNewLabel);
		
		JLabel newUsername = new JLabel("Username");
		newUsername.setBounds(50, 75, 101, 24);
		contentPane.add(newUsername);
		
		JLabel newPassword = new JLabel("Password");
		newPassword.setBounds(50, 109, 61, 24);
		contentPane.add(newPassword);
		
		JLabel Security1 = new JLabel("Security Question 1");
		Security1.setBounds(50, 137, 137, 24);
		contentPane.add(Security1);
		
		JLabel Security2 = new JLabel("Security Question 2");
		Security2.setBounds(50, 197, 137, 24);
		contentPane.add(Security2);
		
		JLabel SecurityAnswer1 = new JLabel("Security Question 1 Answer");
		SecurityAnswer1.setBounds(50, 165, 180, 24);
		contentPane.add(SecurityAnswer1);
		
		JLabel SecurityAnswer2 = new JLabel("Security Question 2 Answer");
		SecurityAnswer2.setBounds(50, 227, 180, 24);
		contentPane.add(SecurityAnswer2);
		
		uName = new JTextField();
		uName.setBounds(276, 75, 134, 32);
		contentPane.add(uName);
		uName.setColumns(10);
		
		pWord = new JTextField();
		pWord.setBounds(276, 109, 134, 32);
		contentPane.add(pWord);
		pWord.setColumns(10);
		
		sQuestion1 = new JTextField();
		sQuestion1.setBounds(276, 137, 134, 32);
		contentPane.add(sQuestion1);
		sQuestion1.setColumns(10);
		
		sAnswer1 = new JTextField();
		sAnswer1.setBounds(276, 165, 134, 32);
		contentPane.add(sAnswer1);
		sAnswer1.setColumns(10);
		
		sQuestion2 = new JTextField();
		sQuestion2.setBounds(276, 197, 134, 32);
		contentPane.add(sQuestion2);
		sQuestion2.setColumns(10);
		
		sAnswer2 = new JTextField();
		sAnswer2.setBounds(276, 227, 134, 32);
		contentPane.add(sAnswer2);
		sAnswer2.setColumns(10);
				
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 			// enter actions when pressing submit button here!
			{
				frame = new JFrame();
				frame.setBounds(100, 100, 450, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
				//Insert new user
		        try {
					Class.forName("org.apache.derby.jdbc.ClientDriver");
		        Connection con = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/user");
		        Statement stat = con.createStatement();
		        stat.executeQuery("INSERT INTO users (userName, password, SQ1, "
				      + "answer1, SQ2, answer2) VALUES('"+uName+"','"+pWord+"','"+sQuestion1+"','"+sAnswer1+"','"+sQuestion2+"','"+sAnswer2+"')");
		        
				JOptionPane.showMessageDialog(frame, "Account Successfully Created!");
		        } catch (Exception ex) {
		        	System.out.println("Failed to make connection to the database. " 
		        			           + "Error: " +ex.getMessage());
		        }
			}
		});
		submitButton.setBounds(230, 285, 117, 29);
		contentPane.add(submitButton);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Login loginWindow = new Login();
				loginWindow.frame.setVisible(true);
				dispose(); //Remove AccountCreation frame
			}
		});
		backButton.setBounds(100, 285, 117, 29);
		contentPane.add(backButton);
		
	}
	
}
