package practicejdk8.com.multithreading;

public class MyThread1 implements Runnable{
	
	
	public void display() {
		System.out.println("display");
	}
	
	
	public static void main(String agr[]) {
		MyThread1 myThread1 = new MyThread1();
		
		Thread t1 = new Thread(myThread1);
		t1.start();
		myThread1.display();
	}


	@Override
	public void run() {
		System.out.println("executing thread ...");
		
	}

}
