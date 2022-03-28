// EXIT POINT OF A MATRIX CODE
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int lr=sc.nextInt();
        int lc=sc.nextInt();
        int[][] mat=new int[lr][lc];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        int direction=0;
        int east=0;
        int south=1;
        int west=2;
        int north=3;
        int row=0,column=0;
        while (row>=0 && row<lr && column>=0 && column<lc ) {
        direction=(direction+mat[row][column])%4;
        if (direction==0) {
            column+=1;
        } else if(direction==1){
            row+=1;
        }else if(direction==2){
            column-=1;
        }else{
            row-=1;
        } 
        }
         if (direction==0) {
            column-=1;
        } else if(direction==1){
            row-=1;
        }else if(direction==2){
            column+=1;
        }else{
            row+=1;
        } 
       System.out.println(row);
       System.out.println(column);
    }

}