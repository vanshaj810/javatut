import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        // write your code here  
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1; i*i <=num; i++) {
          System.out.println(i*i);
        }
       }
}
