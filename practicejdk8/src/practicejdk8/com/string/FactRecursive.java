package practicejdk8.com.string;

public class FactRecursive {


    public static void factorial(int a){
        int fact =1;
        int fact1 =1;
        for(int i=1;i<=a;i++){
            fact =fact*i;
        }
        System.out.println(fact);
        System.out.println();
        if (a>0){
            fact1=fact1*a;
            System.out.println(fact1);
            factorial(a-1);
        }

    }


    public static void main(String[] args) {
        factorial(5);
    }
}
