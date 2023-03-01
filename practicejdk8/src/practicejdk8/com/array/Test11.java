package practicejdk8.com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test11 {

    public static void fabinico(int a){
//        3
//        0,1,1,2
        int b=0;
        int c=1;
        int d;
        System.out.print(b+" "+c);
        for(int i=2;i<a;i++){
            d=b+c;
            System.out.print(" "+d);
            b=c;
            c=d;
        }



    }



    public static void main(String[] args) {
        //[[123,234],[345,346]] [123,234,345,346]

        List<Integer> finalList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(Arrays.asList(123,234));
        list.add(Arrays.asList(345,346));
        fabinico(5);
//        list.stream().forEach(i->{
//            finalList.add();
//        });
//        3
//        0,1,1,2






//        System.out.println(list);
//        list.stream().forEach(i->{
//            List<Integer> list3 =i.stream().collect(Collectors.toList());
//            list3.stream().forEach(j->{
//                finalList.add(j);
//            });
//
//            System.out.println(list3);
//            System.out.println(finalList);
//
//        });


    }
}
