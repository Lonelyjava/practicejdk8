package practicejdk8.com.string;

public class StringReverse1 {
    public static String myreverse(String s1)
        {

            char ch[]=s1.toCharArray();
            char ch1[]=new char[ch.length];
            int count=0;
            for(int i=ch.length-1;i>=0;i--)
            {
                ch1[count]=ch[i];
                count++;
            }
            String s3=new String(ch1);
            return s3;
        }

    public static void main(String[] args) {
       String reverseName= myreverse("kundan");
        System.out.println("reverseName :"+reverseName);
    }
}
