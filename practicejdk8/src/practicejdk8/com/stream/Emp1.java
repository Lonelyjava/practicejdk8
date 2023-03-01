package practicejdk8.com.stream;

import practicejdk8.com.string.Emp;

import java.util.*;
import java.util.stream.Collectors;

public class Emp1 {

    public static void main(String[] args) {






        String name ="kundan";
        char temp=0;
        char ch[]=name.toCharArray();
//        char ch1[]=new char[name.length()];
        for(int i=0;i<=ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }

        }
        for(int j=0;j<ch.length;j++){
            System.out.println(ch[j]);
        }
















//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,78,9);
//
//        list.stream().map(i->{
//
//        }).collect(Collectors.toList());
//        Collections.reverse(list);
//        System.out.println(list);

//        List<Emp> emp = new ArrayList<>();
//        Emp emp1 = new Emp();
//        emp1.setSalary(10000);
//        emp1.setDept("CSE");
//        emp1.setName("Kundan");
//        emp1.setGender("male");
//        emp.add(emp1);
//        Map<String, Integer> map = emp.stream().collect(Collectors.toMap(Emp::getName, Emp::getSalary));
//        System.out.println(map);
    }
}
