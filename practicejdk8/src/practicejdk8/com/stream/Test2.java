package practicejdk8.com.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {

        List<String> listSt= Arrays.asList("kundan","amit");
        List<List<String>> lsit = new ArrayList<>();
        lsit.add(listSt);


        Stream<String> stringStream = listSt.stream().flatMap(String::lines);
        System.out.println(stringStream.collect(Collectors.toList()));


        List<String> list = Arrays.asList("kundan","kundan","abc");
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

    }
}
