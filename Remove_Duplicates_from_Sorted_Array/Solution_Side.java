package Remove_Duplicates_from_Sorted_Array;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int removeDuplicates(int[] a) {
        ArrayList<Integer> d = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                d.add(0);
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int l = i+1; l < a.length; l++) {
                if (a[i] == a[l]) {
                    a[l] = 0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                d.add(a[i]);
            }
        }
        Collections.sort(d);
        for (int i = 0; i < a.length; i++) {
            if (i < d.size()) {
                a[i] = d.get(i);
            }
            else { a[i] = 0; }
        }
        return d.size();
    }
}
