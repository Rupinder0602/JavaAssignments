package java8Assignment;

public class fifth {
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
	MethodReferenceInterface staticobj= new fifth():: instancemethod;
	staticobj.display();
	MethodReferenceInterface refernce= fifth::staticmultiplymethod;
	refernce.display();
	}
	}
	interface MethodReferenceInterface{
	void display();
	}
	
