import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array1 insertion
        int limit1 = sc.nextInt();
        int[] arr1 = new int[limit1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // array2 insertion
        int limit2 = sc.nextInt();
        int[] arr2 = new int[limit2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int limit3 = 0;
        if (arr1.length > arr2.length) {
            limit3 = arr1.length;
        } else {
            limit3 = arr2.length;
        }
        int[] sum = new int[limit3];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        int carry = 0;
        while (k >= 0) {
            int digit = c;
            if (i >= 0) {
                digit = digit + arr1[i];
            }
            if (j >= 0) {
                digit = digit + arr1[j];
            }
            carry = digit / 10;
            digit = digit % 10;
            sum[k] = digit;
            i--;
            j--;
            k--;

        }
        if (carry != 0) {

            System.out.println(carry);
        }
        for (int val : sum) {

            System.out.println(val);
        }

    }
}
