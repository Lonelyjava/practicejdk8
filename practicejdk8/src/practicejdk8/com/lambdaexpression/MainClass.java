package practicejdk8.com.lambdaexpression;

public class MainClass {

    public static void main(String[] args) {
        FunctionInterface functionInterface =(String name)-> System.out.println(name);
        functionInterface.print("kundan");
        functionInterface.getMessage();

        MathInterface mathInterface = (int a)-> System.out.println(a);
        mathInterface.getSum(10);

        MathInterface.getMessage();

    }
}
