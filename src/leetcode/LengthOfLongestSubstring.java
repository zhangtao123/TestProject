/*
package src.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap();
        int n;
        int maxLen = 0;
        int currentLen;
        if (s != null && (n = s.length()) > 0) {
            for (int i = 0; i < n; i++) {
                if (map.containsKey(s.charAt(i))) {
                    currentLen = map.size();
                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                    }
                    map.put(s.charAt(i), i);
                }
            }
            if (str.size() > maxLen) {
                maxLen = str.size();
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("dvddfgk"));
    }
}
*/
