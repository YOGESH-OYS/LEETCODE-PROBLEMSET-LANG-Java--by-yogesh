package Palindrome;

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while (x > 0) {
            int quo = x % 10;
            rev = rev * 10 + quo;
            x = Math.floorDiv(x, 10);
        }
        return rev==temp;
    }
    public boolean isPalin(int x) {
        if(x < 0){ return false; }
        return x == Helper(x,0);
    }
    public int Helper(int x,int sum){
        if (x == 0){
            return sum;
        }
        sum = sum*10 + x%10;
        return Helper(x/10,sum);
    }
}
