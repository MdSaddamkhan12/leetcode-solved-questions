class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;

        Stack<Integer> stack = new Stack<>();

        // to store the element from nums2 and its next greater element
        Map<Integer, Integer> nextGreater = new HashMap<>();

        int[] result = new int[n];

        // Traverse the nums2 array
        for(int num : nums2){

            // Pop elements smaller than current, they found their next greater
            //<popped value, NGE(coming value)>
            while(!stack.isEmpty() && num > stack.peek()){
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);

        }
        // Build result by looking up each nums1 element in the map
        for(int i = 0; i < n; i++){

            result[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        return result;
        
    }
}