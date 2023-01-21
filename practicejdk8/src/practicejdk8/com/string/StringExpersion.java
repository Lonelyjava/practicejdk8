package practicejdk8.com.string;

public class StringExpersion {

    public static int expression(String s)
        {
            System.out.println(s);
            String str[]=s.split("\\+");
            String s1="0";
            int expr=0;
            for(int i=0;i<str.length;i++)
            {
                int a=Integer.parseInt(str[i]);
                expr=expr+a;
            }
            return expr;
        }
    public static void main(String[] args) {
        expression("kundan");
    }
}
