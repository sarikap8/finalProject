package finalProject;
//ill fix this tonight
public class playerStats extends linkedListUI
{
 private Stack mystack;
 private int players = 10;
 private String name; 
 private String goals; 
 private String fouls; 
 public playerStats()
 {
	 mystack = new Stack();
 }
 /**
  * Creates a series of user defined objects and populates on Stack,
  * any type of object can be used,
  * stack pushes and operations are displayed to console
 * @return 
  */
 @Override 
 public String toString() {
	//this.players = linkedListUI.numberofplayers.getText(); 
	 this.name = linkedListUI.player_name.getText(); 
	 this.goals = linkedListUI.goals_scored.getText(); 
	 this.fouls = linkedListUI.fouls_committed.getText(); 
		this.name = "sdf";
		this.goals = "10";
		this.fouls = "10";
	 String str = name + " " + goals + " " + fouls; 
	 return str; 
	  
 }
 public String addPlayer()
 {
	 	// pushing data to stack with console output
	 	for (int i = 0; i <= players; i++)
		{
			mystack.push(
					new String( this.toString())
					);  
ConsoleMethods.println("The following player will be added, current roster " + mystack.getObject() + " " + mystack);
		}
	 	String str = "The following player will be added, current roster " + mystack.getObject() + " " + mystack ;
		return str;
 }
 public void firePlayer()
 {
	 	// popping data off stack with console output
	 	for (int i = 0; i <= players; i++)
	 	{
			 ConsoleMethods.println("The following player will be removed, current roster " + mystack.pop() + " " + mystack);						
	 	}
 }
 public void showPlayer()
 {
  ConsoleMethods.println("Recent scouted players followed by goals and fouls " + mystack.getObject());
  ConsoleMethods.println("Full roster followed by goals and fouls " + mystack);
 }
 /**
  * Demonstrates the use of the LinkedList used as Stack.
  *
  * @param args The command line arguments (not used)
  */
 public static void main(String[] args)
 {
  playerStats stack = new playerStats();
  stack.addPlayer();
  stack.showPlayer();
  stack.firePlayer();
 }
}