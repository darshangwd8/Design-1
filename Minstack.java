//Time Complexity :O(1)
//Space Complexity :O(n) 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : N/A

class MinStack {                                      // This stack uses less interaction with minstack, new minimum
    //int min;
    Stack<Integer> PrimaryStack; 
    Stack<Integer> Minst;

    public MinStack() {
        this.PrimaryStack = new Stack<>();
        this.Minst = new Stack<>();
        // min = Integer.MAX_VALUE;
        Minst.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        //min = Math.min(val, min);
        PrimaryStack.push(val);
        //Minst.push(min);
        if (val < Minst.peek())   
            Minst.push(val);
        else
            Minst.push(Minst.peek());
    }

    public void pop() {
        PrimaryStack.pop(); 
        Minst.pop();
        //min = Minst.peek();
    }

    public int top() {
        return PrimaryStack.peek();
    }

    public int getMin() {
        return Minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
