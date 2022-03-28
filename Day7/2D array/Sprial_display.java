import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int lr = sc.nextInt();
        int lc = sc.nextInt();
        int[][] mat = new int[lr][lc];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int row_min = 0;
        int column_min = 0;
        int row_max = lr - 1;
        int column_max = lc - 1;
        int count = 0;
        while (count < lr * lc) {
            // LEFT WALL
            for (int r = row_min; r <= row_max && count < lr * lc; r++) {
                System.out.println(mat[r][column_min]);
                count++;
            }
            // BOTTOM WALL
            for (int c = column_min + 1; c <= column_max && count < lr * lc; c++) {
                System.out.println(mat[row_max][c]);
                count++;
            }
            // RIGHT WALL
            for (int r = row_max - 1; r >= row_min && count < lr * lc; r--) {
                System.out.println(mat[r][column_max]);
                count++;
            }
            // TOP WALL
            for (int c = column_max - 1; c >= column_min + 1 && count < lr * lc; c--) {
                System.out.println(mat[row_min][c]);
                count++;
            }
            row_min++;
            row_max--;
            column_min++;
            column_max--;
        }

    }

}
