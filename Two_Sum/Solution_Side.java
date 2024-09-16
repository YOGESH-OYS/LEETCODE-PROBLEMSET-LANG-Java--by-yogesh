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
}

