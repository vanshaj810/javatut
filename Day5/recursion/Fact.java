import java.util.Scanner;

public class Fact {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int facto = factorial(num);
        System.out.println(facto);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int facto = factorial(n - 1);
        int fact1 = n * facto;
        return fact1;
    }
}
