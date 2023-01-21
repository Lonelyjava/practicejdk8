package practicejdk8.com.string;

        /*      kun-da n
                squeze is kundan*/
public class StringSqueze {

    static String squeeze(String s) {
        System.out.println(s);
        char ch[] = s.toCharArray();
        char ch1[] = new char[ch.length];
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '-' || ch[i] == ' ')
                continue;
            else {
                ch1[count] = ch[i];
                count++;
            }
        }
        String s2 = new String(ch1);
        return s2;

    }

    public static void main(String[] args) {
        String squeze = squeeze("kun-da n");
        System.out.println("squeze is " + squeze);
    }
}
