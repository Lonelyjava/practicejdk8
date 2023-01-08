package practicejdk8.com.dataStructure;

import java.util.Scanner;

@Demo(name = "kundan")
public class FabonacciSeriesJava {

	public static void main(String[] args) {

		System.out.println("Enter First Number.");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter Second Number.");
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		// min(x,y);
		int n = x;
		int a = 0;
		int b = 1;
		System.out.println(" \n");
		System.out.println("Fabonnci Series :");
		System.out.print(a + " " + b + " ");
		int count = 0;
		for (int i = 0; i <= n; i++) {
			int nextNumber = a + b;
			System.out.print(" " + nextNumber);
			a = b;
			b = nextNumber;
			count++;
		}
		System.out.println("\n\ncount -:" + count);
	}

}
