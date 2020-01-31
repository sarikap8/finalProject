package model_arraylist;

import java.util.Random;

import control.ConsoleMethods;
import model_apexam.Question;

/**
 * Class which generates a few static questions about ArrayLists along with a
 * random feature to ask questions about arraylists using random numbers. Added support of static randomization of answer choices, hopefully this will be implemented in a separate method right now. 
 * 
 * @author Sarika Pasumarthy, Sonia Keval
 * @version 2.0
 * @date 6 December 2019
 * 
 *
 */

public class ArrayListTBQ extends Question {

	public ArrayListTBQ() {
		super.setupQuestion();
	}

	public static String mainTest() {
		Question q = new ArrayListTBQ();
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
		
		int test = rand.nextInt(8);
		int switchcase = rand.nextInt(4);
		// format question
		if (test == 0) {
			this.question = "Which index is the last element in a list called nums at?";
			if (switchcase == 0) {
				this.choiceA = "nums.length";
				this.choiceB = "nums.length - 1";
				this.choiceC = "nums.size()";
				this.choiceD = "nums.size() - 1";
				this.choiceE = "None of the above";
				answer = this.choiceD;
			} else if (switchcase == 1) {
				this.choiceA = "nums.length - 1;";
				this.choiceB = "nums.size()";
				this.choiceC = "nums.length";
				this.choiceD = "None of the above";
				this.choiceE = "nums.size() - 1";
				answer = this.choiceE;
			}

			else if (switchcase == 2) {
				this.choiceA = "nums.size();";
				this.choiceB = "nums.size()-1";
				this.choiceC = "nums.length -1";
				this.choiceD = "nums.length";
				this.choiceE = "None of the above";
				answer = this.choiceB;
			} else if (switchcase == 3) {
				this.choiceA = "nums.size() -1;";
				this.choiceB = "None of the above;";
				this.choiceC = "nums.size();";
				this.choiceD = "nums.length -1";
				this.choiceE = "nums.length";
			}
		}

		else if (test == 1) {
			if (switchcase == 0) {
				this.question = "Which of the following is a reason to use an array instead of an ArrayList?";
				this.choiceA = "An array has faster access to its elements than a list does.";
				this.choiceB = "An array knows its length, but a list doesn't know its length.";
				this.choiceC = "An ArrayList can allocate more space than it needs.";
				this.choiceD = "All of the above";
				this.choiceE = "None of the above";
				answer = this.choiceC;
			} else if (switchcase == 1) {
				this.question = "Which of the following is a reason to use an array instead of an ArrayList?";
				this.choiceA = "An array knows its length, but a list doesn't know its length.";
				this.choiceB = "An ArrayList can allocate more space than it needs.";
				this.choiceC = "All of the above";
				this.choiceD = "None of the above";
				this.choiceE = "An array has faster access to its elements than a list does.";
				answer = this.choiceB;
			} else if (switchcase == 2) {
				this.question = "Which of the following is a reason to use an array instead of an ArrayList?";
				this.choiceA = "An ArrayList can allocate more space than it needs.";
				this.choiceB = "An array knows its length, but a list doesn't know its length.";
				this.choiceC = "An array has faster access to its elements than a list does.";
				this.choiceD = "All of the above";
				this.choiceE = "None of the above";
				answer = this.choiceA;
			} else if (switchcase == 3) {
				this.question = "Which of the following is a reason to use an array instead of an ArrayList?";
				this.choiceA = "An ArrayList can allocate more space than it needs.";
				this.choiceB = "An array knows its length, but a list doesn't know its length.";
				this.choiceC = "An array has faster access to its elements than a list does.";
				this.choiceD = "All of the above";
				this.choiceE = "None of the above";
				answer = this.choiceA;
			}

		}

		else if (test == 2) {

			if (switchcase == 0) {
				this.question = "Which of the following is a reason to use an ArrayList instead of an array";
				this.choiceA = "An ArrayList can grow or shrink as needed, while an array is always the same size.";
				this.choiceB = "You can use a for-each loop on an ArrayList, but not in an array.";
				this.choiceC = "You can store objects in an ArrayList, but not in an array.";
				this.choiceD = "All of the above";
				this.choiceE = "None of the above";
				answer = this.choiceA;
			}

			if (switchcase == 1) {
				String temp = this.choiceA;
				this.choiceA = this.choiceB;
				this.choiceB = temp;
			}
			if (switchcase == 2) {
				String temp = this.choiceC;
				this.choiceC = this.choiceD; 
				this.choiceD = temp; 
			}
		} else if (test == 3)

		{
			this.question = "Which of the following is the correct way to get the frist value in a list called nums?";
			this.choiceA = "nums[0]";
			this.choiceB = "nums[1]";
			this.choiceC = "nums.first()";
			this.choiceD = "nums.get(0)";
			this.choiceE = "nums.get(1)";
			answer = this.choiceD;

		} else if (test == 4) {
			this.question = "Which of the following is the correct way to set the second value in a list called nums to 5?";
			this.choiceA = "nums[1] = 5;";
			this.choiceB = "nums[2] = 5;";
			this.choiceC = "nums.set(5,1);";
			this.choiceD = "nums.set(1,5);";
			this.choiceE = "nums.set(2,5);";
			answer = this.choiceD;
		} 

		else if (test == 5) {
			this.question = "Consider the following code segment.\n"
					+ "ArrayList<String> list 5 new ArrayList<String>();\n"
					+ "list.add(\"P\"); list.add(\"Q\"); list.add(\"R\"); list.set(2, \"s\"); list.add(2, \"T\"); list.add(\"u\"); System.out.println(list);\n"
					+ "What is printed as a result of executing the code segment?";
			this.choiceA = "[P, Q, R, s, T]";
			this.choiceB = "[P, Q, s, T, u]";
			this.choiceC = "[P, Q, T, s, u]";
			this.choiceD = "[P, T, Q, s, u]";
			this.choiceE = "[P, T, s, R, u]";
			answer = this.choiceC;

		} else if (test == 6) {
			this.question = "List<Integer> list1 = new ArrayList<Integer>();\n" + "list1.add(new Integer(1));\n"
					+ "list1.add(new Integer(2));\n" + "list1.add(new Integer(3));\n"
					+ "list1.set(2, new Integer(4));\n" + "list1.add(2, new Integer(5));\n"
					+ "list1.add(new Integer(6));\n" + "System.out.println(list1);";
			this.choiceA = "[1,2,3,4,5]";
			this.choiceB = "[1,2,4,5,6]";
			this.choiceC = "[1,2,5,4,6]";
			this.choiceD = "[1,5,2,4,6]";
			this.choiceE = "None of the above";
			answer = this.choiceC;

		} else if (test == 7) {
			this.question = "List<Integer> aList = new ArrayList<Integer>();\n" + "aList.add(new Integer(1));\n"
					+ "aList.add(new Integer(2));\n" + "aList.add(1, new Integer(5));\n"
					+ "aList.set(1, new Integer(4));\n" + "aList.add(new Integer(6));\n"
					+ "aList.add(new Integer(3));\n" + "System.out.println(list);";
			this.choiceA = "[1,2,5,4,6,3]";
			this.choiceB = "[6,5,4,3,2,1]";
			this.choiceC = "[1,2,3,4,5,6]";
			this.choiceD = "[1,4,2,6,3]";
			this.choiceE = "[1,2,4,6,3]";
			answer = this.choiceD;

		} else if (test == 8) {
			this.question = "What is in the list nums if it initially contained {5, 3, 1} and the following code is executed?";
			this.choiceA = "[5,3,1,6]";
			this.choiceB = "[4,3,1,6]";
			this.choiceC = "[4,3,6]";
			this.choiceD = "[5,3,6]";
			this.choiceE = "[4,5,3,6]";
			answer = this.choiceB;

		}
	}
}

