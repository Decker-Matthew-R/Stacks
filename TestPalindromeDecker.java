//Import All Java Utilities
import java.util.*;

public class TestPalindromeDecker 
{
	public static void main (String[] args)
	{
		//Declare Variables
		Scanner input = new Scanner(System.in);
		String phrase1 = "";
		String flipPhrase = "";
		String answer;
			 
      
		//Builds the Menu
		System.out.println("---Welecome to the Palindrome Test Program---");
		System.out.println(" ");
		System.out.print("Please Enter A String: ");
		phrase1 = input.nextLine();
		System.out.println(" ");
		System.out.println("Input String: " + phrase1);
		phrase1 = phrase1.replaceAll("\\s","").toLowerCase();
		StackDecker newStack = new StackDecker();
			
		for (int i = 0; i < phrase1.length(); i++)
		{
			newStack.push(phrase1.charAt(i));
		}
		
		while (!newStack.isEmpty())
		{
         flipPhrase = flipPhrase + newStack.peek();
         newStack.pop();
		}
					
		   //Conditions for The Program
		   if (phrase1.equals(flipPhrase))
         {
            System.out.println("Judgement: Palindrome");
         }    
         else
         {
           System.out.println("Judgement: Not Palindrome");
         }
		  
		       
}
}

