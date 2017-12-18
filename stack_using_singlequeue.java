class MyStack {

//one Queue solution
private Queue<Integer> q = new LinkedList<Integer>();

// Push element x onto stack.
public void push(int x) {
    q.add(x);
    for(int i = 1; i < q.size(); i ++) { //rotate the queue to make the tail be the head
        q.add(q.remove());
    }
}

// Removes the element on top of the stack.
public int pop() {
    return q.remove();
}

// Get the top element.
public int top() {
    return q.peek();        
}

// Return whether the stack is empty.
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
