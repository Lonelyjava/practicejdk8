package practicejdk8.com.string;

public class StringSequence {
    static void sequencecount(String s) {
        System.out.println(s);
        char ch[] = s.toCharArray();
        char ch1[] = new char[ch.length];
        int count = 1;
        int flag = 0;
        ch1[0] = ch[0];
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ch[i - 1]) {
                ch1[count++] = ch[i];
            }
        }
        int countsq[] = new int[count];
        int countf = 0;
        countsq[0] = 0;
        int index = 0;
        int count1 = 0;
        for (int i = 0; i < count; i++) {
            countf = 0;
            for (int j = index; j < ch.length; j++) {
                if (ch1[i] == ch[j]) {
                    countf++;
                    count1++;
                    continue;
                } else
                    break;
            }
            countsq[i] = countf;
            index = count1;

        }
        System.out.print("character");
        System.out.print(" ");
        System.out.print("sequence");
        System.out.println(" ");
        for (int i = 0; i < count; i++) {
            System.out.print(ch1[i]);
            System.out.print("\t");
            System.out.print(countsq[i]);
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        sequencecount("kundan");
    }
}
