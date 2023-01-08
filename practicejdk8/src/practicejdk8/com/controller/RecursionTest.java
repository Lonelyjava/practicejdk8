package practicejdk8.com.controller;

public class RecursionTest {
	
	int count=1;
	
//	public Integer factrial(int num) {
//		
//		if(count==1)
//		{
//			int factNum=1;
//			for(int i=1;i<=5;i++) {
//				factNum=factNum*i;
//			}
//			System.out.println("factNum +" +factNum);
//		}
////		count++;
//		
//		return factrial(num);
//	}
	public void factrial(int n) {
		System.out.println(n);
		factrial(n-1);
	}
	
	public static void main(String[] args) {
		RecursionTest recursionTest = new RecursionTest();
		
		recursionTest.factrial(5);
	}

}
