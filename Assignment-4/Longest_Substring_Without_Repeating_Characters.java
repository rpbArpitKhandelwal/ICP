import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l= 0;
        Map<Character, Integer> c = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            c.put(ch, c.getOrDefault(ch, 0) + 1);
            
            while (c.get(ch) > 1) {
                char leftChar = s.charAt(l);
                c.put(leftChar, c.get(leftChar) - 1);
                l++;
            }
            
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}