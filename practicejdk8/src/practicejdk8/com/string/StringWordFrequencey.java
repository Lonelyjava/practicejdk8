package practicejdk8.com.string;

public class StringWordFrequencey {
    public static void wordfrequencycount(String s) {
        System.out.println(s);
        String s1[] = s.split(" ");

        String str[] = new String[s1.length];

        str[0] = s1[0];
        int count = 1;
        int flag = 0;

        for (int i = 0; i < s1.length; i++) {
            flag = 0;
            for (int j = 0; j < count; j++) {
                if (s1[i].equalsIgnoreCase(str[j])) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                str[count] = s1[i];
                count++;
            }
        }
        int freqcount[] = new int[count];
        int countf = 0;
        for (int i = 0; i < count; i++) {

            countf = 0;
            for (int j = 0; j < s1.length; j++) {
                if (str[i].equalsIgnoreCase(s1[j]))
                    countf++;

            }
            freqcount[i] = countf;
        }

        System.out.print(" word");

        System.out.print("\t");
        System.out.print("\t");
        System.out.println("frequency");

        for (int i = 0; i < count; i++) {
            System.out.print(str[i]);

            System.out.print("\t");
            System.out.print("\t");
            System.out.print(freqcount[i]);
            System.out.println("\t");
        }

    }

    public static void main(String[] args) {
        wordfrequencycount("kundankun");
    }
}
