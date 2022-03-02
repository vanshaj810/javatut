import java.io.*;
import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            int temp = i;
            String set = "";
            for (int j = arr.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp /= 2;
                if (rem == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;

                }
            }
            System.out.println(set);
        }
    }
}
