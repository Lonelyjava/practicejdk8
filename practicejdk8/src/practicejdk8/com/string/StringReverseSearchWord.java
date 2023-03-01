package practicejdk8.com.string;

import static practicejdk8.com.string.StringReverse1.myreverse;

public class StringReverseSearchWord {

    public static void reverseeachword(String s)
        {
            System.out.println(s);
            String str[]=s.split(" ");
            String s2=" ";

            for(int i=0;i<str.length;i++)
            {
                String s1=myreverse(str[i]);
                s2=s2+" "+s1;
            }
            System.out.println("After reversing each word output is : "+ s2);

        }

    public static void main(String[] args) {
        reverseeachword("kundan is a boy");
    }
}
