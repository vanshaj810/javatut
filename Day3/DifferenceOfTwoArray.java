import java.util.Scanner;

public class DifferenceOfTwoArray {
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
        int limit3 = arr2.length;

        int[] sub = new int[limit3];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sub.length - 1;
        int carry = 0;
        while (k >= 0) {
            int digit = 0;
            int arr1val = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + carry >= arr1val) {
                digit = arr2[j] + carry - arr1val;
                carry = 0;
            } else {
                digit = arr2[j] + carry + 10 - arr1val;
                carry = -1;
            }
            sub[k] = digit;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index < sub.length) {
            if (sub[index] == 0) {
                index++;
            } else {
                break;
            }
        }
        while (index < sub.length) {
            System.out.println(sub[index]);
            index++;
        }
    }
}
