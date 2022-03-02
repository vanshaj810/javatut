import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int val : arr) {
            System.out.println(val);
        }

    }
}