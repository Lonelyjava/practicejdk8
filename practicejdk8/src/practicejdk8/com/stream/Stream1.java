package practicejdk8.com.stream;

import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 2, 34, 3, 5, 54, 545, 6, 5, 89);

        List<Integer> collect = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        integers.stream().forEach(System.out::println);
        System.out.println(integers);
        for (Integer i : integers) {
            System.out.print(i);
        }
        System.out.println("------");
        System.out.println(collect);
        List<Integer> collect1 = integers.stream().map(i -> i + i).collect(Collectors.toList());
        System.out.print("\t" + collect1);

        List<Integer> collect2 = integers.stream().sorted().collect(Collectors.toList());
        System.out.println("\n");
        System.out.print("sorted :" + collect2);
        List<Integer> collect3 = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("\n");
        System.out.print("\t" + collect3);
        List<Integer> collect4 = integers.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
        System.out.println("");
        System.out.print("\t" + "Assending order " + collect4);
        List<Integer> collect5 = integers.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("\n");
        System.out.print("\t" + "Decending Order " + collect5);


        System.out.println("\n");

        List<String> strings = Arrays.asList("kundan", "nandan", "ajay", "ruby", "seema");
        strings.stream().forEach(System.out::println);
        System.out.println("\n");
        List<String> kundan = strings.stream().filter(i -> i.equalsIgnoreCase("kundan")).collect(Collectors.toList());
        System.out.println(kundan);
        List<String> a = strings.stream().filter(i -> i.startsWith("a")).collect(Collectors.toList());
        System.out.println(a);
//        List<Integer> collect6 = strings.stream().map(i -> i.startsWith("a")).collect(Collectors.toList());
        List<String> collect6 = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(collect6);
        List<String> collect7 = strings.stream().sorted((i, b) -> b.compareTo(i)).collect(Collectors.toList());
        System.out.println(collect7);

        int even = integers.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println(even);

        System.out.println("\n");

        List<String> list = Arrays.asList("geeks", "gfg", "g","e", "e", "k", "s");
        List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<Integer> collect8 = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(collect8);
        System.out.println(answer);

    }
}
