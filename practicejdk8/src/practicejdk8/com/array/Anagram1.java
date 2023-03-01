package practicejdk8.com.array;

import java.util.Arrays;
import java.util.Locale;

public class Anagram1 {

 public static void checkAnagram(String a,String b){

     a=a.toLowerCase();
     b=b.toLowerCase();

     if(a.length()==b.length()){
         char ch[]=a.toCharArray();
         char ch1[]=b.toCharArray();

         Arrays.sort(ch);
         Arrays.sort(ch1);

         boolean status = Arrays.equals(ch,ch1);

         if (status){
             System.out.println("this is anagram");
         }else {
             System.out.println("this is not anagram");
         }

     }else {
         System.out.println("this is not anagram");
     }
 }

    public static void main(String[] args) {

        checkAnagram("poor","roop");

    }

}
