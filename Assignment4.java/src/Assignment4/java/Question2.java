package Assignment4.java;


public class Question2 {
	static void staticmultiplymethod() {
	int a=4;
	int b=5 ;
	int m=a*b;
	System.out.println("multiplication:"+m) ;
	}
	void instancemethod(){
	int a=5;
	int b=4;
	int add=a+b;
	int sub=a-b;
	System.out.println("Adding:"+add);
	System.out.println("Subtract:"+sub);
	}
	public static void main(String[] args)
	{
	MethodReferenceInterface staticobj= new Question2():: instancemethod;
	staticobj.display();
	MethodReferenceInterface refernce= Question2::staticmultiplymethod;
	refernce.display();
	}
	}
	interface MethodReferenceInterface{
	void display();
	}
	


