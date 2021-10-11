//Import Java Utilities
import java.util.*;

public class TestStackDecker
{
	public static void main (String [] args)
	{
	
		Scanner input = new Scanner(System.in);
		int answer;
		int value;
		int size;
		int placeholder;
		
		//Prompt User to enter input into array and store array value
		StackDecker<Integer> newStack =  new StackDecker<Integer>();

do
{
	do
	{	
		//Builds the Menu and responses to prompts
		System.out.println("------Main Menu------");
		   System.out.println("0 - Exit Program");
		   System.out.println("1 - Push: ");
		   System.out.println("2 - Pop: ");
		   System.out.println("3 - Peek(Top): ");
		   System.out.println("4 - Size: ");
		   System.out.println("5 - Is Empty: ");
		   System.out.println("6 - Print Stack: ");
		   
		   System.out.println("");
		   System.out.print("Select Option: ");
		   answer = input.nextInt();
		   System.out.println("");
		
		   //If statement for user input of 0
		//if (answer == 0)
    //{
       //System.out.println("Program Terminated");
      // break;
    //}
    
    //if statement for user input of 1
    if (answer == 1)
		{
       System.out.print("Enter value to push onto stack: ");
			placeholder = input.nextInt();
			System.out.println(" ");
			
       System.out.println ("Test Method push() ");
		   System.out.println("Lis Content before adding value: " + newStack.toString() );
			newStack.push(placeholder);
			System.out.println("List content after adding value: " + newStack.toString());
			System.out.println(" ");
		}
		
		//If statement for user input of 2
		if (answer == 2)
		{
			System.out.println("Test Method pop()");
			System.out.println("List Content Before Calling pop() Method: " + newStack.toString());
			System.out.println("Top Element in the Stack: " + newStack.pop());	
       System.out.println("List Content After Calling pop() Method: " + newStack.toString());	
		}
		
		//If Statement for user input of 3
		if (answer == 3)
		{
			System.out.println("Test Method peek()");
			System.out.println("List Content Before Calling peek() Method: " + newStack.toString());
			System.out.println("Peek Value:  " + newStack.peek());
			
		}
		
		//If statement for user input of 4
		if (answer == 4)
		{
			size = newStack.size();
       if (size > 0)
			{
			   System.out.println("Test Method size()");
			   System.out.println("The Size of the Stack is: " + newStack.size());
       }
			else if (size == 0)
			{
				System.out.println("The Size of the Stack is: " + size);
				System.out.println("The Current Stack is Empty!");
				System.out.println(" ");
			}
	    }
	
		//If statement for user input of 5
		if (answer == 5)
		{
			System.out.println("Test Method isEmpty()");
			System.out.println("Stack Content Before Before Calling isEmpty Method: "+ newStack.toString());
       System.out.println("The Stack is Empty:  " + newStack.isEmpty());
			System.out.println("Stack Content After Calling isEmpty Method: " + newStack.toString());
		}
		
		//If statement for user input of 68
   
		if (answer == 6)
		{	
			System.out.println("Test toString() Method");
			System.out.println("Stack Content: " + newStack.toString());
		}
		
				
		//Prompt User to Continue to Run the Program
       System.out.println("");
		   System.out.print("Enter 1 to run the program again or 0 to quit:  ");
		   answer = input.nextInt();
	      System.out.println(" ");
	}
 
		while (answer != 0);
    
}
while (answer != 0);
		{
			System.out.println("");
		   System.out.println("Program Terminated");
	   }
	


}
}