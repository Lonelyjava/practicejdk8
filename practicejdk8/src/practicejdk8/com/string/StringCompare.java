package practicejdk8.com.string;

public class StringCompare {

    static int compare(String s1,String s2)
        {
            System.out.println(s1 +" "+s2);
            int size1=s1.length();
            int size2=s2.length();
            int size=0;
            if(size1<size2)
                size=size1;
            else
                size=size2;

            int count=0;
            for(int i=0;i<size;i++)
            {
                if(s1.charAt(i)==s2.charAt(i))
                    count++;
                else
                    continue;
            }
            return count;

        }

    public static void main(String[] args) {
        int comparee= compare("a","a");
        System.out.println("comparee count :"+comparee);
    }
}
