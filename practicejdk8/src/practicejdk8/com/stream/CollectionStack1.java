package practicejdk8.com.stream;

import java.util.Stack;

public class CollectionStack1 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("kundan");
        stack.push("ndanda");
        stack.push("kunal");
        stack.push("hello");
        System.out.print(stack);
        System.out.println("\n");
        System.out.println(stack.peek());
    }
}
