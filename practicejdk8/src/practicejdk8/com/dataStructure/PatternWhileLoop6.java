package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop6 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number..");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		while(row<=n) {
			int col = 1;
			while(col<=row) {
				System.out.print("*");
				col=col+1;
			}
			System.out.println("");
			row=row+1;
		}
	}

}
