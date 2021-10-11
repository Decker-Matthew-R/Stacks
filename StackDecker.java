//Imports all Java Utilities
import java.util.*;

public class StackDecker <E> 
{ 
      private LinkedList<E> newStack = new LinkedList<E>();
      private Node head = null;
      private Node tail = null;
      private int size;
            
   public class Node <E>
		{
			E data;
			Node next;
			//Node constructor
			public Node(E element) 
			{ 
				data = element;
				next = null;
			}
			//Node toString method to print Node element
			public String toString() 
			{ 
				return String.valueOf(this.data);
			}
		}
         
   public E push (E element)
   {
      Node<E> newNode = new Node<E>(element);
      if (head == null)
    {
         head = newNode;
         tail = newNode;
     }
     else
     {
         tail.next = newNode;
        
         tail = tail.next;
     }
     size++;
     return (E) tail;
    }
      
     public boolean isEmpty()
     {
         
     return (size == 0);
     	
     }
     
     public int size()
     {
          return size;
      }
      
     public E pop()
     {
         if (size == 0)
         {
            System.out.println("Stack is Empty");
				return null;
         }
         if (size == 1)
         {
            head = tail = null;
            size = 0;
          }
          else
          {
            Node current = head; 
            for(int i = 0; i < size-2; i++)
               current = current.next;
            current.next = null; 
            tail = current;
            size--;                          
			  }
           return (E) tail;      }
     
     public E peek()
     {
    	 if (tail == null)
    	 {
    		 System.out.println("Stack is Empty");
    		 	return null;
    	 }
         return (E)tail.data;
     }
     
    public String toString() {
			Node temp = head;
			if(temp==null)
				return "[]";
			String str = "[";
			while(temp.next != null) {
				str = str + temp.data + ", ";
				temp = temp.next;
			}
			str = str + temp.data;
			
			return str + "]";
		}
     
     
}

	
	
	
	
	
	

