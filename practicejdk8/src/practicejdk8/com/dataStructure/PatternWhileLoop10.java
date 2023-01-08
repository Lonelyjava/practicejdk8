package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop10 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Number...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(i-j+1+" ");
				j=j+1;
			}
			System.out.println("");
			i=i+1;
		}
	}

}
