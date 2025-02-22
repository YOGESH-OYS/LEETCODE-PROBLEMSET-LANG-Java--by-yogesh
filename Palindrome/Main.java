package Palindrome;

public class Main {
    public static void main(String[] args) {
        int x = 101;
        Solution hj = new Solution();
        System.out.println(hj.isPalindrome(x));
        int s = hj.Helper(x,0);
        System.out.println(s);
    }
}
