class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;

        // Store indices of elements waiting for their
        // next greater element.
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[n];
        // Initially assume every element has no greater element, fill wiht -1
        Arrays.fill(result, -1);

        // Traverse the array twice to handle circular nature.
        for(int i = 0; i < 2 * n; i++){

            // Convert virtual index into actual array index.
            int currentIndex = i % n;

            // Current element is a possible next greater
            // element for elements waiting in the stack.
            while(!stack.isEmpty() && nums[currentIndex] > nums[stack.peek()]){

                int index = stack.pop();
                result[index] = nums[currentIndex];
            }

            // Only push indices during the first pass.
            //
            // Why?
            // The second pass is only used to find answers
            // for elements from the first pass.
            if(i < n){

                stack.push(i);
            }
            
        }
        return result;
    }
}