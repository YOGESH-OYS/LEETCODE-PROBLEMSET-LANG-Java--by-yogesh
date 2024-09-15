package Transpose;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = 2;
        int col = 3;
        int[][] a = {{1,2,3},{4,5,6}} ;
        Solution l = new Solution();
        System.out.println(Arrays.deepToString(l.transpose(a)));
    }
}
