package finalProject;

import java.util.ArrayList;
import java.util.Random;


public class ArrayListRandom extends Question {

	public ArrayListRandom() {
		super.setupQuestion();
	}

	public static String mainTest() {
		Question q = new ArrayListRandom();
		q.askQuestionConsole();
		return q.getCounterMsg();
	}

	/*public String[] switchAnswers(String optionA, String optionB) {
		String temp = optionA;
		optionA = optionB;
		optionB = temp;
		String[] ew = { optionA, optionB };
		return ew;
	}*/

	@Override
	protected void setupQuestionData() {
        ConsoleMethods.println("ArrayList class setupQuestionData method");
		Random rand = new Random();
		ArrayList<Integer> randomArrayList = new ArrayList(); 
		for (int i = 0; i < rand.nextInt(); i++) {
			int ugh = rand.nextInt(); 
			randomArrayList.add(ugh);  
		} 
		int selectionIndex = rand.nextInt();
		if (selectionIndex > 0) {
		this.question = "Which of the following is the correct way to remove the value at location " + selectionIndex + " from an ArrayList below?"; 
		this.choiceA = "nums.remove(" + selectionIndex + ")";
		this.choiceB = "nums.remove(1);";
		this.choiceC = "nums.remove(2);";
		this.choiceD = "nums.remove(3);";
		this.choiceE = "We don't know until we see the arraylist";

			answer = this.choiceE;
			this.answerKey = this.charE; 
		}
		if (selectionIndex < 0) {
		this.question = "Which of the following is the correct way to add the value at location " + selectionIndex + " from an ArrayList below?"; 
		this.choiceA = "nums.add(" + selectionIndex + ")";
		this.choiceB = "nums.add(1);";
		this.choiceC = "nums.add(2);";
		this.choiceD = "nums.add(3);";
		this.choiceE = "We don't know until we see the arraylist";

			answer = this.choiceE;
			this.answerKey = this.charE; 
		}


	}
}

