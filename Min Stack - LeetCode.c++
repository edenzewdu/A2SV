class StackNode{
    public:
    int val;
    int minval;
    
    StackNode(int x, int min): val(x), minval(min) {};
    
};

class MinStack {
public:
    /** initialize your data structure here. */
    
    stack<StackNode> customstack;
    int minval;
    
    MinStack() {
        minval = INT_MAX;
    }
    
    void push(int x) {
        StackNode node(x, minval);
        customstack.push(node);
        if(x < minval) minval = x;
    }
    
    void pop() {
        StackNode tops = customstack.top();
        if(tops.val == minval) minval = tops.minval;
        
        customstack.pop();
    }
    
    int top() {
        StackNode tops = customstack.top();
        return tops.val;
    }
    
    int getMin() {
        return minval;
    }
};