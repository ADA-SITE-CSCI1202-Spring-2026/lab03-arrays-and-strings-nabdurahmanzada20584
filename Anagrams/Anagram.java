package Anagrams;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return Sort(s1).equals(Sort(s2));
    }

    public static String Sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2) ? "Anagrams" : "Not Anagrams");
    }
}
