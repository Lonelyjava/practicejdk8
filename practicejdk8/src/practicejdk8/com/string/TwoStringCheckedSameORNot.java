package practicejdk8.com.string;
// output  :  Length of both String are not same
public class TwoStringCheckedSameORNot {

    public static boolean equals(String s1, String s2) {
        String s3 = s1.toUpperCase();
        String s4 = s2.toUpperCase();
        int size = 0;
        int flag = 0;
        if (s3.length() != s4.length()) {
            System.out.println("Length of both String are not same");
            return false;
        } else
            size = s3.length();
        for (int i = 0; i < size; i++) {
            if (s3.charAt(i) != s4.charAt(i)) {
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
        equals("kundan","java");
    }
}
