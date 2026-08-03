class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int maxLen = 0;

         // HashMap to track count of each fruit in current window
        Map<Integer, Integer> basket = new HashMap<>();

        int left = 0;

        // Traverse the fruits array using right pointer
        for(int right = 0; right < n; right++){

            // Include current fruit in the basket
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // If more than 2 fruit types, shrink window from left
            while(basket.size() > 2){

                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if(basket.get(fruits[left]) == 0){

                    basket.remove(fruits[left]);
                }
                left++;
            }
            // Update maximum valid window length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}