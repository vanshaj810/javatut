import java.util.*;
import java.io.*;

public class PrintAllPermutations {
    public static void solution(String str) {
        // write your code here
        int length = str.length();
        int fact = isFactorial(length);
        for (int i = 0; i < fact; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for (int j = length; j >= 1; j--) {
                int q = temp / j;
                int rem = temp % j;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp = q;
            }
            System.out.println();
        }
    }

    public static int isFactorial(int len) {
        int val = 1;
        for (int i = 2; i <= len; i++) {
            val *= i;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
