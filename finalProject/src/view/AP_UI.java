package view;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.MenuControl;
import model_apexam.Question;
import model_arraylist.ArrayListRandom;
import model_arraylist.ArrayListTBQ;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class AP_UI extends MenuControl {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea testQuestion = new JTextArea();
    private JTextArea testChoices = new JTextArea();
    private JTextArea testQuestionAnswer = new JTextArea();

    /**
     * Create the frame.
     */
    public AP_UI() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 445, 450);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(176, 196, 222));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblExamSections = new JLabel("Press new to view a new random question every time");
        lblExamSections.setBounds(10, 6, 458, 16);
        contentPane.add(lblExamSections);
  
        JButton btnArrayList = new JButton("New Text Based");
        btnArrayList.setBounds(20, 39, 152, 39);
        contentPane.add(btnArrayList);
        btnArrayList.setFont(new Font("Lucida Grande", Font.PLAIN, 13));

        btnArrayList.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    model_apexam.Question q = new model_arraylist.ArrayListTBQ();
                    testQuestion.setText(q.getQuestion());
                    testChoices.setText(q.getChoices());
                    testQuestionAnswer.setText(q.getAnswer());
                }
            });
        
        JButton btnNewRandom = new JButton("New Random");
        btnNewRandom.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		model_apexam.Question q = new model_arraylist.ArrayListRandom(); 
                testQuestion.setText(q.getQuestion());
                testChoices.setText(q.getChoices());
                testQuestionAnswer.setText(q.getAnswer());
        	}
        });
        btnNewRandom.setBounds(184, 41, 159, 39);
        contentPane.add(btnNewRandom);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(16, 102, 411, 90);
        contentPane.add(scrollPane);
        scrollPane.setViewportView(testQuestion);
        testQuestion.setEditable(false);
        testQuestion.setLineWrap(true);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(16, 206, 411, 135);
        contentPane.add(scrollPane_1);
        scrollPane_1.setViewportView(testChoices);
        testChoices.setEditable(false);
        testChoices.setLineWrap(true);
        
        JLabel lblAnswer = new JLabel("Answer");
        lblAnswer.setBounds(16, 352, 61, 16);
        contentPane.add(lblAnswer);
        testQuestionAnswer.setBounds(74, 358, 357, 39);
        testQuestionAnswer.setEditable(false);
        testQuestionAnswer.setLineWrap(true);
        contentPane.add(testQuestionAnswer);

    }
}
