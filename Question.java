package proj3;

/**
 * <p>Title: The Question class</p>
 *
 * <p>Description: This class will create a simple mathematical equation that can be
 * used in a math game. The equation can add or subtract two values. If the program 
 * generates a subtraction question, it must ensure that the first value is greater than or
 * equal to the second so the answer is not a negative number. </p>
 *
 * @author Jason Diaz
 */

public class Question 
{
	private int num1;
	private int num2;
	private int operator;

	/**
	 * Question constructor-- 
	 * gets called to give a Question object an operator (a 0 for addition, or a 1 for subtraction),
	 * and two numbers with the appropriate limits according to the operator
	 */
	public Question()
	{
		operator = (int)(Math.random() * 2);

		if(operator == 0)
		{
			num1 = (int)(Math.random() * 13);
			num2 = (int)(Math.random() * 13);
		}
		else
		{
			num1 = (int)(Math.random() * 7 + 6);
			num2 = (int)(Math.random() * (num1 + 1));
		}
	}

	/**
	 * determineAnswer method -- calculates the answer to the question
	 * @return the answer
	 */
	public int determineAnswer()
	{
		int ans;
		if(operator == 0)
		{
			ans = num1 + num2;
			return ans;
		}
		else
		{
			ans = num1 - num2;
			return ans;
		}
	}

	/**
	 * toString method -- returns a String containing the question
	 * @return a number, a space, the operator, a space, a number, a space and an equal sign
	 */
	public String toString()
	{
		if(operator == 0)
			return num1 + " + " + num2;

		else
			return num1 + " - " + num2;
	}
	public int getOperator()
	{
		if(operator == 0)
			return 0;
		else
			return 1;
	}
}
