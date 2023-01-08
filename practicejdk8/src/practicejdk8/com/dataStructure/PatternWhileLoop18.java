package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop18 {

	public static void main(String[] args) {

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while (row <= n) {
			int col = 1;
			char start = (char) ('A' + n - row);
			while (col <= row) {
				System.out.print(start);
				start = (char) (start + 1);
				col = col + 1;

			}
			System.out.println("");
			row = row + 1;
		}
	}
}
