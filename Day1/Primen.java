import java.util.Scanner;

import javax.swing.text.html.FormView;

public class Primen {
    public static void main(String[] args) {
        System.out.println("Enter the value of low: ");
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        System.out.println("Enter the value of high");
        int high = sc.nextInt();
        System.out.println("The value of low is " + low + " and high value is " + high);

        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
        if (count==0) {
            System.out.println(i);
        }
        }
        
    }
        
}
