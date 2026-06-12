package stack;

import java.util.Stack;

public class DailyTemperatures {
//    public int[] dailyTemperatures(int[] temperatures){
//        int[] answer = new int[temperatures.length];
//        for (int i = 0; i <temperatures.length; i++) {
//            for (int j = i+1; j <temperatures.length; j++) {
//                    if(temperatures[j]>temperatures[i]){
//                        answer[i]=j-i;
//                        break;
//                    }
//                answer[i]=0;
//            }
//
//        }
//        return answer;
//    }

    public int[] dailyTemperatures(int[] temperatures){
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while(i< temperatures.length){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevIndex=stack.pop();
                answer[prevIndex] = i- prevIndex;
            }
            stack.push(i);
            i++;
        }
        return answer;
    }


}

