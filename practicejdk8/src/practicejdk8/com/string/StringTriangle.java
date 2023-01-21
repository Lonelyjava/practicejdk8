package practicejdk8.com.string;
//        k	u	n	d	a	n
//        k	u	n	d	a
//        k	u	n	d
//        k	u	n
//        k	u
//        k
public class StringTriangle {

    static void triangle2(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s1.length() - i; j++) {


                System.out.print(s1.charAt(j));
                System.out.print("\t");

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        triangle2("kundan");
    }
}
