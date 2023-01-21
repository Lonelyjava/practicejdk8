package practicejdk8.com.string;

public class Test {

    static String changeCase(String s1) {
        char ch[] = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i]))
                ch[i] = Character.toLowerCase(ch[i]);
            else
                ch[i] = Character.toUpperCase(ch[i]);
        }
        String s2 = new String(ch);
        return s2;
    }

    public static void main(String[] args) {
        changeCase("kundan");
    }
}
