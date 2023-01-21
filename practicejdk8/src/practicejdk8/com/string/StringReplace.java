package practicejdk8.com.string;

public class StringReplace {
    static String replace(String s1, String s2, String s3) {
        System.out.println(s1 +" "+s2+" "+s3);
        String str[] = s1.split(" ");
        String s4 = " ";
        for (int i = 0; i < str.length; i++) {
            if (s2.equalsIgnoreCase(str[i])) {
                str[i] = s3;
            }
        }

        for (int i = 0; i < str.length; i++) {
            s4 = s4 + " " + str[i];
        }
        return s4;
    }

    public static void main(String[] args) {
        String replaceName = replace("kundan","kundan","kundan");
        System.out.println("replaceName :"+replaceName);
    }
}
