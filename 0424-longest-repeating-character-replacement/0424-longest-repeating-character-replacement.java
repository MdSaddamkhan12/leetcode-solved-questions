class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();

        int maxFreq = 0;
        int maxLen = 0;
        // Array to count frequency of characters in window
        int[] freq = new int[26];

        int left = 0;
        // Traverse the string with right pointer
        for(int right = 0; right < n; right++){

            char ch = s.charAt(right);
             // Increment count of current character
            freq[ch - 'A']++;

            // Update max frequency in current window
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // If number of changes exceeds k, shrink window from left
            // windowSize = (right - left + 1)
            while((right - left + 1) - maxFreq > k){

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update result with valid window length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
        
    }
}