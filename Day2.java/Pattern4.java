import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=0;
        int star=n;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            sp++;
            star--;
            System.out.println();
        }
    }   
}
