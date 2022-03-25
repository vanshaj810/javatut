import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc=new Scanner(System.in);
    int nor=sc.nextInt();
    int noc=sc.nextInt();
    int[][] mat=new int[nor][noc];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        mat[i][j]=sc.nextInt();
      }
    }
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
   }
  }