import java.util.Scanner;

public class FirstindexOccurence {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x=sc.nextInt();
        int first = firstIndex(arr, 0,x);
        System.out.println(first);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        return 0;
    }
}
