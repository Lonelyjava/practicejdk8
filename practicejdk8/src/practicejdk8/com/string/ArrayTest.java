//package practicejdk8.com.array;
//
//public class ArrayTest {
//
//    class StringDemo
//    {
//
//
//        //Q.21
//
//
//        //Q.20
//
//
////Q.15
//
//
//        //Q.13
//
//
//        //Q.14
//
//
//
//
//
//        //Q.22
//
//
//
//        //Q.23
//
//
//
//
//
//        //Q.1
//
////Q.2
//
//
//
////Q.3
//
//
//
//        //Q.4
//
//
//        //Q.5
//
//
//        //Q.9
//
//        //Q.6
//
//        //Q.7
//
//
////Q.8
//
//
//
//        //Q.10
//
//
////Q.11
//
//
////Q.16
//
//
//
////Q.17
//
//
//
//        //Q.18
//
//
//        //Q.19
//
//
//        //Q.25
//
//
//        //Q.26
//
//
//        //Q.29
//
//
////Q.30
//
//
//        //Q.30
//
//
////Q.31
//
//
////Q.27
//
//
//
//
////Q.28
//
//
//
//
//
//
////Q.12
//
//
//
//
////Q.24
//
//
//
//        public static void main(String... args)
//        {
//            //Q.21
//            StringDemo.triangle1("ducat");
//            //Q20
//            boolean b=StringDemo.equals("hello","Hellogood");
//            if(b==true)
//                System.out.println("Both String are same");
//            else
//                System.out.println("Both string are not same");
//            //Q.15
//            String str=StringDemo.SingleOccurence("nniittiiin");
//            System.out.println("Single occurence value of string is " +str);
//            //Q.13
//            StringDemo.frequencycount("nniittiiin");
//
//            //Q.14
//            String st=StringDemo.changeCase("InDIa");
//            System.out.println("After changing case output is: "+st);
//
//            //Q.22
//            StringDemo.triangle2("ducat");
//            System.out.println(" ");
//
//            //Q.23
//            StringDemo.triangle3("ducat");
//
//
//
//
//            //Q.1
//
//            int word=StringDemo.WordCount("India is a Good country");
//            System.out.println("Number of wordcount is:  " + word);
//
//            //Q.2
//            int space=StringDemo.SpaceCount("India is a Good country");
//            System.out.println("Number of spacecount is:  " + space);
//
//            //Q.3
//            int chr=StringDemo.charCount("@India is a Good country!");
//            System.out.println("Number of character in a String is:  " + chr);
//
//            //Q.4
//
//            String str1=StringDemo.reverse("i love java");
//            System.out.println("Reversed String is:" +str1);
//
//            //Q.5
//            boolean bl=StringDemo.Palindrome("ABBAC");
//            if(bl==true)
//                System.out.println("Its a Palindrome");
//            else
//                System.out.println("Its not a Palindrome");
//
//            //Q.9
//            String str2=StringDemo.Squeeze("--------India is a good country-------");
//            System.out.println("After Sqeezing String is : "+str2);
//
//            //Q.6
//            String str3=StringDemo.lTrim("-------India is a good country------");
//            System.out.println("After leftside Trimming String is :"+str3);
//
//            //Q.7
//            String str4=StringDemo.rTrim("-------India is a good country------");
//            System.out.println("After rightside Trimming String is :"+str4);
//
//            //Q.8
//            String str5=StringDemo.allTrim("-------India is a good country------");
//            System.out.println("After full Trimming String is :"+str5);
//
//            //Q.10
//            int vcount=StringDemo.vowelcount("abnuoilgfte");
//            System.out.println("Total num of vowels are :" +vcount);
//
//            //Q.11
//            int l=StringDemo.length("Bufferedreader");
//
//            System.out.println("lenghth of string is :"+l);
//
//            //Q.16
//            StringDemo.sortedorder("akhgtrdliuy");
//
//            //Q.17
//
//            String strs=StringDemo.SortedWord("Rajesh Dinesh Sachin Amit");
//            System.out.println("Sorted words in a String are : "+ strs);
//
//            //Q.18
//            boolean bln=StringDemo.find("Welcome to the world of glamour","world");
//            if(bln==true)
//                System.out.println("word found in another string");
//            else
//                System.out.println("Word not fount in the string");
//
//            //Q.19
//
//            String sta=StringDemo.replace("i like my country","like","love");
//            System.out.println("After replacement the new String is :" + sta);
//
//            //Q.25
//            int c=StringDemo.compare("hello","hello world");
//            System.out.println("After comparing matching count is :" + c);
//
//            //Q.26
//            StringDemo.wordfrequencycount("hello world hello country world hello");
//
//
//            StringDemo sd=new StringDemo();
//
//            //Q.29
//            sd.printnonrepeatingFirstChar("hhheelooog");
//            //Q.30
//            sd.reverseeachword("Amit sachin Dinesh");
//            //Q.31
//            sd.printAllWordsInReverse("Amit Sachin Dinesh");
//
//            //Q.27
//            int exp=sd.expression("10+20+20+20");
//            System.out.println("output of the expression is :"+ exp);
//
//            //Q.28
//            int bd=sd.BinaryToDecimal("10101010");
//            System.out.println("Binary to Decimal value is :"+ bd);
//
//            //Q.12
//            StringDemo.sequencecount("nniittiiin");
//
//            //Q.24
//            StringDemo.triangle4("ducat");
//
//
//        }
//
//    }
//
//}
