package Assignment6.java;

class MyClass {
	int counter;

	synchronized void increment() {
		counter++;
	}

	void workerOne() {
		increment();
	}

	void workerTwo() {
		increment();
	}
}

public class Question3_1 {
	public static void main(String[] args) {
		System.out.println("Thread starting: " + Thread.currentThread().getName());
		MyClass myClass = new MyClass();
		Thread threadOne = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1500; i++)
					myClass.workerOne();
			}
		});
		Thread threadTwo = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1500; i++)
					myClass.workerTwo();
			}
		});
		threadOne.start();
		threadTwo.start();
		try {
			threadOne.join();
			threadTwo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Counter: " + myClass.counter);
		System.out.println("Thread exiting: " + Thread.currentThread().getName());
	}
}
