package practicejdk8.com.controller;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
	
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1, 2, 3, 4,5);
		list.stream().forEach(i->System.out.println(i +"-"+Thread.currentThread().getName()));
		
		
		List<Integer> list2 =Arrays.asList(1, 2, 3, 4,5);
		int sum = list2.parallelStream().reduce(5, Integer::sum);
//		assertThat(sum).isNotEqualTo(15);
		
		System.out.println("\n");
		System.out.println(sum);
	}

}
