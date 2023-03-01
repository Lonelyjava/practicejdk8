package practicejdk8.com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<10; i++) myList.add(i);
        System.out.print("\t"+myList);
        System.out.println("\n");
        Stream<Integer> sequentialStream = myList.stream();
        System.out.print("\t"+sequentialStream);
        System.out.println("\n");
        Stream<Integer> parallelStream = myList.parallelStream();
        System.out.print("\t"+parallelStream);

        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        highNums.forEach(p -> System.out.print("\t"+p));
        System.out.println("\n");
        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.print("\t"+p));

        List<Integer> collect = myList.stream().collect(Collectors.toList());
        System.out.println("\n");
        System.out.print("\t"+collect);
        myList.stream().forEach(i-> System.out.println(i));

    }

}
