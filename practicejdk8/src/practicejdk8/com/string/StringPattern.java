package practicejdk8.com.string;
    /*   k
        k	u
        k	u	n
        k	u	n	d
        k	u	n	d	a
        k	u	n	d	a	n*/

public class StringPattern {


    static void triangle1(String s1) {

        System.out.println("Original String is: " + s1);
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch[j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        triangle1("kundan");

    }

}
