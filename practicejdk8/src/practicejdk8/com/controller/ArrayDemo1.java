package practicejdk8.com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDemo1 {

	public static void arraySort(int[] x) {// 2,3,4,18,4,6,7,8,22,11,10
		System.out.println("Array Sorting ........");
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}

			}

		}
		for (int k = 0; k < x.length; k++) {
			System.out.print("\t" + x[k]);
		}
		findDuplicateArray(x);
	}

	public static void findDuplicateArray(int[] x) {
		System.out.println("\n");
		System.out.println("Find Duplicate Array...");
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.println("duplicate value: " + x[i]);
				}
			}
		}
		removeDuplicateArray(x);
	}

	public static void removeDuplicateArray(int[] x) {
		System.out.println("\n");
		System.out.println("Remove Duplicate Array form a List");
		int t = 0;
		int[] temp = new int[x.length];
		System.out.println("\n");
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] != x[i + 1]) {
				temp[t++] = x[i];
			}
		}
		temp[t++] = x[x.length - 1];

		for (int j = 0; j < t; j++) {
			x[j] = temp[j];
		}
		for (int k = 0; k < x.length; k++) {
			System.out.print("\t" + x[k]);
		}
		addNewArray(x);
	}

	public static void addNewArray(int[] x) {

		System.out.println("\n");
		System.out.println("Added new element in existing Array");
		int count = 0;
		int[] temp = new int[x.length + 2];
		for (int i = 0; i < x.length; i++) {
			temp[count++] = x[i];
		}
		temp[count++] = 1001;
		temp[count++] = 1002;
		for (int j = 0; j < temp.length; j++) {
			System.out.print("\t" + temp[j]);
		}
	}

	public static void sortIngExample() {
		
		List<Integer> list = Arrays.asList(2,3,4,1,44,13,15,9,6,7,8);
		List<Integer> list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> list3=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		List<String> list2 = list1.stream().map(i->i+"e").collect(Collectors.toList());
		List<String> list4 = list3.stream().map(i->i+"o").collect(Collectors.toList());
		list2.addAll(list4);
		
		List<String> finalList = list2.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		
		
		System.out.println("");
		System.out.print("\t finalList"+finalList);
		
		
	}
	
	public static void shortArray() {
		
		List<Integer> list = Arrays.asList(2,3,4,1,44,13,15,9,6,7,8);
		List<String> list1= new ArrayList<>();
		list.stream().sorted().forEach(s->{
			if (s%2==0)
			{
				list1.add(s.toString().concat("e"));
			}
			else {
				list1.add(s.toString().concat("o"));
			}
		});
		System.out.println(list1);
	}
	public static void main(String[] args) {

//		arraySort(new int[] { 2, 3, 4, 18, 4, 6, 7, 8, 22, 11, 10 });
//		sortIngExample();
		shortArray();
		

	}

}
