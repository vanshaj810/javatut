import java.util.Scanner;

public class Pythagorus {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if ((num2 > num1 && num2 > num3)) {
            max = num2;
        } else {
            max = num3;
        }
        if (max == num1) {
            boolean flag = ((num2 * num2) + (num3 * num3) == (num1 * num1));
            System.out.println(flag);

        } else if (max == num2) {
            boolean flag = ((num1 * num1) + (num3 * num3) == (num2 * num2));
            System.out.println(flag);
        } else {
            boolean flag = ((num2 * num2) + (num1 * num1) == (num3 * num3));
            System.out.println(flag);
        }
    }
}
