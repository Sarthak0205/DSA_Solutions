package stack;

import java.util.Stack;

public class PostFixEvaluation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (String ch:tokens) {
          if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                if (!stack.isEmpty()){
                    int b = stack.pop();
                    int a = stack.pop();
                    if (ch.equals("+")){
                        stack.push(a+b);
                    } else if (ch.equals("-")) {
                        stack.push(a-b);
                    } else if (ch.equals("*")) {
                        stack.push(a*b);
                    }
                    else {
                        stack.push(a/b);
                    }
                }
            }
          else stack.push(Integer.parseInt(ch));
        }
        return stack.peek();
    }
}
