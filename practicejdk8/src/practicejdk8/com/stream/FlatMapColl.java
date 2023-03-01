package practicejdk8.com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapColl {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        List<List<Integer>> listOflist = new ArrayList<>();
        listOflist.add(Arrays.asList(123,234));
        listOflist.add(Arrays.asList(234,456));
        System.out.println(listOflist);


//        for(List<Integer> li:listOflist){
//            for(Integer li1:li){
//                list.add(li1);
//            }
//        }
//        System.out.println(list);


//        listOflist.stream().forEach(i->{
//            List<Integer> collect = i.stream().collect(Collectors.toList());
//            collect.stream().forEach(j->{
//                list.add(j);
//            });
//
//        });
//        System.out.println(list);

//        listOflist.stream().forEach(i->{
//            i.stream().forEach(j->{
//                list.add(j);
//            });
//        });
//        System.out.println(list);

        List<Integer> collect = listOflist.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
        System.out.println(collect);

    }


}
