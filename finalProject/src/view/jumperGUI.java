package view;

/**
 * UI for countdown song lab
 * 
 * support one input and multiple outputs
 * 
 * @version 1.0
 * @author Sarika Pasumarthy
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import control.MenuControl;
import model_minilabs.OGJumperCode;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JScrollPane;

public class jumperGUI extends MenuControl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jumpers_input;
	private JTextField jumpers_count; 
	private JTextArea jumpers_result;
	private JLabel lblLookAtResulting;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayListUI frame = new ArrayListUI();
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
	public jumperGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblJumperName = new JLabel("Who are your jumpers?");
		lblJumperName.setBounds(6, 0, 313, 26);
		contentPane.add(lblJumperName);

		jumpers_input = new JTextField();
		jumpers_input.setBounds(6, 21, 209, 26);
		contentPane.add(jumpers_input);
		jumpers_input.setColumns(10);
		
		JLabel lblJumperCount = new JLabel("How many jumpers?");
		lblJumperCount.setBounds(217, 0, 313, 26);
		contentPane.add(lblJumperCount);

		jumpers_count = new JTextField();
		jumpers_count.setBounds(217, 21, 209, 26);
		contentPane.add(jumpers_count);
		jumpers_count.setColumns(10);

		JButton btnSong = new JButton("Write the Song");
		btnSong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jumpers_result.setText(
						OGJumperCode.runTheSong(Integer.parseInt(jumpers_count.getText()), jumpers_input.getText())); 
			}
		});
		
		btnSong.setBounds(281, 49, 145, 29);
		contentPane.add(btnSong);
		
		lblLookAtResulting = new JLabel("Countdown Song!");
		lblLookAtResulting.setBounds(6, 234, 420, 16);
		contentPane.add(lblLookAtResulting);
		
		JTextArea txtrNotePlease = new JTextArea();
		txtrNotePlease.setLineWrap(true);
		txtrNotePlease.setBackground(new Color(72, 209, 204));
		txtrNotePlease.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		txtrNotePlease.setText("Note: after pressing the button please go to console and press enter for the program to work :D ");
		txtrNotePlease.setBounds(6, 49, 279, 26);
		contentPane.add(txtrNotePlease);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 76, 420, 153);
		contentPane.add(scrollPane);
		
				jumpers_result = new JTextArea();
				scrollPane.setViewportView(jumpers_result);
				jumpers_result.setWrapStyleWord(true);
				jumpers_result.setBackground(Color.WHITE);
				jumpers_result.setLineWrap(true);
				jumpers_result.setToolTipText("");
				jumpers_result.setEditable(false);
				jumpers_result.setColumns(10);

	}
}
