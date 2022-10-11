package Assignment1.java;

import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		System.out.println("Enter the text");
		Scanner s1= new Scanner(System.in);
		String ans ="";	
		while(true) {
			String S=s1.next();
			if(S.equals("XDONE")) {
				break;
			}else {
			ans=ans+" "+S;
			}	
	}
		System.out.println(ans);
}
}
