package practicejdk8.com.string;

public class StringWordReverse {

    public static void main(String[] args) {

        int k = 0, j = 0;
        int ar[] = new int[10];
        String name = "annad is emp";
        ar[j++] = 0;
        char c[] = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            if (c[i] == ' ') {
                ar[j++] = i;

            }
            ar[j] = i;

        }
        for (int i = j; i > 0; i--) {

            for (k = ar[i - 1]; k <= ar[i]; k++)
                System.out.print(c[k]);
        }
    }
}
