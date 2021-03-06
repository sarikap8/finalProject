package control;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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

import view.AP_UI;
import view.ArrayListUI;
import view.PalindromeUI;
import view.jumperGUI;
import view.linkedListUI;

import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Font;

public class MenuControl extends JFrame {

	private static final long serialVersionUID = 1L;

	public MenuControl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setBackground(new Color(176, 196, 222));

		JLabel lblNewLabel = new JLabel("Welcome to Sarika's collection of work! Please refer to the menu bar ");

		getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

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

		JMenu mnSprint = new JMenu("Math Labs");
		menuBar.add(mnSprint);

		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator frame = new Calculator();
				frame.setVisible(true);
			}
		});
		mnSprint.add(mntmCalculator);

		JMenuItem mntmArrayList = new JMenuItem("ArrayList Search Algo");
		mntmArrayList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayListUI frame = new ArrayListUI();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmArrayList);

		JMenuItem mntmArrayListTest = new JMenuItem("ArrayList Test");
		mntmArrayListTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_UI frame = new AP_UI();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmArrayListTest);

		JMenuItem mntmJumpers = new JMenuItem("Jumpers");
		mntmJumpers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jumperGUI frame = new jumperGUI();
				frame.setVisible(true);

			}
		});
		mnNewMenu.add(mntmJumpers);

		JMenuItem mntmPlayerStatsLinked = new JMenuItem("Player Stats Linked List");
		mntmPlayerStatsLinked.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linkedListUI frame = new linkedListUI();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmPlayerStatsLinked);

	}

	// added main
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

}
