// using only one queue
class MyStack {

    Queue<Integer> q;
    public MyStack() {

        q = new LinkedList<>();
        
    }
    
    public void push(int x) {

        // add new element to queue
        q.add(x);

        // rotate the queue , Move all previous elements behind it
        int n = q.size() - 1;
        for(int i = 0; i < n; i++){

            q.add(q.poll());
        }
        
    }
    
    public int pop() {

        return q.poll();
        
    }
    
    public int top() {

        return q.peek();
        
    }
    
    public boolean empty() {

        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */