import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        System.out.println("Enter the number that you want to rotate: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("rotation digit");
        int k = sc.nextInt();
        int temp = num;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;

            } else {
                mul = mul * 10;
            }
        }
        int q = num / div;
        int r = num % div;
        int ro = r * mul + q;
        System.out.println(ro);

    }
}
