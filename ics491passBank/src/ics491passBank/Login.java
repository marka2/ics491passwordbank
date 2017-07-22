package ics491passBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {
	Connection con;
	Statement st;
	ResultSet rs;
	
	private JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		connect();
		initialize();
	}
	
	public void connect() {
		try {
			// Database URL where sun is the driver name.
			String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
			Class.forName(driver);
			
			//Connection String, where db1 is the database name.
			String db = "jdbc:odbc:db1";
			con = DriverManager.getConnection(db);
			st = con.createStatement();
		} catch (Exception ex) {
			System.out.println(
					"Failed to make connection to the database. "
					+ "Error: " + ex.getMessage());
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnWelcomeToThe = new JTextPane();
		txtpnWelcomeToThe.setBounds(0, 0, 450, 16);
		txtpnWelcomeToThe.setText("	       Welcome to the Website Password Bank");
		frame.getContentPane().add(txtpnWelcomeToThe);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(49, 113, 61, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(49, 68, 87, 16);
		frame.getContentPane().add(lblUsername);
		
		username = new JTextField();
		username.setBounds(223, 62, 134, 28);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// This is the action when you press the login button
				
				String uname = username.getText();
				String pad = passwordField.getText();
				
				if (uname.equals("name") && pad.equals("password")) // this will check if the correct username and password is entered to gain access to the account information
				{
					JOptionPane.showMessageDialog(frame, "you are sucessfully logged in");
					Menu menu = new Menu();
					menu.setVisible(true);

				}
				else
				{
					JOptionPane.showMessageDialog(frame,  "Invalid username or password");
				}
				
			}
		});
		btnLogin.setBounds(147, 140, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblPleaseEnterIn = new JLabel("Please enter in your username and password below then click Login");
		lblPleaseEnterIn.setBounds(10, 28, 434, 28);
		frame.getContentPane().add(lblPleaseEnterIn);
		
		JLabel lblToCreateA = new JLabel("To create a new account click the Create Account button");
		lblToCreateA.setBounds(33, 181, 378, 16);
		frame.getContentPane().add(lblToCreateA);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 						// this is the function that occurs when the user presses the create account button on the login page
			{
				AccountCreation accountWindow = new AccountCreation();		// the create account window will open
				accountWindow.setVisible(true);
			}
		});
		btnCreateAccount.setBounds(135, 209, 147, 28);
		frame.getContentPane().add(btnCreateAccount);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(223, 107, 134, 28);
		frame.getContentPane().add(passwordField);
	}
}
