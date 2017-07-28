package ics491passBank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteEntry extends JFrame {

	private JFrame frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteEntry frame = new DeleteEntry();
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
	public DeleteEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseChooseWhich = new JLabel("Please choose which entry you would like to delete then press submit");
		lblPleaseChooseWhich.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblPleaseChooseWhich.setBounds(17, 6, 399, 23);
		contentPane.add(lblPleaseChooseWhich);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 				// place actions when user presses submit on delete entry page here!
			{
				frame = new JFrame();
				frame.setBounds(100, 100, 450, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
				JOptionPane.showMessageDialog(frame, "Entry Successfully Deleted!");
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
				dispose(); //Remove DeleteEntry frame
			}
		});
		backButton.setBounds(100, 210, 117, 29);
		contentPane.add(backButton);
	}

}
