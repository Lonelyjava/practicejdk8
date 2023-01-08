package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop19 {

	public static void main(String[] args) {

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while (row <= n) {

			int space = n - row;
			while (space!=0) {
				System.out.print(" ");
				space = space - 1;
			}
			int col = 1;
			while (col <= row) {
				System.out.print("*");
				col = col + 1;

			}
			System.out.println(" ");
			row = row + 1;

		}
	}
}
