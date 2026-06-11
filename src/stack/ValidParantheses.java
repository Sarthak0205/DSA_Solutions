package stack;

import java.util.Stack;

public class ValidParantheses {
//    public static boolean isValid(String s){
//        while(true){
//            int oldLen=s.length();
//            if(s.contains("()")){
//               s= s.replace("()","");
//            }
//            if (s.contains("[]")){
//                s=s.replace("[]","");
//            }
//            if(s.contains("{}")){
//                s=s.replace("{}","");
//            }
//            int newLen=s.length();
//            if(newLen==oldLen) break;
//        }
//        return s.isEmpty();
//    }

    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                if (c==')' && stack.peek()=='('){
                    stack.pop();
                }
                else if(c==']' && stack.peek()=='['){
                    stack.pop();
                }
                else if(c=='}' && stack.peek()=='{'){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static void main() {
        System.out.println("The length is : ");
        System.out.println(isValid("()"));
    }
}
