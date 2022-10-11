package Assignment4.java;


public class Question5  implements child1, child2 {
		public static void main(String[] args) {
			Question5  mult=new Question5 ();
		mult.display();
		}
		@Override
		public void display() {
		child1. super.display();
		child2. super.display();
		System.out.println( "Default method");
		}
		}
		interface inter1{
		default void display(){
		System.out.println("First interface");
		}
		}
		interface child1 extends inter1{
		default void display(){
		System.out.println("First child");
		}
		}
		interface child2 extends inter1{
		default void display() {
		System.out.println("Second child") ;
		}
		}

