package practicejdk8.com.array;

public class MatrixTransposeArray {

    public static void trans(int x[][]) {
        int i, j;
        System.out.println("the first matrix is");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("");
        }
        System.out.println("the transpose matrix is");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[j][i]);
            }
            System.out.println("");
        }
    }
    static void msum(int x[][]) {
        int i, j, sum, sum1 = 0;
        System.out.println("their msum is: \n");
        for (i = 0; i < x.length; i++) {
            sum = 0;
            for (j = 0; j < x[i].length; j++) {
                sum += x[i][j];
                System.out.print("\t" + x[i][j]);
            }
            System.out.print("\t\t" + sum + "\n");
        }
        System.out.println("\n");
        for (i = 0; i < x.length; i++) {
            sum = 0;
            for (j = 0; j < x[i].length; j++) {
                if (i == j) {
                    sum1 += x[i][j];
                }
                sum += x[j][i];
            }
            System.out.print("\t" + sum);
        }
        System.out.print("\t\t" + sum1);
    }
    public static void main(String... s) {
        trans(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}});
        msum(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}});
    }
}
