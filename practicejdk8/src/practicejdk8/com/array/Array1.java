//package practicejdk8.com.array;
//
//public class Array1 {
//
//
//    static void b2d(int x[][]) {
//        int i, j, k, l, sum = 0;
//        //k=x.length;
//        //z=new int[k];
//        System.out.println("\nthe normal binary form array is");
//        for (i = 0; i < x.length; i++) {
//            System.out.print("  " + x[i]);
//        }
//        for (i = 0; i < x.length - 1; i++) {
//            if (x[i] == 0) {
//                //z[i]=0;
//                System.out.print("  " + 0);
//            } else {
//                sum = 0;
//                k = 0;
//                while (x[i] != 0) {
//                    l = x[i] % 10;
//                    sum += (2 ^ k) * l;
//                    x[i] = x[i] / 10;
//                    k++;
//                }
//                System.out.print("  " + sum);
//            }
//        }
//    }
//
//    public static void main(String... s) {
//        b2d(new int[][]{0, 10, 1, 101, 1100, 1110, 1011, 11});
//    }
//
//}
