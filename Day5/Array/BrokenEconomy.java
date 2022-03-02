import java.io.*;
import java.util.*;

public class BrokenEconomy {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        int no = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int floor = 0;
        int ceil = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (no < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];

            } else if (no > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
