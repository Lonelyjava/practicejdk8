package practicejdk8.com.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class Java8ForEachExample implements Runnable {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);

        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);

        }
        System.out.println("\n");
        list.forEach(System.out::println);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        MyConsumer myConsumer = new MyConsumer();
        list.forEach(myConsumer);

        Runnable r1 = () -> {

            System.out.println("My Runnable");
        };

        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("My Runnable");
            }};
    }

    @Override
    public void run() {
        System.out.println("hello");
    }
}
