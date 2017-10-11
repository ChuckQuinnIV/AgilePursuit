package questions;

import java.util.Scanner;

public class QuestionTest {

	public static void main(String[] args) {

		QuestionStack qStack = QuestionStack.getInstance();

		while (qStack.size() >= 0){
			Question q1 = QuestionStack.getInstance().pop();

			System.out.println(q1.getQuestion());
			int i = 0;
			for (String c : q1.getChocies() ){
				System.out.println(i + ": " +c);
				i++;
			}

			System.out.print("Enter Guess: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			String answer = q1.getChocies()[a];

			if (q1.check(answer)){
				System.out.println("[Correct] - YOU GOT IT RIGHT!!!");
			} else{ 
				System.out.println();
				System.out.println("[WRONG] - The correct answer is: " + q1.getAnswer());
			}
		}







	}

}
