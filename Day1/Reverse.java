import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int q = 0;
        while (num > 0) {
            int r = num % 10;
            System.out.print(r);
            q = num / 10;
            num=q;

        }

    }
}
