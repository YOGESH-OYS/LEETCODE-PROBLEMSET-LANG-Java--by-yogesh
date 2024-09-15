package check_if_a_string_is_an_acronym_of_words;

import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String a = "";
        for (int i = 0; i < words.size() ; i++) {
            a = a.concat(String.valueOf(words.get(i).charAt(0)));
        }
        if (s.equals(a)) {
            return true;
        }
        return false;
    }
}
