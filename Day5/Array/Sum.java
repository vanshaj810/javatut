import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int index = 0; index < arr1.length; index++) {
            arr1[index] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int index = 0; index < arr2.length; index++) {
            arr2[index] = sc.nextInt();
        }
        int[] sum=new int[n1>n2?n1:n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;
        int c=0;
        while (k>=0) {
            int dig=c;
            if (i>=0) {
                dig+=arr1[i];
            }
            if (j>=0) {
                dig+=arr2[j];
            }
            c=dig/10;
            dig%=10;
            sum[k]=dig;
            i--;
            j--;
            k--;

        }
        if (c!=0) {
            System.out.println(c);
        }
        for (int l : sum) {
            System.out.println(l);
        }

    }
}
