import java.util.Scanner;

public class Findele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        int ele=sc.nextInt();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==ele) {
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
