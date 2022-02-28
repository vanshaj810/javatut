import java.util.ArrayList;
import java.util.*;

public class RemovePrime {
    public static boolean isPrime(int value) {
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> al) {
        // write your code here
        for (int i = al.size() - 1; i >= 0; i--) {
            int value = al.get(i);
            if (isPrime(value) == true) {
                al.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
}
