import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String str = "try hello world";
        String[] words = str.split("\\s");

        for (String wo : words ){
            for(int i=0; i< wo.length(); i++) {
                if(i%2 == 0) {
                    String tmp = wo.substring(i,i+1).toUpperCase();
                }
                wo.substring(i-1,i);
            }
            System.out.println(wo);
        }
    }
}
