package practicejdk8.com.string;

public class StringPower {

    static int power(int x,int y)
        {
            int pow=1;

            for(int i=0;i<y;i++)
            {
                pow=pow*x;
            }
            return pow;
        }

    public static void main(String[] args) {
       int power= power(2,4);
        System.out.println("power :"+power);
    }
}
