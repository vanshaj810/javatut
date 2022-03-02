import java.util.Scanner;

public class Zigzag {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pzz(num);
    }

    public static void pzz(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
    }
}
