package practicejdk8.com.string;

public class StringA {

    public static void main(String[] args) {
        int number = 11111111, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
        String name ="kundan is a boy";
//        String str = "Java Programming";

        //Create an array of words
        //[Java,Programming]
        String[] words = name.split(" ");
        String revString = "";

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";

            for(int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }

            revString = revString + revWord + " ";
        }

        System.out.print("\t"+revString);
    }
    }




