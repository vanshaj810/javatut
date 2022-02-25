import java.util.Scanner;

public class ArrayIntroduction {
    public static void addele(int[] arr1) {
        // INSERTAION OF ELEMENTS IN A ARRAY
        Scanner scn = new Scanner(System.in);
        System.out.println("Insertation of array elements");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
    }

    public static void printArr(int[] arr1) {
        // TO PRINT ARRAY ELEMENTS
        System.out.println("Printation of array elements");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
    public static void swapArr(int[] arr, int a, int b) {
        int c=arr[a];
       arr[a]=arr[b];
       arr[b]=c;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the limit of the Array: ");
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        addele(arr1);
        printArr(arr1);
        swapArr(arr1,0,2);
        System.out.println("After swapping elements");
        printArr(arr1);
    }
}
