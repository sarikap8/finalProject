package finalProject; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class MenuControl extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuControl frame = new MenuControl();
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
	public MenuControl() {
		getContentPane().setBackground(new Color(100, 149, 237));
		
		JLabel lblNewLabel = new JLabel("Welcome to Sarika's collection of work! Please refer to the menu bar above to select a ");
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblProjectToView = new JLabel("PROJECT TO VIEW :D");
		lblProjectToView.setVerticalAlignment(SwingConstants.TOP);
		getContentPane().add(lblProjectToView, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCalculator = new JMenu("Intro");
		menuBar.add(mnCalculator);
		
		JMenu mnJumpers = new JMenu("Jumpers");
		mnCalculator.add(mnJumpers);
		
		JMenuItem mntmOriginal = new JMenuItem("Original");
		mnJumpers.add(mntmOriginal);
		
		JMenuItem mntmInputs = new JMenuItem("Inputs");
		mnJumpers.add(mntmInputs);
		
		JMenu mnNewMenu = new JMenu("String Labs");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmPalindrom = new JMenuItem("Palindrome 3 ways");
		mntmPalindrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PalindromeUI frame = new PalindromeUI();
				frame.setVisible(true);			
			}
		});
		mnNewMenu.add(mntmPalindrom);
		
		
		JMenu mnSprint = new JMenu("Jigsaw");
		menuBar.add(mnSprint);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator frame = new Calculator();
				frame.setVisible(true);			
			}
		});
		mnSprint.add(mntmCalculator);
		
		JMenuItem mntmArrayList = new JMenuItem("ArrayList");
		mntmArrayList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayListUI frame = new ArrayListUI();
				frame.setVisible(true);			
			}
		});
		mnNewMenu.add(mntmArrayList);
		
	}
	
}
