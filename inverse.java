import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        System.out.println("Enter the digit whose inverse you want: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int inv = 0;
        int op = 1;
        while (num != 0) {
            int od = num % 10;
            int ip = od;
            int id = op;
            inv = inv + id * (int) Math.pow(10, ip - 1);
            op++;
            num = num / 10;
        }
        System.out.println("the inverse of a number is : " + inv);
    }
}
