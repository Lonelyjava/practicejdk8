package practicejdk8.com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
    public static void main(String[] args) {
//        [1, 0, 1]
//        [2, 3, 4]
//        [5, 6, 7]
//        [8, 9]

        int[] original = { 1,0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

      int  k=0;
        for(int i=0;i<original.length;i++)
        {
        k++;
            System.out.print(original[i]);

            if(k==3) {
                System.out.print("\n");
                k=0;
            }

            }
        String stringWithDigit = "1ab26xyz88www5";
        char ch[]=stringWithDigit.toCharArray();
        int sum=0;
        for(int i=0;i<stringWithDigit.length();i++)
        {
            if(Character.isDigit(ch[i]))
            {
                sum=sum+Integer.parseInt(String.valueOf(ch[i]));
//                System.out.println(ch[i]);

            }
        }
        System.out.println("\n");
        System.out.println(sum);
    }



}
