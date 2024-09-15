package Transpose;

class Solution {
    public int[][] transpose(int[][] a) {
        int r = a.length;
        int b = a[0].length;
        int[][] result = new int[b][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < b; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }
}
