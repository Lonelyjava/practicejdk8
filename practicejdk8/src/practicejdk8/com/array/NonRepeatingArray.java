package practicejdk8.com.array;

public class NonRepeatingArray {

   public static void non(int x[]) {
        int i, j, t = 0;
        System.out.println("\nthe normal array is");
        for (i = 0; i < x.length; i++) {
            System.out.print("  " + x[i]);
        }
        System.out.print("\nthe first non repeating element is:  ");
        for (i = 0; i < x.length; i++) {
            t = 0;
            for (j = i + 1; j < x.length; j++) {
                if (x[i] == x[j] && t == 0) {
                    t = 1;
                    break;
                }
            }
            if (j == x.length) {
                System.out.print(x[i]);
                break;
            }
        }
    }
    public static void main(String... s) {
        non(new int[]{10, 3, 7, 9, 3, 10, 3, 13, 8});
    }
}
