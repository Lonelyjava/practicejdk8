package practicejdk8.com.array;

public class LcmArray {

    public static void lcm(int x[]) {
        int i, j, k, count, pro = 1;
        int largest = x[0];
        for (i = 0; i < x.length; i++) {
            if (largest <= x[i]) {
                largest = x[i];
            }
        }
        System.out.println(largest);
        for (i = 2; i <= largest; i++) {
            count = 0;
            for (j = 0; j < x.length; j++) {
                if (x[j] % i == 0) {
                    x[j] = x[j] / i;
                    count++;
                }
            }
            if (count > 0) {
                pro = pro * i;
                i--;
            }
        }
		/*for(i=0;i<x.length;i++)
		{
			pro=pro*x[i];
		}*/
        System.out.println("their lcm will be :" + pro);
    }
    public static void main(String... s) {
        lcm(new int[]{12, 36, 18, 10});
    }
}
