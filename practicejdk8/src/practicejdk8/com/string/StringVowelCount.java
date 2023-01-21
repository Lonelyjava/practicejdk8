package practicejdk8.com.string;

public class StringVowelCount {

    static int vowelcount(String s)
        {
            System.out.println(s);
            int count=0;

            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U')
                    count++;
                else
                    continue;
            }
            return count;
        }

    public static void main(String[] args) {
        int count =vowelcount("kundan");
        System.out.println("vowel count is :"+count);
    }
}
