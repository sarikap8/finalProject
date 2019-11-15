package finalProject;

/**
 * UI for arraylist lab
 * 
 * support one input and multiple outputs
 * 
 * @version 1.0
 * @author Sarika
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
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
import javax.swing.JScrollPane;

public class ArrayListUI extends MenuControl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField integer_input;
	private JTextArea integer_result;
	private JLabel lblLookAtResulting;
	private JScrollPane scrollPane;

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
	public ArrayListUI() {
		// ArrayListCode sol = new ArrayListCode();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIntegerCanidate = new JLabel("Enter Integer to search for here");
		lblIntegerCanidate.setBounds(6, 0, 313, 26);
		contentPane.add(lblIntegerCanidate);

		integer_input = new JTextField();
		integer_input.setBounds(6, 21, 420, 26);
		contentPane.add(integer_input);
		integer_input.setColumns(10);

		JButton btnTestPrime = new JButton("Test");
		btnTestPrime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				integer_result.setText(
						ArrayListCode.labSolution(Integer.parseInt(integer_input.getText()))
						);
			}
		});
		btnTestPrime.setBounds(152, 49, 145, 29);
		contentPane.add(btnTestPrime);
		
		lblLookAtResulting = new JLabel("Look at resulting first prime number and all primes until it here");
		lblLookAtResulting.setBounds(6, 234, 420, 16);
		contentPane.add(lblLookAtResulting);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 90, 402, 132);
		contentPane.add(scrollPane);
						
								integer_result = new JTextArea();
								scrollPane.setViewportView(integer_result);
								integer_result.setWrapStyleWord(true);
								integer_result.setBackground(Color.WHITE);
								integer_result.setLineWrap(true);
								integer_result.setToolTipText("");
								integer_result.setEditable(false);
								integer_result.setColumns(10);

	}
}
