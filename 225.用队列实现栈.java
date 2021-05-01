/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {

    private LinkedList<Integer> linkedList;
    /** Initialize your data structure here. */
    public MyStack() {
        linkedList = new LinkedList();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        linkedList.offerLast(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return linkedList.pollLast();
    }
    
    /** Get the top element. */
    public int top() {
        return linkedList.peekLast();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return linkedList.size() == 0;
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
// @lc code=end

