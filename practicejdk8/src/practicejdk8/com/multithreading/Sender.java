package practicejdk8.com.multithreading;

public class Sender {
	
	public void send(String msg) {
		System.out.println("Sending message "+msg);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("Thread Interruption.");
		}
		 System.out.println("\n" + msg + "Sent");
	}

}
