package Two_Sum;

class Solution {
    public int[] twoSum(int[] numb, int target) {
        int[] fin = new int[2];
        for (int l = 0; l < numb.length; ++l) {
            int sum = numb[l];
            for ( int i=l+1 ; i< numb.length ; ++i){
                int sun = sum + numb[i];
                if (sun == target) {
                    fin = new int[]{l, i};
                    return fin;
                }
            }
        }
        return fin;
    }

    public int[] twoum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ;j++){
                int sum = nums[i] + nums[j];
                if(sum == target){ return new int[]{i,j}; }

            }
        }
        return new int[]{};
    }
}

