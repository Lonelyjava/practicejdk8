package practicejdk8.com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import practicejdk8.com.service.DemoService;

public class StremDemo {
	
	
	public static void main(String agr[]) {
		
		
		DemoService demo =(a,b)->{
			System.out.println("sum of two number:"+(a+b));
		};
		demo.sum(10, 20);
		
		List names = Arrays.asList("Reflection","Collection","Stream","Aman");
		List soretedName =(List) names.stream().sorted().collect(Collectors.toList());
		System.out.println("soretedName :"+soretedName);
		
		System.out.println("\n");
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(55);
		list.add(43);
		list.add(51);
		list.add(60);
		list.add(1);
		
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		List<Integer> desSorted = list.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
		Integer minValues = list.stream().min((x,y)->x.compare(x, y)).get();
		Integer maxValues = list.stream().max((x,y)->x.compare(x, y)).get();
		System.out.println("sorted :"+sorted);
		System.out.println("desSorted :"+desSorted);
		System.out.println("minValues----"+minValues);
		System.out.println("maxValues--"+maxValues);
		
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		
		
		
		System.out.println("simple -"+list);
		for(Integer i:list)
		{
			System.out.println("for :"+i);
		}
		List<Integer> list1= list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println("Stream :"+list1);
		
		List<Integer> list3 =list.stream().map(i->i+2).collect(Collectors.toList());
		
		System.out.println("map "+list3);
		
		List<Integer> aslist= Arrays.asList(12,332,435345,667,2);
		List<String> aslistString= Arrays.asList("kundan","kunal");
		System.out.println("aslist0 "+aslist);
		System.out.println("aslistString "+aslistString);
		
		List<String> name = new ArrayList<>();
		name.add("kundan");
		name.add("ganesh");
		name.add("kanika");
		name.add("mohan");
		name.add("princek");
		
		System.out.println("name"+name);
		
		List<String> steanName=name.stream().filter(i->i.equals("kundan")).collect(Collectors.toList());
		System.out.println("steanName: "+steanName);
		
		List<String> filterName = name.stream().filter(s->s.startsWith("k")).collect(Collectors.toList());
		List<String> filterNames = name.stream().filter(s->s.endsWith("k")).collect(Collectors.toList());
		System.out.println("filterName :"+filterName);
		System.out.println("filterNames :"+filterNames);
	}

}