import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10);

        int [] height = new int[num];

        for (int i=0; i< height.length; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println(height[i]);
        }


    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int [] a) {
        for (int i=0; i < a.length; i++) {
            swap(a, i ,a.length-i-1);
        }
    }
}
