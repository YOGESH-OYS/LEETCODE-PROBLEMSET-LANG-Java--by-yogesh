package Longest_Common_prefix;


class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        int whole_str_len = strs.length;
        int str_len = strs[0].length();
        for (int j = 0 ; j < whole_str_len  ; j++){
            str_len = Math.min(str_len,strs[j].length());
            if (strs[j].isEmpty()) {
                return "";
            }
        }
        StringBuilder result = new StringBuilder();
        loop:
        for (int i = 0; i < str_len; i++) {
            char currentChar = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    break loop;
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}

