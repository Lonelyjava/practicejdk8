package practicejdk8.com.array;

public class ArrayTriangleWise {

    public static void trngwise(int x[]) {
        int i, j;
        System.out.println("\nthe normal array is");
        for (i = 0; i < x.length; i++) {
            System.out.print("  " + x[i]);
        }
        System.out.println("\nthe trainglewise elements of array is");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print("  " + x[j]);
            }
            System.out.println("");
        }
    }

    public static void main(String... s) {
        trngwise(new int[]{10, 3, 7, 9, 12, 43, 89, 2, 10, 2, 1});
    }
}
