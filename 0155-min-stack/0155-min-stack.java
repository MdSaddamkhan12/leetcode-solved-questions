class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {

        stack = new Stack<>();
        minStack = new Stack<>();
        
    }
    
    public void push(int value) {

        // Push the value into the normal stack
        stack.push(value);

        // Store the minimum value seen so far
        if(minStack.isEmpty()){

            minStack.push(value);
    
        }else{
            minStack.push(Math.min(value, minStack.peek())); // take the value from both the stack and push min in minStack
        }
        
    }
    
    public void pop() {

        // Both stacks must remain synchronized
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        
        return stack.peek();
        
    }
    
    public int getMin() {

        return minStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */