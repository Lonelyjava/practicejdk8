package practicejdk8.com.multithreading;

public class SyncDemo {

	public static void main(String args[]) {
		Sender send = new Sender();
		ThreadedSend S1 = new ThreadedSend(" Hi ", send);
		ThreadedSend S2 = new ThreadedSend(" Bye ", send);

		// Start two threads of ThreadedSend type
		S1.start();
		S2.start();

		// wait for threads to end
		try {
			S1.join();
			S2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
