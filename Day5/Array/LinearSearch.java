import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int search=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (search==arr[i]) {
                System.out.println("Index of "+search+" is "+i);
                break;
            }
        }
    }
}
