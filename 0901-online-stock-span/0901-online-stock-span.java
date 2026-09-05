class StockSpanner {


    Stack<int[]> stack;
    public StockSpanner() {

        stack = new Stack<>();
        
    }
    
    public int next(int price) {

        int span = 1;
        // Keep removing previous prices that are smaller than or equal to the current price.
        // Their spans can be added to the current span because the current price
        // is greater than or equal to all prices covered by those entries.
        while(!stack.isEmpty() && price >= stack.peek()[0]){

            // Add the span of the popped price to the current span.
            span += stack.pop()[1];
        }
        // Store the current price along with its calculated span.
        stack.push(new int[]{price, span});

        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */