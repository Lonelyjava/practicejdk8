package practicejdk8.com.controller;
/*Author By :kundan kumar
* Created date : 16/01/2023
* Language : Java
* Purpose For : Core Java Expert
*
*
* */
import java.util.Arrays;

public class ArrayTest {
	
	
	
	public static void main(String[] args) {
		
		for(int x=0;x<10;x++) {
			for(int y=0;y<10;y++) {
				System.out.print("\t-");
			}
			System.out.print("\n");
		}
		
		System.out.println("");
		
		int temp = 0;
		int sum=0;
		int[] number = {5,10,2,3,11,15,1,22,33,55,23};
		String name[]= {"kundan","java","c"};
		for(int i=0;i<number.length;i++) {
//			for(int j=0;j<number.length;j++) {
//				if(number[i]<number[j]) {
//					temp=number[i];
//					number[i]=number[j];
//					number[j]=temp;
//				}
//			}
			sum+=number[i];
		}
		System.out.println("sum +" +sum);
		for(int k=0;k<number.length;k++) {
			System.out.print("\t"+number[k]);
		}
//		for(int p=0;p<name.length;p++) {
//			System.out.println("\n"+name[p]);
//			
//		}
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		
		
	}

}
