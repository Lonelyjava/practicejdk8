package practicejdk8.com.array;

import java.util.Arrays;

public class Anagram {

    public static void checkAnagram(String a, String b) {

        char ch[] = a.toCharArray();
        char ch1[] = b.toCharArray();

        char temp[] = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {

            for (int j = 0; j < ch1.length; j++) {

                if (ch.length == ch1.length) {

                    if (ch[i] == ch1[j]) {
                        temp[j] = ch1[j];
                        break;
                    }



            }


        }

    }
        boolean status = Arrays.equals(ch,ch1);
        if (status) {
            System.out.println("this is a anagrams:");
        }else {
            System.out.println("not a anagrams");
        }
    }
    public static void main(String[] args) {
        checkAnagram("keep","peek");
    }
}