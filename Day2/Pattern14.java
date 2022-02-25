import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        // write ur code here
        for(int i=1;i<=10;i++)  
      {
          int ans=num*i;
    System.out.println(num+" * "+i+" = "+ans );
      }
    }
}
