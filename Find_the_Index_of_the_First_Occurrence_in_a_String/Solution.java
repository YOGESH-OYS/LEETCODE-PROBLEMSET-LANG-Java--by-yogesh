package Find_the_Index_of_the_First_Occurrence_in_a_String;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()){ return -1; }
        int i = 0;int j = i+needle.length();
        while (j <= haystack.length()){
            String sub = haystack.substring(i,j);
            if (sub.equals(needle)){
                return i;
            }
            i++;
            j = i+needle.length();
        }
        return -1;
    }
}
