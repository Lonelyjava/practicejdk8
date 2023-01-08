package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		char ch = 'A';
		while (row <= n) {
			int col = 1;

			while (col <= n) {

				System.out.print(ch + " ");
				ch = (char) (ch + 1);
				col = col + 1;

			}
			System.out.println("");
			row = row + 1;
		}
	}

}
