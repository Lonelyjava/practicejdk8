package practicejdk8.com.array;

class DiagonalwiseArray {
    /*first we have to show that 2D matrix*/
    static void diago(int x[][]) {
        int i, j;
        System.out.println("the normal matrix is:\n");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n");
        /*from here coding of printing diagonalwise snake has been started*/
        int k, count;
        for (k = 0; k <= 4; k++)            //since we are hiring the valuue of i & j from above loop
        {

            count = 0;
            for (i = 0; i < x.length; i++) {
                for (j = 0; j < x[i].length; j++) {
                    if (i + j == k && j % 2 == 0) {
                        System.out.print("\t" + x[i][j]);
                        count++;
                    }
                    if (i + j == k && j % 2 != 0) {
                        System.out.print("\t" + x[i][j]);
                        count++;
                    }
                }

            }
            System.out.println("");
        }
    }
    public static void main(String... s) {
        diago(new int[][]{{9, 3, 1}, {0, 6, 11}, {2, 9, 4}});
    }
}