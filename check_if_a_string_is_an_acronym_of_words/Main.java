package check_if_a_string_is_an_acronym_of_words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("alice","bob","charlie"));
        String s = "abc";
        Solution l = new Solution();
        System.out.println(l.isAcronym(words,s));
    }
}
