package practicejdk8.com.array;

public class ArrayShift {

    public static void shift(int x[]) {
        int i, j, temp;
        int z[];
        int l = x.length;
        z = new int[l];
        System.out.println("\nthe normal array is");
        for (i = 0; i < x.length; i++) {
            System.out.print("  " + x[i]);
        }
        System.out.println("\nthe shifted array is: \n");
        for (i = 0; i < x.length - 1; i++) {
            for (j = 0; j < x.length - 1 - i; j++) {
                if (x[j] >= x[j + 1] && x[j] >= 0) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
                if (x[j] <= x[j + 1] && x[j] < 0 && x[j + 1] <= 0) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
            z[x.length - 1 - i] = x[j];
        }
        for (i = 0; i < x.length; i++) {
            System.out.print("  " + z[i]);
        }
    }
    public static void main(String... s) {
        shift(new int[]{10, 3, 7, 9, 19, -4, 0, 1, -2, -3, 5, 19});
    }

}
