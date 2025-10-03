class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int n = s.length();
        int maxLen = 0;
        int maxCount = 0;
        int[] freq = new int[26];
        for(int right = 0; right < n; right++){
            freq[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);
            if(right - left + 1 - maxCount > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}