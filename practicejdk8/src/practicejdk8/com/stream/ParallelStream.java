package practicejdk8.com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("kudnan","Ku","aj","aj");
        list.stream().forEach(System.out::println);
        System.out.println("\n");
        list.parallelStream().forEach(System.out::println);
        System.out.println("\n");
        list.parallelStream().forEachOrdered(System.out::print);
        System.out.println("\n");
        list.stream().sequential().forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(1,2,3,8,9,88);

        list1.stream().forEach(System.out::println);
        Integer reduce = list1.stream().reduce(0, (a, b) -> a + b);
        System.out.println("\n");
        System.out.println(reduce);

        Integer sum = list1.stream().reduce(0, Integer::sum);
        System.out.println(sum);


        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(list1);
        list2.stream().forEach(System.out::println);
//        Integer reduce1= list2.stream().filter(i->i%2==0).reduce(0,(a,b)->a+b);

    }
}
