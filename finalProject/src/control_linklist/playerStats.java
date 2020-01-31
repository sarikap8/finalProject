package control_linklist;

import model_linklist.Stack;
import view.linkedListUI;

public class playerStats {
	private Stack mystack;
	private int playercount = 0;
	private String name;
	private String goals;
	private String fouls;

	public playerStats() {
		mystack = new Stack();
	}

	@Override
	public String toString() {
		this.playercount = playercount;
		this.name = view.linkedListUI.player_name.getText();
		this.goals = view.linkedListUI.goals_scored.getText();
		this.fouls = view.linkedListUI.fouls_committed.getText();
		String str = "\n name: " + name + "\n goals scored: " + goals + "\n fouls committed: " + fouls;
		return str;

	}

	public String addPlayer() {

		// pushing data to stack with console output
		playercount = playercount + 1;
		mystack.push(new String(this.toString()));
		String str = "The following player will be added their stats are: " + mystack.getObject() + "\n"
				+ "total player count is " + playercount;
		return str;
	}

	public String firePlayer() {
		// popping data off stack with console output
		playercount = playercount - 1;
		String str = "The following player will be removed their stats were:  " + mystack.pop() + "\n "
				+ "total player count is " + playercount;
		return str;
	}

	public String showPlayer() {
		playercount = playercount;
		String str = "Full roster followed by goals and fouls " + mystack + " total player count is " + playercount;
		return str;
	}

	//added main
	public static void main(String[] args) {
		linkedListUI frame = new linkedListUI();
		frame.setVisible(true);
	}
}