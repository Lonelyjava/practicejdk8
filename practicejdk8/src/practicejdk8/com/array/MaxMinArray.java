package practicejdk8.com.array;

public class MaxMinArray {

    static int max(int z[][]) {
        int largest = z[0][0];
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                if (largest <= z[i][j]) {
                    largest = z[i][j];
                }
            }
        }
        return largest;
    }

    static int min(int z[][]) {
        int smallest = z[0][0];
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                if (smallest >= z[i][j]) {
                    smallest = z[i][j];
                }
            }
        }
        return smallest;
    }

    public static void main(String... s) {
        int a = max(new int[][]{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}});
        System.out.println(a);
        int b = min(new int[][]{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}});
        System.out.println(b);
    }
}
