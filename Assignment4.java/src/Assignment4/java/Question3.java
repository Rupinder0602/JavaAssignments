package Assignment4.java;

public class Question3 {
	public static void main(String[] args) {
		Runnable run = ()->{
		for (int i=1; i<=10; i++)
		System.out.println("Thread by Lambda " + i);
		};
		Thread th = new Thread(run);
		th. start();
		
}
}
