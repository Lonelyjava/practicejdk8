package practicejdk8.com.string;

public class StringPrintAllReverse {

    public static void printAllWordsInReverse(String s)
        {
            System.out.println(s);
            String str[]=s.split(" ");
            String st=" ";
            int count=0;
            for(int i=str.length-1;i>=0;i--)
            {
                st=st+" "+str[i];
            }
            System.out.println("All words in reverse order in a string is : "+ st);
        }

    public static void main(String[] args) {
        printAllWordsInReverse("kundan");
    }
}
