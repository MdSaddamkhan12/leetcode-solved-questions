class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int left = 0;

        int maxLength = 0;
        int zeroes = 0;

        // Right pointer expands the window
        for(int right = 0; right < n; right++){

            // If element is zero, increase the zero count
            if(nums[right] == 0){

                zeroes++;
            }
            // If zero count exceeds k, shrink the window from left
            while(zeroes > k){

                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
            // Update the max length of the valid window
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
        
    }
}