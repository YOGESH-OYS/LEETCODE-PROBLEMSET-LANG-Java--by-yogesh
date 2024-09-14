package Two_Sum_01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a ={2,7,11,15};
        int b = 13;
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.twoSum(a,b)));
    }
}
