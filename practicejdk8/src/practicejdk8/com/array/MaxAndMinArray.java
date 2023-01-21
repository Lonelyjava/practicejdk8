package practicejdk8.com.array;

public class MaxAndMinArray {

    public static int max(int x[]) {
        int largest = x[0];
        for (int i = 0; i < x.length; i++) {
            if (largest <= x[i]) {
                largest = x[i];
            }
        }
        return largest;
    }
    public static int min(int x[]) {
        int smallest = x[0];
        for (int i = 0; i < x.length; i++) {
            if (smallest >= x[i]) {
                smallest = x[i];
            }
        }
        return smallest;
    }
    public static void main(String... s) {
        MaxAndMinArray c = new MaxAndMinArray();
        int a = max(new int[]{10, 3, 7, 9});
        System.out.println(a);
        int b = min(new int[]{10, 3, 7, 9});
        System.out.println(b);
    }
}
