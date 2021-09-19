class MinStack {
​
    /** initialize your data structure here. */
    Stack<int[]> stack = new Stack<>();
    
    public MinStack() {
        if(!stack.isEmpty()) {
            stack.clear();
        }    
    }
    
    public void push(int x) {
        if(stack.isEmpty()) {
            stack.push(new int[]{x, x});
        }else{
            stack.push(new int[]{x, Math.min(x, stack.peek()[1])});
        }
    }
    
    public void pop() {
        if(!stack.isEmpty())
            stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty())
            return -1;
        return stack.peek()[0];
    }
    
    public int getMin() {
        if(stack.isEmpty())
            return -1;
        return stack.peek()[1];
        
        
    }
}
​
