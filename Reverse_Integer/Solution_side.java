package Reverse_Integer;

class Solution {
    long re = 0;
    public int reverse(int xp) {
        int j = -2147483648;
        int k = 2147483647;

        boolean isneg = xp<0;
        if(isneg){ xp=-xp;}

        while (xp > 0) {
            int d = xp % 10;
            re = re * 10 + d;
            if (re < j || re > k) {
                return 0;
            }
            xp = Math.floorDiv(xp, 10);
        }
        if (isneg) { re = -re;}

        return (int)re;
    }
}
