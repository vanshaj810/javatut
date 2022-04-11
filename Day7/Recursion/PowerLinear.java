import java.io.*;
import java.util.*;

public class PowerLinear {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int poww = power(x, n);
        System.out.println(poww);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int poww = power(x, n - 1);
        int pow2 = x * poww;
        return pow2;
    }
}
