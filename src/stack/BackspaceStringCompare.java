package stack;

import java.util.Stack;

public class BackspaceStringCompare {
    public static String processString(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='#'){
                if (!stack.isEmpty()) stack.pop();
            }
            else stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static boolean backspaceCompare(String s , String t){
        return (processString(s).equals(processString(t)));
    }

    static void main() {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }
}
