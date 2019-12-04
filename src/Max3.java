import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("네 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : "); int a = stdIn.nextInt();
        System.out.println("b의 값 : "); int b = stdIn.nextInt();
        System.out.println("c의 값 : "); int c = stdIn.nextInt();
        System.out.println("d의 값 : "); int d = stdIn.nextInt();

        System.out.println("값은 "+ min3(a,b,c) + "입니다.");

    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if( max < b) max = b;
        if( max < c) max = c;
        if( max < d) max = d;

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if( min > b) min = b;
        if( min > c) min = c;

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if( min > b) min = b;
        if( min > c) min = c;
        if( min > d) min = d;

        return min;
    }
}
