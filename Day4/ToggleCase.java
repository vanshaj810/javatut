import java.util.Scanner;

public class ToggleCase {
    public static String toggle(String s) {
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
            if (ch>='a' && ch<='z') {
               char uch=(char)('A'+ch-'a'); 
               sb.setCharAt(i, uch);
            }
            else{
                char lch=(char)('a'+ch-'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(toggle(str));
    }
}
