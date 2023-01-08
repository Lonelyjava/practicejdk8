package practicejdk8.com.multithreading;

public class MyThread3 extends Thread {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println("Thread Name :" + t.getName());

		t.setName("Kundan");
//		t.setDaemon(true);

		System.out.println("Thread Name :" + t.getName());

		System.out.println("Thread priority :" + t.getPriority());

		for (int i = 0; i <= 5; i++) {
			System.out.println("Main thread");
		}

		Thread t2 = new Thread() {

			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("Child thread");
				}
			}
		};

		System.out.println("child thread priority " + t2.getPriority());
		t2.setPriority(MAX_PRIORITY);
		System.out.println("child new thread priority " + t2.getPriority());
		t2.start();

	}
}
