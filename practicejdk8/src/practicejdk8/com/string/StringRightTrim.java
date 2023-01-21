package practicejdk8.com.string;

public class StringRightTrim {

    static String rightTrim(String s) {
        System.out.println(s);
        char ch[] = new char[s.length()];
        int count = 0;
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '-')
                continue;
            else {
                index = i;
                break;
            }
        }

        for (int j = 0; j <= index; j++) {
            ch[count] = s.charAt(j);
            count++;
        }
        String s2 = new String(ch);
        return s2;

    }

    public static void main(String[] args) {
        String rightTrim = rightTrim("kundan-");
        System.out.println("right trim is :"+rightTrim);
    }
}
