package practicejdk8.com.array;

public class MatrixArray {

    public static void add(int x[][], int y[][]) {
        int i, j, sum;
        System.out.println("the first matrix is");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("");
        }
        System.out.println("the second matrix is");
        for (i = 0; i < y.length; i++) {
            for (j = 0; j < y[i].length; j++) {
                System.out.print("\t" + y[i][j]);
            }
            System.out.println("");
        }
        if (x.length == y.length /*&& x[3].length==y[2].length*/) //why --j not?
        {
            System.out.println("their sum are: \n");
            for (i = 0; i < x.length; i++) {
                sum = 0;
                for (j = 0; j < x[i].length; j++) {
                    sum = sum + x[i][j] + y[i][j];
                    System.out.print("\t" + sum);
                    sum = 0;
                }

                System.out.println();
            }
        } else
            System.out.println("oops!  their order are not same");
    }

    static void mul(int x[][], int y[][]) {
        int i, j, k, sum;
        System.out.println("their multiplication: \n");
        for (k = 0; k < x.length; k++) {
            for (i = 0; i < x[k].length; i++)
            {
                sum = 0;
                for (j = 0; j < y.length; j++) {
                    sum = sum + x[k][j] * y[j][i];
                }
                System.out.print("\t" + sum);
            }
            System.out.println("");
        }
    }

    public static void main(String... s) {
        add(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}}, new int[][]{{3, 9, 0}, {8, 2, 1}, {7, 0, 1}});
        mul(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}}, new int[][]{{3, 9, 0}, {8, 2, 1}, {7, 0, 1}});
    }
}
