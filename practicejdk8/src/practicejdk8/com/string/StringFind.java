package practicejdk8.com.string;
/*kundan
        find :true*/
public class StringFind {

    static boolean find(String s1,String s2)
        {
            System.out.println(s2);
            String str[]=s1.split(" ");
            int flag=0;
            for(int i=0;i<str.length;i++)
            {
                if(s2.equalsIgnoreCase(str[i]))
                {
                    flag=1;
                    break;
                }

            }
            if(flag==0)

                return false;
            else
                return true;

        }
    public static void main(String[] args) {
        boolean find = find("kundan","kundan");
        System.out.println("find :"+find);
    }
}
