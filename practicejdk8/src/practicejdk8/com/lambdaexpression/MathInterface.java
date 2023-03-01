package practicejdk8.com.lambdaexpression;
@FunctionalInterface
public interface MathInterface {

  abstract void getSum(int a);
  static void getMessage(){
      System.out.println("Hello Welcome to Our Java World !");
  }
}
