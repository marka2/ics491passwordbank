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
import java.awt.event.ActionEvent;

public class NewEntry extends JFrame {

	private JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField websiteName;
	private JTextField uName;
	private JTextField pWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewEntry frame = new NewEntry();
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
	public NewEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseEnterIn = new JLabel("Please enter in the data needed to create a new entry and press submit");
		lblPleaseEnterIn.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblPleaseEnterIn.setBounds(19, 6, 443, 16);
		contentPane.add(lblPleaseEnterIn);
		
		JLabel lblWebsite = new JLabel("Website");
		lblWebsite.setBounds(40, 64, 61, 16);
		contentPane.add(lblWebsite);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(40, 109, 73, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(40, 152, 61, 16);
		contentPane.add(lblPassword);
		
		websiteName = new JTextField();
		websiteName.setBounds(201, 60, 200, 24);
		contentPane.add(websiteName);
		websiteName.setColumns(10);
		
		uName = new JTextField();
		uName.setBounds(201, 102, 200, 30);
		contentPane.add(uName);
		uName.setColumns(10);
		
		pWord = new JTextField();
		pWord.setBounds(201, 145, 200, 30);
		contentPane.add(pWord);
		pWord.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 				// place action when user presses submit on new entry page here!
			{
				frame = new JFrame();
				frame.setBounds(100, 100, 450, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
				JOptionPane.showMessageDialog(frame, "New Entry Successfully Added!");
			}
		});
		btnSubmit.setBounds(230, 210, 117, 29);
		contentPane.add(btnSubmit);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Menu menuWindow = new Menu();
				menuWindow.setVisible(true);
				dispose(); //Remove NewEntry frame
			}
		});
		backButton.setBounds(100, 210, 117, 29);
		contentPane.add(backButton);
		
	}
}
