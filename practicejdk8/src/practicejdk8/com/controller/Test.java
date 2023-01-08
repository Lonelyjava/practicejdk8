package practicejdk8.com.controller;

import java.util.ArrayList;

import practicejdk8.com.service.TestService;

public class Test {

	public static void main(String[] args) {
		
//		TestService test = (int x,int y)->System.out.println(x+y);
//		test.add(4, 5);
		
		ArrayList array = new ArrayList<>();
		array.add("test1");
		array.add("test2");
		array.add("test3");
		array.add("test4");
		array.add("test5");
		
		array.forEach(
				(n)->System.out.println(n)
		
				);
		
		TestService mess =(message)->{
			String str1="Hello :";
			String str2=str1+message;
			return str2;
		};
		System.out.println(mess.saySomething("welcome to you"));
		
	}
}
