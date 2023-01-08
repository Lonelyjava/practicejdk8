package practicejdk8.com.multithreading;

public class MyThread extends Thread {
	
	public void run(){
		
		
		try {
			for(int i=0;i<=8;i++) {
				System.out.println(" thread "+Thread.currentThread() +"--Id :"+Thread.currentThread().getId());
				Thread.sleep(500);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String arg[]) {
		
		
		MyThread myThread = new MyThread();
		myThread.start();
	}
	
	

}
