package practicejdk8.com.controller;

import practicejdk8.com.service.BookService;

public class BookController {

	
	public static void main(String[] args) {
		
		
		BookService book=(n)->{
			System.out.println("hello :"+n);
			return n;
		};
		
		book.getName("java");
		
		BookService book2 =(n1)->{
			System.out.println("hello :"+n1);
			return n1;
		};
		book2.getName("python");
		
		BookService book1 = new BookService() {
			
			@Override
			public String getName(String name) {
				System.out.println("Hello :"+name);
				return name;
			}
		};
		book1.getName("c sharp");
	}
}
