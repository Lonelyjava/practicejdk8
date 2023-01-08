package practicejdk8.com.controller;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamTest {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 67);

		List<String> list = Arrays.asList("kundan", "abc", "demo", "test");
//		list.stream().parallel().forEach(System.out::println);
//		list.parallelStream().forEach(System.out::println);

		String name = "kundan";
//		System.out.println("name :" + name);
//		StringBuilder s = new StringBuilder();
//		s.append(name);
		System.out.println(name.substring(1, 2));
		
		char[] nameValue=name.toCharArray();
		char[] result =new char[nameValue.length];
		for(int i=0;i<nameValue.length;i++) {
			result[i]=nameValue[nameValue.length-i-1];
		}
		System.out.println("reverse is :"+new String(result));
	}

}
