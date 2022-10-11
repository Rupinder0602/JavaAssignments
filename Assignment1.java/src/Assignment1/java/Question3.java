package Assignment1.java;


	import java.util.*;
	public class Question3 {
		public static void main(String[] args) {
			System.out.println("*******Menu*******\r\n" + "1.Calculate Circumference of a Circle\r\n"
					+ "2.Calculate Area of Circle\r\n" + "3.Exit.\r\n");
			System.out.println("Enter the Radius :");
			Scanner rad = new Scanner(System.in);
			int radius = rad.nextInt();
			System.out.println("choose option");
			Scanner se = new Scanner(System.in);
			int in = se.nextInt();
			double pi=3.14;
	 
			switch (in) {
			case 1:
				double ab = (2 * pi * in);
				System.out.println("Circumferene of circle :" + ab);
				break;
			case 2:
			
				double a = (pi*in*in);
				System.out.println("Area of circle :" + a);
				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("The Option Entered is Inapproriate");
			}
		}
	}


