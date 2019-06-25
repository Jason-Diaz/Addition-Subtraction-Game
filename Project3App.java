package proj3;

import javax.swing.JOptionPane;

/**
 * <p>Title: The Project3 Application class</p>
 *
 * <p>Description: This class tests the various methods in the Question class to see what is returned and
 * determine if the methods work properly. It also generates 15 question and displays if the user has
 * inputed the correct answer, along with the total of correct and incorrect at the end. </p>
 *
 * @author Jason Diaz
 */

public class Project3App {

	public static void main(String[] args)
	{
		int addCorrect = 0;
		int addIncorrect = 0;
		int subCorrect = 0;
		int subIncorrect = 0;

		//This loop creates 15 question. There is two condition, one for addition, the other for subtraction.
		//I did this to store how many questions the user got for each. I used the getOperator method to know
		//whether it is addition or subtraction. If the person gets the question correct the Correct variable
		//gets added by 1, if not the Incorrect variable does.
		
		for(int i = 1; i <=15; i++)
		{	
			Question ques = new Question();
			String ans = new String();

			ans = JOptionPane.showInputDialog("What is the result?" + "\n" + ques.toString());

			if(ques.getOperator() == 0)
			{
				if(Integer.parseInt(ans) == ques.determineAnswer())
				{
					JOptionPane.showMessageDialog(null,"Congratulations, you got it correct!");
					addCorrect++;
				}
				else
				{ 
					JOptionPane.showMessageDialog(null,"The correct answer for" + "\n" + ques.toString() + "\n" + "is" +
							"\n" + ques.determineAnswer());
					addIncorrect++;
				}
			}
			else
			{
				if(Integer.parseInt(ans) == ques.determineAnswer())
				{
					JOptionPane.showMessageDialog(null,"Congratulations, you got it correct!");
					subCorrect++;
				}
				else
				{ 
					JOptionPane.showMessageDialog(null,"The correct answer for" + "\n" + ques.toString() + "\n" + "is" +
							"\n" + ques.determineAnswer());
					subIncorrect++;
				}
			}

		} 
		
		//This is where the calculation are done to find out the percentage of correct answers.
		int add = addCorrect + subCorrect;
		double divide = 1.0 * add / 15; 
		double percent = divide * 100;

		//This is the display of how many correct and incorrect addition and subtraction problems, and the percentage.
		JOptionPane.showMessageDialog(null, "Addition:" + "\n" + "You got " + addCorrect + " correct and " + addIncorrect +
				" incorrect " + "\n" + "Subtraction:" + "\n" + "You got " + subCorrect + " correct and " + subIncorrect + " incorrect" +
				"\n" + "The percent correct is " + percent );
	}

}