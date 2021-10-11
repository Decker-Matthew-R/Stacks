//Import Java Utilities
import java.util.*;


public class PostfixEvalDecker 
{ 
	   private Stack<Integer> stack = new Stack();
	   private String expression = "";
	   
	   public static int calc(int operand1, int operand2, char op)
		{
			switch(op)
			{
				case '+': 
	            return operand1 + operand2;
				case '-': 
	            return operand1 - operand2;
				case '*': 
	            return operand1 * operand2;
	         case '^': 
	            return operand1 ^ operand2;
				default: 
	            return operand1 / operand2;
	        }
		}

	   public static int evalPostfix(String expression)
	   {
	      Stack<Integer> stack = new Stack();
	      for(int i=0; i < expression.length(); i++)
	      {
	         char c = expression.charAt(i);
	         
	         //Check if character is a number
	         if (Character.isDigit(c))
	            stack.push(c - '0');
	         else
	         {
	               int operand2 = stack.pop();
	               int operand1 = stack.pop();
	               stack.push(calc(operand1, operand2, c));

	            }
	       }
	         return stack.pop();

	    }
	    
	       
	    
	   public static void main (String [] args)
		{
	   
	      //StackYourname<Integer> test = new StackYourname<Integer>();      
	      PostfixEvalDecker test = new PostfixEvalDecker();

	      Scanner input = new Scanner(System.in);
			String exp;
	      int result;
			
			//Prompt User to enter input into a Stack a String of integers
		   System.out.print("Enter a string:  ");
	      exp = input.next();
	      result = test.evalPostfix(exp);
	      System.out.print("Result Value: ");
	      System.out.println(result);
	      
	     }

	}