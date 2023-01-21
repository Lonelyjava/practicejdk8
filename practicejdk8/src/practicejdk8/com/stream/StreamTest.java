package practicejdk8.com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTest {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		List<Integer> list1= list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
		
		list.forEach(System.out::println);
		List<Integer> list2 =list.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(list2);
		
    
		
		
	}

}
