package practicejdk8.com.string;

public class StringRepeating {
    public static void printnonrepeatingFirstChar(String s) {
        System.out.println(s);
        char ch[] = s.toCharArray();
        int count = 0;
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count = count + 1;
                }
            }
            if (count == 1) {
                index = i;
                break;
            }
        }

        System.out.println("First non repeating first char is : " + ch[index]);

    }

    public static void main(String[] args) {
        printnonrepeatingFirstChar("kundank");
    }
}
