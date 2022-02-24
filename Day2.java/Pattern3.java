import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for (int i =1; i <=n; i++) {
            int sp=n-i;
            int str=i;
            for (int j =1; j <=sp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= str; k++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
    // Another method
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);

    //     // write ur code here
    //     int n=scn.nextInt();
        
    //     for (int i =1; i <=n; i++) {
    //         int sp=n-i;
    //         int str=i;
    //         for (int j = 1; j <=sp ; j++) {
    //             System.out.print("\t");
                
    //         }
    //          for (int j = 1; j <=str ; j++) {
    //             System.out.print("*\t");
                
    //         }
    //         sp--;
    //         str++;
    //         System.out.println();
            
    //     }

    // }
}
