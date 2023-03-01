package practicejdk8.com.stream;

import java.util.function.BiFunction;

public class MethodReference2 {

    public static void ThreadStatus(){
        System.out.println("Thread is running !!!!!!!!!!!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(MethodReference2::ThreadStatus);
        thread.start();


        BiFunction<Integer,Integer,Integer> add =Arithmetic::add;
        int a =add.apply(10,20);
        System.out.println(a);
    }


}
