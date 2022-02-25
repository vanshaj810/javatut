import java.util.Scanner;

public class Gradingsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student");
        int marks = sc.nextInt();
        System.out.println("The marks of the student is " + marks);
        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("good");
        } else if (marks > 70) {
            System.out.println("fair");
        } else if (marks > 60) {
            System.out.println("meets epectations");
        } else {
            System.out.println("below par");
        }
    }
}
