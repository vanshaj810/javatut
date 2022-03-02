import java.util.Scanner;

public class PrintDecreasing {
    public static void PrintDecrease(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PrintDecrease(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintDecrease(num);
    }
}