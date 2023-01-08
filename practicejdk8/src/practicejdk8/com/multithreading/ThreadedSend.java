package practicejdk8.com.multithreading;

public class ThreadedSend  extends Thread{

	private String msg;
	private Sender  sender;
	public ThreadedSend(String msg, Sender sender) {
		super();
		this.msg = msg;
		this.sender = sender;
	}
	
	 public void run()
	    {
	        // Only one thread can send a message
	        // at a time.
	        synchronized(sender)
	        {
	            // synchronizing the send object
	            sender.send(msg);
	        }
	    }
}
