package stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> mainStack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public MinStack() {

    }

    public void push(int value) {
        mainStack.push(value);
        if(minStack.isEmpty())
            minStack.push(value);
        else
            minStack.push(Math.min(value,minStack.peek()));
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
return  mainStack.peek();
    }

    public int getMin() {
       return minStack.peek();
    }
}
