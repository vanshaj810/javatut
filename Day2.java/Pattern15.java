import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=n/2;
        int star=1;
        int val=1;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            int cval=val;
            for (int j = 1; j <= star; j++) {
                System.out.print(cval+"\t");
                if (j<=star/2) {
                    cval++;
                } else {
                    cval--;
                }
            }
            System.out.println();
            if (i<=n/2) {
                sp--;
                star+=2;
                val++;
            } else {
                val--;
                sp++;
                star-=2;
            }
        }

    }
}
