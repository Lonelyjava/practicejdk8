package practicejdk8.com.string;

public class StringSpaceCount {
    static int spaceCount(String s)
        {
            System.out.println(s);
            char ch[]=s.toCharArray();
            int spc=0;
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]==' ')
                    spc=spc+1;
            }
            return spc;
        }

    public static void main(String[] args) {
       int spaceCount= spaceCount("ku ndan");
        System.out.println("space count :"+spaceCount);
    }
}
