package practicejdk8.com.array;

interface My {
    void show();
    //String toString();
}

public class Array implements My {
    public void show() {
        System.out.println("Base");

    }
    public String toString() {
        return "Hello sandy";
    }
    public static void main(String... r) {
        My m = new Array();
        m.show();
        My m1 = new Array();
        //String s=m1.toString();
        System.out.println(m);
        System.out.println(m1);
        String s = m1.toString();
        System.out.println(s);
    }

}
