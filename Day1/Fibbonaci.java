import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        int one = 0;
        int two = 1;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println(one + " ");
        System.out.println(two + " ");
        for (int i = 0; i < n; i++) {
            c = one + two;
            one = two;
            two = c;
            System.out.println(c);
        }

    }
}
