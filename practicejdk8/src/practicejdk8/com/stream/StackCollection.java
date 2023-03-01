package practicejdk8.com.stream;

import java.util.Iterator;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.print(stack);
        System.out.println("\n");
        for (int i=0;i<stack.size();i++){
            System.out.print(stack.get(i));
        }
        System.out.println("\n");
        for (Integer i :stack){
            System.out.print(i);
        }
        System.out.println("\n");
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        stack.pop();
        stack.peek();
        iterator=stack.iterator();
        System.out.println("\n");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

    }
}
