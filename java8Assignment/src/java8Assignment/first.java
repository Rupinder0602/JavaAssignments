package java8Assignment;

public class first {
	public static void main(String[] args) {
	Myinterface myinterface=(x,y,xy)-> x>y;
	System.out.println("First number is 10");
	System.out.println("Second number is 5");
	System.out.println("First number is greater than Second number: "+myinterface.display(10,5, true)+"\n");
	System.out.println("First number is 3");
	System.out.println("Second numbernis 7");
	
	System.out.println("First number is greater than Second number: "+myinterface.display (3,7, true));
	}
	interface Myinterface{
	boolean display(int x,int y, boolean xy);
	}
}

