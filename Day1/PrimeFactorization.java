import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        // write your code here  
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int div = 2; div*div <=num; div++) {
          while ( num%div==0 ) {
            num/=div;
          System.out.print(div+" ");
          }
        }
        if (num!=1) {
            System.out.print(num);
          }
       }
}
