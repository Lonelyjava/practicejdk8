package practicejdk8.com.string;
//-kundan
//        trim is:kundan
public class StringLeftTrim {
    static String leftTrim(String s) {
        System.out.println(s);
        char ch[] = new char[s.length()];
        int count = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-')
                continue;
            else {
                index = i;
                break;
            }
        }
        for (int j = index; j < s.length(); j++) {
            ch[count] = s.charAt(j);
            count++;
        }
        String s2 = new String(ch);
        return s2;
    }

    public static void main(String[] args) {
        String trim = leftTrim("-kundan");
        System.out.println("trim is:"+trim);
    }
}
