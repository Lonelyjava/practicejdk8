package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		while(row<=n) {
			int col =1;
			while(col<=row) {
				System.out.print(row);
				col=col+1;
			}
			System.out.println("");
			row=row+1;
		}
	}

}
