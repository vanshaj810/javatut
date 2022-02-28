import java.util.Scanner;

import javax.print.attribute.standard.Compression;

public class StrCompression {
    public static String compression1(String s) {
        String str = s.charAt(0) + "";
        for (int i = 1; i < s.length(); i++) {

            char CurrentCh = s.charAt(i);
            char PreviousCh = s.charAt(i - 1);
            if (CurrentCh != PreviousCh) {
                str += CurrentCh;

            }
        }

        return str;

    }

    public static String compression2(String s) {

        String str = s.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {

            char CurrentCh = s.charAt(i);
            char PreviousCh = s.charAt(i - 1);
            if (CurrentCh == PreviousCh) {
                count++;

            } else {
                if (count > 1) {
                    str += count;
                    count = 1;
                }

                str += CurrentCh;

            }
        }
        if (count > 1) {
            str += count;
            count = 1;
        }

        return str;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s1=compression1(str);
        String s2=compression2(str);
        System.out.println(s1);
        System.out.println(s2);
    }
}
