package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop5 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int count=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(" "+count);
				count=count+1;
				j=j+1;
			}
			System.out.println("");
			i=i+1;
		}
	}

}
