package practicejdk8.com.dataStructure;

import java.util.Scanner;

public class PatternWhileLoop21 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number..");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		while(row<=n) {
			//first
			int space =n-row;
			while(space!=0) {
				System.out.print(" ");
				space=space-1;
			}
			//seconds
			int  j=1;
			while(j<=row) {
				System.out.print(j);
				j=j+1;
				
			}
			//thirds
			int start = row -1;
			while(start!=0) {
				System.out.print(start);
				start=start-1;
			}
			System.out.println("");
			row=row+1;
		}
	}

}
