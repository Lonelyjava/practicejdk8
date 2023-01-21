package practicejdk8.com.string;

// output : kundan

public class Array1 {

    static String SingleOccurence(String s) {
        char ch[] = s.toCharArray();
        char ch1[];
        ch1 = new char[ch.length];
        ch1[0] = ch[0];
        int count = 1;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ch[i - 1]) {
                ch1[count++] = ch[i];
            }
        }
        String s1 = new String(ch1);
        System.out.println(s1);
        System.out.println(ch1);

        return s1;
    }

    public static void main(String[] args) {
        SingleOccurence("kundan");
    }
}
