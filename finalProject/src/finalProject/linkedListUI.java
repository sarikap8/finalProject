package finalProject;
/**
 * UI for link list
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
public class linkedListUI extends MenuControl {
//ill try and commit L
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected static JTextField player_name;
	private JTextArea recordbook;
	private JLabel lblEncouragingMessage;
	private JScrollPane scrollPane;
	protected static JTextField goals_scored;
	protected static JTextField fouls_committed;
	protected static JTextField numberofplayers;
	public linkedListUI() {
		// ArrayListCode sol = new ArrayListCode();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblPlayerName = new JLabel("Enter player name");
		lblPlayerName.setBounds(6, 0, 121, 26);
		contentPane.add(lblPlayerName);
		player_name = new JTextField();
		player_name.setBounds(6, 59, 121, 26);
		contentPane.add(player_name);
		player_name.setColumns(10);
		numberofplayers = new JTextField();
		numberofplayers.setBounds(6, 21, 121, 26);
		contentPane.add(numberofplayers);
		numberofplayers.setColumns(10);
		JButton btnAddPlayer = new JButton("Add");
		btnAddPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerStats stack = new playerStats();
stack.addPlayer();
				//recordbook.setText(stack.addPlayer());
					//	playerStats.addPlayer()
						//ArrayListCode.labSolution(Integer.parseInt(player_name.getText()))
						//);
			}
		});
		btnAddPlayer.setBounds(61, 49, 145, 29);
		contentPane.add(btnAddPlayer);
		lblEncouragingMessage = new JLabel("READY SET SCOREEEEEE");
		lblEncouragingMessage.setBounds(137, 234, 162, 16);
		contentPane.add(lblEncouragingMessage);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 90, 402, 132);
		contentPane.add(scrollPane);
								recordbook = new JTextArea();
								scrollPane.setViewportView(recordbook);
								recordbook.setWrapStyleWord(true);
								recordbook.setBackground(Color.WHITE);
								recordbook.setLineWrap(true);
								recordbook.setToolTipText("");
								recordbook.setEditable(false);
								recordbook.setColumns(10);
								goals_scored = new JTextField();
								goals_scored.setColumns(10);
								goals_scored.setBounds(139, 21, 121, 26);
								contentPane.add(goals_scored);
								JLabel lblEnterGoalsScored = new JLabel("Enter goals scored");
								lblEnterGoalsScored.setBounds(139, 0, 121, 26);
								contentPane.add(lblEnterGoalsScored);
								fouls_committed = new JTextField();
								fouls_committed.setColumns(10);
								fouls_committed.setBounds(273, 21, 121, 26);
								contentPane.add(fouls_committed);
								JLabel lblEnterFoulsCommitted = new JLabel("Enter fouls committed");
								lblEnterFoulsCommitted.setBounds(273, 0, 145, 26);
								contentPane.add(lblEnterFoulsCommitted);
								JButton btnRemove = new JButton("Remove");
								btnRemove.setBounds(211, 49, 145, 29);
								contentPane.add(btnRemove);
	}
}


