import java.io.*;
import java.util.*;
public class Factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
       if (n == 1) {
            return 1;
        }
        int facto = factorial(n - 1);
        int fact1 = n * facto;
        return fact1;
    }
}
