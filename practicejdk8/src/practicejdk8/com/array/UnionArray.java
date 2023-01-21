package practicejdk8.com.array;

public class UnionArray {

    public static void uni(int x[], int y[]) {
        int i, j, k, temp = 0, count = 0, z[], m[], t[];
        k = x.length + y.length;
        z = new int[k];
        m = new int[k];
        t = new int[k];
        t[0] = 0;
        System.out.println("\nthe first array is:");
        for (i = 0; i < x.length; i++) {
            System.out.print("  " + x[i]);
        }
        System.out.println("\nthe second array is:");
        for (i = 0; i < y.length; i++) {
            System.out.print("  " + y[i]);
        }
        for (i = 0; i < x.length; i++) {
            z[i] = x[i];
        }
        for (i = 0; i < y.length; i++) {
            z[x.length + i] = y[i];
        }
        System.out.println("\ntheir union are:\n");
        for (i = 0; i < z.length; i++) {
            if (t[i] == 0) {
                count = 1;
                for (j = i + 1; j < z.length; j++) {
                    if (z[i] == z[j]) {
                        count++;
                        t[j] = 1;
                    }
                }
                System.out.print("  " + z[i]);
            }
        }
    }
    public static void main(String... s) {
        uni(new int[]{10, 89, 39, 2}, new int[]{12, 39, 2, 30, 10, 3, 3, 3, 2});
    }
}
