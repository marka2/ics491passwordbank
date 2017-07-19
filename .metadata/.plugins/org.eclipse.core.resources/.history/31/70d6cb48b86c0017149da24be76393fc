package ics491passBank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel menuInstructions = new JLabel("Listed below are the websites, their usernames, and their corresponding passwords.");
		menuInstructions.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		menuInstructions.setBounds(23, 16, 421, 13);
		contentPane.add(menuInstructions);
		
		table = new JTable();
		table.setBounds(51, 56, 342, 130);
		contentPane.add(table);
		
		JButton btnCreateNewEntry = new JButton("Create New Entry");
		btnCreateNewEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 					// Place the actions to create a new entry here!
			{
				
			}
		});
		btnCreateNewEntry.setBounds(23, 215, 131, 29);
		contentPane.add(btnCreateNewEntry);
		
		JButton btnDeleteEntry = new JButton("Delete Entry");
		btnDeleteEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 					// Place the actions to delete an entry here!
			{
				
			}
		});
		btnDeleteEntry.setBounds(152, 215, 131, 29);
		contentPane.add(btnDeleteEntry);
		
		JButton btnNewButton = new JButton("Edit Entry");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 					// Place the actions to edit an entry here!
			{
				
			}
		});
		btnNewButton.setBounds(278, 215, 131, 29);
		contentPane.add(btnNewButton);
	}
}
