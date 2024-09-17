package Remove_Element;

class Solution {
    public int removeElement(int[] a, int val) {
        int c = 0,C = 0;
        Solution p = new Solution();
        if (val == 0) {
            p.moveZeroes(a);
            for (int i = 0; i < a.length; i++) {
                if (a[i] != 0) {
                    c++;
                }
            }
        }
        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == val) {
                    a[i] = 0;
                    C++;
                }
            }
            c = a.length-C;
            p.moveZeroes(a);
        }
        return c;
    }
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i+1 ; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int  t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                        break;
                    }
                }
            }
        }
    }
}
