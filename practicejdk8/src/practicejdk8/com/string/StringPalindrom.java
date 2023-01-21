package practicejdk8.com.string;

public class StringPalindrom {

    static boolean palindrome(String s) {
        System.out.println(s);
        char ch[] = s.toCharArray();
        char ch1[] = new char[ch.length];


        int count = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            ch1[count] = ch[i];
            count++;
        }
        int flag = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch1[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        boolean palidrom = palindrome("aba");
        System.out.println("Palindrom is:" + palidrom);

    }
}