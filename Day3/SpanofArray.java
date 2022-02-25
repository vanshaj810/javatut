import java.util.Scanner;

public class SpanofArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int limit = scn.nextInt();
        int[] arr = new int[limit];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}
