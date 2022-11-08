package Collections;

public class main_special_stack {
	 
	 
	public static void main(String[] args)
	{
		special_stack s = new special_stack();
		s.push(3);
		s.push(5);
		s.getMin();
		s.push(2);
		s.push(1);
		s.getMin();
		s.pop();
		s.getMin();
		s.pop();
		s.peek();
	}
}


