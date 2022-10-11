package Assignment4.java;

public class Question1_3 {
	
			public static void main(String[] args) {
			Myinterface2 myinterface2=(s1, s2)-> s1+s2;
			System.out.println(myinterface2.concat("Rupinder'","Dhiman"));
			}
			interface Myinterface2{
			String concat (String s1,String s2);
			}
	}

