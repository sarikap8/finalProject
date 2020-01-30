package finalProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class playerStats extends MenuControl
{

private static final long serialVersionUID = 1L;
private JPanel contentPane;
protected static JTextField player_name;
private JTextArea recordbook;
private JLabel lblEncouragingMessage;
private JScrollPane scrollPane;
protected static JTextField goals_scored;
protected static JTextField fouls_committed;
  private Stack mystack;
  //private int players = 10;
  private String name; 
  private String goals; 
  private String fouls; 

  public playerStats()
  {
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		player_name.setBounds(6, 21, 121, 26);
		contentPane.add(player_name);
		player_name.setColumns(10);

		JButton btnAddPlayer = new JButton("Add");
		btnAddPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//playerStats.player_name 
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
	  mystack = new Stack();
  }

  /**
   *  Creates a series of user defined objects and populates on Stack,
   *  any type of object can be used,
   *  stack pushes and operations are displayed to console
 * @return 
   */
  @Override 
  public String toString() {
	
	  this.name = player_name.getText(); 
	  this.goals = goals_scored.getText(); 
	  this.fouls = fouls_committed.getText(); 
	  String str = name + " " + goals + " " + fouls; 
	  return str;
	  
	  
  }
 
  public void addPlayer()
  {

	  	// pushing data to stack with console output

			mystack.push(
					new String( this.toString())
					);  
			String str = "The following player will be added, current roster " + mystack.getObject() + " " + mystack ;
ConsoleMethods.println("The following player will be added, current roster " + mystack.getObject() + " " + mystack);
		}


  public void firePlayer()
  {
	  	// popping data off stack with console output

			 ConsoleMethods.println("The following player will be removed, current roster " + mystack.pop() + " " + mystack);						
  }

  public void showPlayer()
  {
    ConsoleMethods.println("Recent scouted players followed by goals and fouls " + mystack.getObject());
    ConsoleMethods.println("Full roster followed by goals and fouls " + mystack);
  }

  /**
   *  Demonstrates the use of the LinkedList used as Stack.
   *
   * @param  args  The command line arguments (not used)
   */
  public static void main(String[] args)
  {
	  EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playerStats frame = new playerStats();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    playerStats stack = new playerStats();

    stack.addPlayer();
    stack.showPlayer();
    stack.firePlayer();
  }
}