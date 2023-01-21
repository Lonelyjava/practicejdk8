package practicejdk8.com.string;

import static practicejdk8.com.string.StringPower.power;

public class StringBinarytoDecimal {
    public static int binaryToDecimal(String s)
        {
            System.out.println(s);
            char ch[]=s.toCharArray();
            int sum=0;
            for(int i=ch.length-1;i>=0;i--)
            {
                sum=sum+(power(2,ch.length-1-i)*(Integer.parseInt(String.valueOf(ch[i]))));
            }
            return sum;
        }

    public static void main(String[] args) {
      int count=  binaryToDecimal("kundan");
        System.out.println("count "+count);
    }
}
