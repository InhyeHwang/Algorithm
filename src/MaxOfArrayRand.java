import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10);

        int [] height = new int[num];

        for (int i=0; i< height.length; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println(height[i]);
        }

        System.out.println("최대값은 "+ maxOf(height));
    }

    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i <a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
