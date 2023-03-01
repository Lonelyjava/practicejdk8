package practicejdk8.com.stream;


interface Sayable{
    void say();
}

public class MethodRefrence {

    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodRefrence::saySomething;
        // Calling interface method
        sayable.say();
    }
}
