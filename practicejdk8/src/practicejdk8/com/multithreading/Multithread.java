package practicejdk8.com.multithreading;

public class Multithread {

	private int i = 0;

	public void increment() {
		i++;
	}

	public int getValue() {
		return i;
	}

	public static void main(String[] args) {
		Multithread t = new Multithread();
		t.increment();
		System.out.println(t.getValue());
	}

}
