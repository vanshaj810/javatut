import java.util.Scanner;

public class Digitsofanum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nod = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        int div = (int) Math.pow(10, nod - 1);
        System.out.println(div);
        while (div != 0) {
            int q = num / div;
            System.out.println(q);
            num = num % div;
            div = div / 10;
        }
    }

}
