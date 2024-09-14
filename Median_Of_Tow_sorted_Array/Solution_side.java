package Median_Of_Tow_sorted_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int a2 = nums2.length;
        int a3 = a1 + a2;
        int[] c = new int[a3];
        System.arraycopy(nums1,0,c,0,a1);
        System.arraycopy(nums2,0,c,a1,a2);
        Arrays.sort(c);
        boolean isodd = a3%2 != 0;
        float a5 ;
        if (isodd) {
            a5 = Array.getInt(c, a3/2);
        }
        else {
            float a8 =Array.getInt(c,a3/2);
            float a9 =Array.getInt(c,(a3/2)-1);
            a5 = (a8 + a9)/2;
        }
        return a5;
    }
}
