import java.util.Scanner;
import java.util.function.Function;

import javax.print.DocFlavor.STRING;

public class Strings {
    public static void main(String[] args) {
        
        // DECLARE A STRING
        String s1;
        // ASSIGN THE STRING
        s1="Hello world!";
        System.out.println(s1);
        // 2ND METHOD TO DECLARE AND ASSIGN A STRING 
        String s2="Vanshaj";
        System.out.println(s2);
        // HOW TO TAKE A INPUT OF STRING
        Scanner sc=new Scanner(System.in);
        // 1ST METHOD TO TAKE A INPUT OF A STRING
        // BY USING NEXT() IT IS TAKING ONLY 1 WORD AS A INPUT IT WILL STOP TAKING INPUT AFTER THE FIRST SPACE IN A SENTANCE. 
        String s3=sc.next();
        System.out.println(s3);
        // BY USING NEXTLINE() IT IS TAKING 1 SENTANCE AS A INPUT IT WILL NOT STOP TAKING INPUT AFTER THE FIRST SPACE IN A SENTANCE LIKE IT STOPPED WHEN WE ARE USING NEXT().
        String s4=sc.nextLine();
        System.out.println(s4);
        // LENGTH FUNCTION TO GET A LENGTH OF A STRING
        int len=s4.length();
        // CHAR AT FUNCTION OF STRING
        char ch=s4.charAt(4);
        for (int i = 0; i < s4.length(); i++) {
            char ch2=s4.charAt(i);
            System.out.println(ch2);
            
        }
        String s5="abcd";
        // SUBSTRING FUNCTION
        System.out.println(s1.substring(2, 4));
        for (int i = 0; i <= s5.length(); i++) {
            for (int j = i+1; j <s5.length(); j++) {
                System.out.println(s5.substring(i,j));
            }
        }
        // ADDING TWO STRING
        String s6=s5 + " "+ s1;
        System.out.println(s6);
        // SPLIT FUNCTION OF STRING
        System.out.println(s6.split(" "));
    }
}
