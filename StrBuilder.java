public class StrBuilder {
    public static void main(String[] args) {
        // STRING BUILDER IS A DYNAMIC STRING MEANS WE CAN SET ADD INSERT CH ON A STRING
        // AT ANY TIME
        StringBuilder sb = new StringBuilder("hello world!");
        System.out.println(sb);
        // to add char in a StringBuilder's string
        sb.insert(2, 'y');
        System.out.println(sb);
        // charat function in StringBuilder
        char ch = sb.charAt(0);
        System.out.println(ch);
        // to set char in a StringBuilder's string
        sb.setCharAt(0, 'd');
        // to remove char in a StringBuilder's string
        sb.deleteCharAt(2);
        // to add char in the end in StringBuilder
        sb.append('g');
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
