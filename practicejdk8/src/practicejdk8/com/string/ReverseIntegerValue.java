package practicejdk8.com.string;

public class ReverseIntegerValue {
    public static void main(String[] args) {
        int r = 0;
        int a = 789;
        while (a > 0) {
            r = r * 10 + a % 10;
            a /= 10;

        }
        System.out.println(r);
    }
}
