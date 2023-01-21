package practicejdk8.com.array;

public class MatrixArrayMax {

    public static void maxinrow(int x[][]) {
        int i, j, count = 0;
        System.out.println("the normal matrix is:\n");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (i = 0; i < x.length; i++) {
            count = 0;
            for (j = 0; j < x[i].length; j++) {
                if (x[i][j] == 1) {
                    count++;
                }
            }
            System.out.println("no. of 1 in row" + i + ":  " + count + "\n");
        }
    }
    public static void main(String... s) {
        maxinrow(new int[][]{{0, 0, 0, 1, 1}, {0, 1, 1, 1, 1}, {0, 0, 0, 0, 1}, {0, 0, 1, 1, 1}, {1, 1, 1, 1, 1}});
    }
}
