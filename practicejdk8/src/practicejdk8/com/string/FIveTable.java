package practicejdk8.com.string;

public class FIveTable {

    public static void main(String[] args) {

        int j = 0;
        int ar[] = {5, 20, 50};
        for (int i = 5; i <= 50; i = i + 5) {
            if (ar[j] == i) {
                j++;
            } else{
                System.out.print("\t"+i);
            }


        }

    }

}
