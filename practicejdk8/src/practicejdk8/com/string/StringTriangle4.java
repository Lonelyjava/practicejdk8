package practicejdk8.com.string;
//kundan
//        kundankundan
//        kunda  undan
//        kund    ndan
//        kun      dan
//        ku        an
//        k          n

public class StringTriangle4 {

    static void triangle4(String s1) {
        System.out.println(s1);
        System.out.println("-----------");
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s1.length() - i; j++) {
                System.out.print(s1.charAt(j));
            }

            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }

            for (int l = i; l < s1.length(); l++) {

                System.out.print(s1.charAt(l));
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        triangle4("kundan");
    }
}
