import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=1;
        int star=(n/2)+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
             System.out.print("*\t");   
            }
            if (i<=n/2) {
                star--;
                sp+=2;
            } else {
                
                star++;
                sp-=2;
                
            }
            System.out.println();
        }
    }
}
