package practicejdk8.com.array;

public class InterviewArraysQuestions {

    public static void sortArrayAssending(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print("\t" + a[k]);
        }

    }

    public static void sortArrayDecending(int[] a){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\n");
        for (int k=0;k<a.length;k++){
            System.out.print("\t"+a[k]);
        }
    }

    public static void maxArray(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
           if(max<=a[i]){
               max=a[i];
           }
        }
        System.out.println(max);
    }

    public static void minArray(int[] a){
        int min =a[0];
        for(int i=0;i<a.length;i++){
            if(min>=a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 1, 2, 0, 44, 22, 11, 4, 34, 5};
//        sortArrayAssending(a);
//        sortArrayDecending(a);
        maxArray(a);
        minArray(a);
    }

}
