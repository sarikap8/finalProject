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

	public String[] switchAnswers(String optionA, String optionB) {
		String temp = optionA;
		optionA = optionB;
		optionB = temp;
		String[] ew = { optionA, optionB };
		return ew;
	}

	@Override
	protected void setupQuestionData() {
        ConsoleMethods.println("ArrayList class setupQuestionData method");

		Random rand = new Random();
		ArrayList<Integer> randomArrayList = new ArrayList(); 
		for (int i = 0; i < rand.nextInt(); i++) {
			int ugh = rand.nextInt(); 
			randomArrayList.add(ugh);  
		} 
		int test = rand.nextInt(2);
		this.question = "Which of the following is the correct way to remove the value " + test
				+ " from the list below? \n nums = [0,1,2,3,4,5,6]";
		//int switchcase = rand.nextInt(4);
		// format question
			/*this.question = "Which of the following is the correct way to remove the value " + test
					+ " from the list below? \n nums = [0,1,2,3,4,5,6]";
			this.choiceA = "nums.remove(5);";
			this.choiceB = "nums.remove(0);";
			this.choiceC = "nums.remove(1);";
			this.choiceD = "nums.remove(2);";
			this.choiceE = "None of the above";
			if (test == 0) {
				answer = this.choiceB;
			}
			if (test == 1) {
				answer = this.choiceC;
			}
			if (test == 2) {
				answer = this.choiceD;

			}*/
	}
}

