package stack;

import java.util.Stack;

public class AdjacentDuplicatesInString {
//    public String removeDuplicates(String s){
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if ( !stack.isEmpty() && ch==stack.peek()) {
//                stack.pop();
//            }
//            else stack.push(ch);
//        }
//        StringBuilder sb = new StringBuilder();
//        for(char c:stack){
//            sb.append(c);
//        }
//        return sb.toString();
//    }
    public String removeDuplicates(String s){
        StringBuilder sb=new StringBuilder();
        for (char ch : s.toCharArray()){
            int len = sb.length();
            if(len>0 && sb.charAt(len-1)==ch){
                sb.deleteCharAt(len-1);
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}
