package Collections;
import java.util.*;
	 
	public class special_stack {
		
	 
			Stack<Integer> s;
			Integer minEle;
	 
			
			special_stack() { s = new Stack<Integer>(); }
	 
	 
			void getMin()
			{
				
				if (s.isEmpty())
					System.out.println("Stack is empty");
	 
			
					System.out.println("Minimum Element in the " +
									" stack is: " + minEle);
			}
	 
			
			void peek()
			{
				if (s.isEmpty())
				{
					System.out.println("Stack is empty ");
					return;
				}
	 
				Integer t = s.peek(); 
	 
				System.out.print("Top Most Element is: ");
	 
				
				if (t < minEle)
					System.out.println(minEle);
				else
					System.out.println(t);
			}
	 
			
			void pop()
			{
				if (s.isEmpty())
				{
					System.out.println("Stack is empty");
					return;
				}
	 
				System.out.print("Top Most Element Removed: ");
				Integer t = s.pop();
	 
				
				if (t < minEle)
				{
					System.out.println(minEle);
					minEle = 2*minEle - t;
				}
	 
				else
					System.out.println(t);
			}
	 
	 
			void push(Integer x)
			{
				if (s.isEmpty())
				{
					minEle = x;
					s.push(x);
					System.out.println("Number Inserted: " + x);
					return;
				}
	 
				// If new number is less than original minEle
				if (x < minEle)
				{
					s.push(2*x - minEle);
					minEle = x;
				}
	 
				else
					s.push(x);
	 
				System.out.println("Number Inserted: " + x);
			}
		};
	 
	 

	 


