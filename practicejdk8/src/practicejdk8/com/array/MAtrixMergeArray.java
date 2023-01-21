package practicejdk8.com.array;

public class MAtrixMergeArray {

    public static void merge_sort(int x[], int y[]) {
        int i, j, k, temp = 0, z[], m[];
        k = x.length + y.length;
        z = new int[k];
        m = new int[k];
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
        System.out.println("\nthe merge unsorted array: \n");
        for (i = 0; i < z.length; i++) {
            System.out.print("  " + z[i]);
        }
        for (i = 0; i < z.length - 1; i++) {
            for (j = 0; j < z.length - 1 - i; j++) {
                if (z[j] >= z[j + 1]) {
                    temp = z[j];
                    z[j] = z[j + 1];
                    z[j + 1] = temp;
                }
            }
            m[i] = z[j];
        }
        m[i] = z[0];
        System.out.println("\nthe sorted merge array is\n");
        for (i = 0; i < m.length; i++) {
            System.out.print("\t" + m[i]);
        }
    }
    public static void main(String... s) {
        merge_sort(new int[]{90, 30, 10, 20, 3,}, new int[]{34, 22, 2, 20, 89});
    }
}
