import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int val=0;
        int b=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val+"\t");
                int c=val+b;
            val=b;
            b=c;
            }
            System.out.println();
            
        }

    }
}
