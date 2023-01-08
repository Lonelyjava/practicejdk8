package practicejdk8.com.multithreading;

public class MyThreadDeadlock {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Deadlock");
			Thread.currentThread().join();
			System.out.println("This statement will never execute");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
