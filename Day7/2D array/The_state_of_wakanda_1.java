import java.io.*;
import java.util.*;

public class Main{
   public static void display(int mat[][]){
      for(int col = 0 ; col < mat[0].length ; col++){
        if (col%2==0) {
          for(int row = 0 ; row < mat.length ; row++){
          System.out.println(mat[row][col]);
        }
        } else {
         for(int row = mat.length-1 ; row >= 0 ; row--){
          System.out.println(mat[row][col]);
        } 
        }
      }
    }
     public static void input(int mat[][], Scanner scn){
      for(int r = 0 ; r < mat.length ; r++){
        for(int c = 0 ; c < mat[0].length ; c++){
          mat[r][c] = scn.nextInt();
        }
      }
    }

public static void main(String[] args) throws Exception {
    // write your code here
     Scanner scn = new Scanner(System.in);
        int nr1 = scn.nextInt();
        int nc1 = scn.nextInt();
        int mat1[][] = new int[nr1][nc1];
        input(mat1,scn);
        display(mat1);
 }

}