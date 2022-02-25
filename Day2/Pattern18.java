import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
         // write ur code here
            int n=scn.nextInt();
            int star=n;
            int sp=0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= star; j++) {
                    
                    if (i>1 && i<=n/2 && j>1 && j<star) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                }
                System.out.println();
                if (i<=n/2) {
                    sp++;
                    star-=2;
                } else {
                    sp--;
                    star+=2;
                    
                }
            }
     }
}
