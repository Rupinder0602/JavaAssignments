package Assignment1.java;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name = ");
		String Firstname = sc.next();
		System.out.println("Enter your last name =");
		String LastName = sc.next();
		System.out.println("enter your age=");
		String age = sc.next();
		System.out.print(Firstname + " " + LastName + " \n" + "Age: " + age);
	}
}
