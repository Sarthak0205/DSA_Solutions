package stack;

import java.util.Stack;

public class DecodeString {
//    public String decodeString(String s){
//        boolean bracket=true;
//        while(bracket){
//            bracket=false;
//            int rightBracket=-1;
//            for (int i = 0; i <s.length() ; i++) {
//                char ch = s.charAt(i);
//                if (ch==']'){
//                    rightBracket=i;
//                    bracket=true;
//                    break;
//                }
//            }
//            if (!bracket) break;
//            int leftBracket=-1;
//            for(int i =rightBracket-1 ; i>=0; i--) {
//                char ch = s.charAt(i);
//                if(ch=='[') {
//                    leftBracket=i;
//                break;
//                }
//            }
//            int digitStart = leftBracket;
//            String inner = s.substring(leftBracket+1,rightBracket);
//            StringBuilder digits =new StringBuilder();
//            for (int i = leftBracket-1; i >=0 ; i--) {
//                char ch = s.charAt(i);
//                if (Character.isDigit(ch)){
//                    digits.insert(0,ch);
//                    digitStart=i;
//                }
//                else break;
//            }
//
//
//            int repeatCount = Integer.parseInt(digits.toString());
//            StringBuilder repeated = new StringBuilder();
//            for (int i = 0; i < repeatCount; i++) {
//                repeated.append(inner);
//            }
//
//            String prefix = s.substring(0,digitStart);
//            String suffix = s.substring(rightBracket+1);
//
//            s = prefix+repeated.toString()+suffix;
//
//        }
//        return s;
//    }


    public String decodeString(String s){
        Stack<Integer> countStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();

        int currentNum=0;
        String currentString="";
        int repeatCount=0;
        String prevStr;
        for(char ch:s.toCharArray()){
            if (Character.isDigit(ch)){
                int digit = Character.getNumericValue(ch);
                currentNum=currentNum*10+digit;
            } else if (ch=='[') {
                countStack.push(currentNum);
                stringStack.push(currentString);

                currentNum=0;
                currentString="";
            }
            else if (Character.isAlphabetic(ch)){
                currentString+=ch;
            } else if (ch==']') {
                repeatCount=countStack.pop();
                prevStr = stringStack.pop();

                String repeated = currentString.repeat(repeatCount);

                currentString = prevStr  + repeated;
            }

        }
        return currentString;
    }
}
