package practicejdk8.com.string;
/*
    outPut :
    2111
    nuda

    */
public class StrignFrequencyCount {

    static void frequencycount(String s) {
        char ch[] = s.toCharArray();
        char ch1[];
        ch1 = new char[ch.length];
        ch1[0] = ch[0];
        int flag = 0;
        int count = 0;
        char ch2[] = new char[ch.length];
        int freq[] = new int[20];
        for (int i = 0; i < ch.length; i++) {
            flag = 0;
            for (int j = 0; j <= count; j++) {
                if (ch1[j] == ch[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                ch1[count++] = ch[i];
        }
        int freq1 = 0;
        int count1 = 0;
        for (int i = 0; i < count; i++) {
            freq1 = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch1[i] == ch[j])
                    freq1++;
            }
            ch2[i] = ch1[i];
            freq[count1] = freq1;
            count1 = count1 + 1;
        }
        int Temp = 0;
        char Temp1 = 'a';
        for (int i = 0; i < ch2.length - 1; i++) {
            for (int j = i + 1; j < ch2.length; j++) {
                if (freq[i] < freq[j]) {
                    Temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = Temp;

                    Temp1 = ch2[i];
                    ch2[i] = ch2[j];
                    ch2[j] = Temp1;
                }
            }
        }
        System.out.println("Frequencywise order is:");
        for (int i = 0; i < count; i++) {
            System.out.print(freq[i]);
        }
        System.out.println("");
        for (int i = 0; i < count; i++) {
            System.out.print(ch2[i]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        frequencycount("kundan");
    }
}
