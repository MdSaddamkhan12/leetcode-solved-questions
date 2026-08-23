class MyQueue {

    // for storing newly pushed elements
    Stack<Integer> stackIn;

    //for providing elements for pop() and peek().
    // The top of stackOut always represents the FRONT of the queue.
    Stack<Integer> stackOut;

    public MyQueue() {

        stackIn = new Stack<Integer>();
        stackOut = new Stack<Integer>();
        
    }
    /**
     * Adds an element to the end of the queue.
     *
     * We simply push the element into stackIn.
     * We don't move elements to stackOut here because insertion
     * can be handled directly by stackIn.
     */
    public void push(int x) {

        stackIn.push(x);
        
    }
    
    /**
     * Removes and returns the element at the front of the queue.
     *
     * If stackOut is empty, transfer all elements from stackIn
     * to stackOut. This reverses their order and makes the
     * oldest element available at the top of stackOut.
     */
    public int pop() {

        moveIfNeeded();
        return stackOut.pop();
        
    }

    /**
     * Returns the element at the front of the queue
     * without removing it.
     *
     * Make sure stackOut contains the front element first.
     */
    public int peek() {

        moveIfNeeded();
        return stackOut.peek();
        
    }
    
    /**
     * Returns true when both stacks are empty.
     *
     * If either stack contains an element, the queue is not empty.
     */
    public boolean empty() {
        
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    /**
     * Transfers elements from stackIn to stackOut only when
     * stackOut is empty.
    **/
    private void moveIfNeeded(){

        if(stackOut.isEmpty()){

           while(!stackIn.isEmpty()){

            stackOut.push(stackIn.pop());

            }
        }

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */