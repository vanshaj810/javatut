import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit that you want to enter:");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
