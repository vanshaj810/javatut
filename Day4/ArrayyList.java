import java.util.ArrayList;
import java.util.Scanner;

public class ArrayyList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // DECLARE ARRAYLIST
        ArrayList <Integer> al=new ArrayList<>();
        // PRINTING ARRAYLIST SIZE
        System.out.println(al+" , "+al.size());
        ArrayList<Integer> al2=new ArrayList<>();
        // ADDING ITEMS TO ARRAYLIST
        al.add(45);
        al.add(222);
        // ADD ITEMS AT SPECIFIC INDEX
        al.add(0,2100);
        for (int i = 0; i < 5; i++) {
            al.add(sc.nextInt());
        }
        System.out.println(al+" , "+al.size());
        // GET FUNCTION TO GET THE VALUE OF ARRAYLIST
        System.out.println(al.get(2));
        // SET FUNCTION TO GET THE VALUE OF ARRAYLIST
        al.set(1, 1000);
        System.out.println(al);
        // Remove FUNCTION TO GET THE VALUE OF ARRAYLIST
        al.remove(2);
        ArrayList<String> strl=new ArrayList<>();
        for (int val1 : al) {
            System.out.println(val1);
        }
    }
}
