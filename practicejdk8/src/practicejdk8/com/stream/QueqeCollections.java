package practicejdk8.com.stream;

import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QueqeCollections {

    public static void main(String[] args) {

        final List<List<String>> task2 = List.of(
                List.of("1", "3", "99", "2", "14", "2"),
                List.of("111", "7", "199", "92", "14", "20"),
                List.of("10", "31", "9", "21", "243", "432"),
                List.of("31", "13", "999", "5", "41", "222"),
                List.of("10", "31", "401", "42", "11", "77")
        );
//Expected Out Put: 999
        task2.stream().forEach(i->{
            List<String> list = i.stream().filter(j->j.equals("999")).collect(Collectors.toList());
            System.out.println(list);
        });


        task2.stream().forEach(i->{
            List<String> collect = i.stream().filter(j -> j.equals("99")).collect(Collectors.toList());
            System.out.println(collect);
        });

    }
}
