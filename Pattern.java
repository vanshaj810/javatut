import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val=1;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.println(val+"\t");
                if (j<=n/2 ) {
                    val+=3;
                }
                
            }
            val++;
            

            System.out.println();
        }
    }
}
