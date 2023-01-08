package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop16 {

	public static void main(String[] args) {

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int count = 1;
		while (row <= n) {
			int col = 1;
			
			while (col <= row) {
				
				char ch = (char) ('A' + count - 1);
				System.out.print(ch);
				count = count + 1;
				col = col+ 1;
			}
			System.out.println("");
			row = row + 1;
		}
	}
}
