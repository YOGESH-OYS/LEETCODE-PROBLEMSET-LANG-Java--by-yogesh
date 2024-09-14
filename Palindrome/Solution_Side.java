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
}
