package practicejdk8.com.string;

import java.io.*;

public class RemovePerenthesisString {

    public static String removeOuterParentheses(String S) {
        String res = "";
        int count = 0;
        for (int c = 0; c < S.length(); c++) {
            if (S.charAt(c) == '(' &&
                    count++ > 0)
                res += S.charAt(c);
            if (S.charAt(c) == ')' &&
                    count-- > 1)
                res += S.charAt(c);
        }
        return res;
    }

    public static String reMoveString(String s) {

        String res = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && count++ > 0)
                res += s.charAt(i);
            if (s.charAt(i) == ')' && count-- > 1)
                res += s.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "(()())(())";
//        System.out.print(removeOuterParentheses(S));
        String s1 = reMoveString(s);
        System.out.println(s1);

        int i =5;
        int fact = 0;
        for (int j=1;j<=i;j++){
            fact+=i*j;
        }
        System.out.println(fact);
    }
}
// This code is contributed by Chitranayal













