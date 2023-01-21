package practicejdk8.com.string;
//-kundan-
//        All trim is :kundan

public class StringAllTrim {

    static String allTrim(String s) {
        System.out.println(s);
        char ch[] = s.toCharArray();
        char ch1[] = new char[ch.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '-')
                continue;
            else {
                index = i;
                break;
            }
        }
        int index1 = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == '-')
                continue;
            else {
                index1 = i;
                break;
            }
        }
        String s2 = s.substring(index, index1 + 1);
        return s2;
    }

    public static void main(String[] args) {
        String allTrim = allTrim("-kundan-");
        System.out.println("All trim is :" + allTrim);
    }
}
