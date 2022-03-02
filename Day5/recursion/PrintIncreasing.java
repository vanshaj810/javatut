import java.util.Scanner;

public class PrintIncreasing {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    printincrease(num);
}

private static void printincrease(int num) {
    if (num==0) {
        return;
    }
    printincrease(num-1);
    System.out.println(num);
}
}
