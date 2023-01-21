package practicejdk8.com.array;

public class ArraySort {

    public static void sort(int x[]) {
        int j, temp, z[];
        int i = x.length;
        z = new int[i];
        System.out.println("\nthe unsorted array is");
        for (i = 0; i < x.length; i++) {
            System.out.print("\t" + x[i]);
        }
        for (i = 0; i < x.length - 1; i++) {
            for (j = 0; j < x.length - 1 - i; j++) {
                if (x[j] >= x[j + 1]) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
            z[i] = x[j];
        }
        z[i] = x[0];
        System.out.println("\nthe sorted array is");
        for (i = 0; i < z.length; i++) {
            System.out.print("\t" + z[i]);
        }
    }

    static void sort1(int x[][]) {
        int i, j, temp, last, t[], z[], k = 0;
        int s = 9;
        t = new int[s];
        z = new int[s];
        System.out.println("the normal matrix is:\n");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("");
        }
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                t[k] = x[i][j];
                k++;
            }
        }

        System.out.println("the sorted matrix is:\n");
        for (k = 0; k < 9; k++) {
            System.out.print("\t" + t[k]);
        }
        for (i = 0; i < t.length - 1; i++) {
            for (j = 0; j < t.length - 1 - i; j++) {
                if (t[j] >= t[j + 1]) {
                    temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
            z[i] = t[j];
        }
        z[i] = t[0];
        System.out.println("\nthe sorted array is");
        for (i = 0; i < z.length; i++) {
            System.out.print("\t" + z[i]);
        }
        k = 0;
        System.out.println("");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                x[i][j] = z[k];
                k++;
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String... s) {
        sort(new int[]{10, 3, 7, 9});
        sort1(new int[][]{{90, 30, 10}, {20, 3, 43}, {34, 22, 89}});
    }
}
