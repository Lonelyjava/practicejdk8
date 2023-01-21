package practicejdk8.com.array;

public class ArrayTriangle {


    public static void a_sum(int x[][]) {
        int i, j, sum = 0;
        System.out.println("the first matrix is");
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("");
        }
        for (i = 0; i < x.length; i++) {
            for (j = i; j < x[i].length; j++) {
                sum += x[i][j];
            }
        }
        System.out.println("the sum of A traingle elements are: " + sum + "\n");
    }

    public static void a_max(int x[][]) {
        int i, j, largest = x[0][0];
        for (i = 0; i < x.length; i++) {
            for (j = i; j < x[i].length; j++) {
                if (largest <= x[i][j]) {
                    largest = x[i][j];
                }
            }
        }
        System.out.println("the largest element in A traingle is: " + largest + "\n");
    }

    public static void a_min(int x[][]) {
        int i, j, smallest = x[0][0];
        for (i = 0; i < x.length; i++) {
            for (j = i; j < x[i].length; j++) {
                if (smallest >= x[i][j]) {
                    smallest = x[i][j];
                }
            }
        }
        System.out.println("the smallest element in A traingle is: " + smallest + "\n");
    }

    //the operation of B traingle starts from here
    public static void b_sum(int x[][]) {
        int i, j, sum = 0;
        System.out.println("the first matrix is");
        for (i = 1; i < x.length; i++) {
            for (j = 0; j < i; j++) {
                sum += x[i][j];
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("");
        }
        System.out.println("the sum of B traingle elements are: " + sum + "\n");
    }

    public static void b_max(int x[][]) {
        int i, j, largest = x[1][0];
        for (i = 1; i < x.length; i++) {
            for (j = 0; j < i; j++) {
                if (largest <= x[i][j]) {
                    largest = x[i][j];
                }
            }
        }
        System.out.println("the largest element in B traingle is: " + largest + "\n");
    }

    public static void b_min(int x[][]) {
        int i, j, smallest = x[0][0];
        for (i = 1; i < x.length; i++) {
            for (j = 0; j < i; j++) {
                if (smallest >= x[i][j]) {
                    smallest = x[i][j];
                }
            }
        }
        System.out.println("the smallest element in B traingle is: " + smallest + "\n");
    }

    public static void main(String... s) {
        a_sum(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}});
        a_max(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}});
        a_min(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}});
        b_sum(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}});
        b_max(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}});
        b_min(new int[][]{{10, 20, 2}, {3, 89, 76}, {11, 42, 8}});
    }

}
