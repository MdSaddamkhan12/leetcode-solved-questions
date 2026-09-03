class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        // stack stores the indices
        Stack<Integer> stack = new Stack<>();

        int[] days = new int[n];

        for(int i = 0; i < n; i++){
            
            // Keep removing indices from the stack while today's temperature
            // is warmer than the temperature at the index on top of the stack.
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                
                // Remove the previous day whose next warmer temperature is today.
                int previousIndex = stack.pop();
                // Calculate how many days we had to wait for a warmer temperature.
                int day = i - previousIndex;
                // Store the number of days for that previous day.
                days[previousIndex] = day;
            }

            // Add today's index to the stack to find its next warmer temperature.
            stack.push(i);
        }

        return days;
        
    }
}