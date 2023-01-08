package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		while(row<=n) {
			int col=1;
			while(col<=n) {
				char ch =(char)('A'+col-1);
				System.out.print(ch+" ");
				col=col+1;
			}
			System.out.println("");
			row=row+1;
		}
	}

}
