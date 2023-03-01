package practicejdk8.com.dataStructure;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class PatternWhileLoop4 {

	public static void main(String[] args) {


Set<String> set = new LinkedHashSet<>();
set.add("3");
set.add("1");
set.add("3");
set.removeIf(s->set.contains("1"));
set.add("2");
set.remove("2");
set.forEach(s-> System.out.println(s+"-"));


//
//		String a =null;
//		Optional<String> b = Optional.empty();
//		try{
//			System.out.println("A:"+a.length());
//			System.out.println("B:"+b.orElse("").length());
//		}catch(Exception e){
//			System.out.println("exceiption "+a);
//		}finally {
//			a="String";
//			System.out.println("AaAaa:"+a.length());
//			b=Optional.ofNullable("");
//			System.out.println("bbbbbbbbbbbb"+b.get().length());
//		}

//		System.out.println("Enter Number");
//		Scanner sc= new Scanner(System.in);
//		int n =sc.nextInt();
//		int i =1;
//
//		while(i<=n) {
//			int j=1;
//			while(j<=n) {
//
//				System.out.print(n-j+1);
//				j=j+1;
//			}
//			System.out.println("");
//			i=i+1;
//		}
		
	}
}
