import java.util.Scanner;

public class FindEle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int limit=scn.nextInt();
        int[] arr=new int[limit];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        int num=scn.nextInt();
        int idx=-1;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                idx=i;
                break;
            }
            
        }
        System.out.println(idx);
    }
}
