import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int index = 0; index < arr1.length; index++) {
            arr1[index] = sc.nextInt();
        }

        int[] arr2 = new int[n2];
        for (int index = 0; index < arr2.length; index++) {
            arr2[index] = sc.nextInt();
        }
        int[] diff = new int[n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int c = 0;
        while (k >= 0) {
            int dig = 0;
            int alv = i >= 0 ? arr1[i] : 0;
            if (arr2[j] >= alv) {
                dig = arr2[j] + c - alv;
                c = 0;
            } else {
                dig = arr2[j] + c + 10 - alv;
                c = -1;
            }
            diff[k] = dig;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index < diff.length) {
            if (diff[index] == 0) {
                index++;
            } else {
                break;
            }
        }
        while (index < diff.length) {
            System.out.println(diff[index]);
            index++;
        }
    }
}
