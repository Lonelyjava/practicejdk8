package practicejdk8.com.array;

public class ArrayFrequency {

    public static void freq(int x[]) {
        int i, j, count = 1;
        int t[];
        int k = x.length;
        t = new int[k];
        t[0] = 0;
        System.out.println("\nthe normal array is");
        for (i = 0; i < x.length; i++) {
            System.out.print("  " + x[i]);
        }
        System.out.println("");
        for (i = 0; i < x.length; i++) {
            if (t[i] == 0) {
                count = 1;
                for (j = i + 1; j < x.length; j++) {
                    if (x[i] == x[j]) {
                        count++;
                        t[j] = 1;
                    }
                }
                System.out.println("the element: " + x[i] + "\thave frequency:" + count + "\n");
            }
        }
    }

    public static void main(String... s) {
        freq(new int[]{10, 3, 7, 9, 2, 3, 3, 12, 1, 1, 9, 11, 13, 10, 3,});
    }
}
