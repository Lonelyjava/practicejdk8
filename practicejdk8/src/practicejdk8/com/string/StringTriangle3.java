package practicejdk8.com.string;
/*
        k	u	n	d	a	n
        u	n	d	a	n
        n	d	a	n
        d	a	n
        a	n
        n
*/

public class StringTriangle3 {

    static void triangle3(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s1.length(); j++) {
                System.out.print(s1.charAt(j));
                System.out.print("\t");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        triangle3("kundan");
    }
}
