import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int onum1 = num1;
        int onum2 = num2;
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (onum1 * onum2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}
