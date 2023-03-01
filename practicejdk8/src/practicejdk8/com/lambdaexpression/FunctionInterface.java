package practicejdk8.com.lambdaexpression;

@FunctionalInterface
public interface FunctionInterface {
    void print(String name);
    default void getMessage(){
        System.out.println("hello hw r u!");
    }
}
