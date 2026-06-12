package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
//    public int[] nextGreaterElements(int[] nums){
//        int[] answer = new int[nums.length];
//        Arrays.fill(answer,-1);
//        boolean found = false;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j =i+1; j <nums.length ; j++) {
//                if (nums[j] > nums[i]){
//                    answer[i] = nums[j];
//                    found=true;
//                    break;
//                }
//            }
//            if (found) continue;
//            for (int j = 0; j < i; j++) {
//                if (nums[j] > nums[i]){
//                    answer[i] = nums[j];
//                    break;
//                }
//            }
//        }
//        return answer;
//    }

    public int[] nextGreaterElements(int[] nums){
        int n= nums.length;
        int[] answer=new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <2*n; i++) {
            int index = i%n;
            while(!stack.isEmpty() && nums[index]>nums[stack.peek()]){
                int prevIndex = stack.pop();
                answer[prevIndex]=nums[index];
            }
            if(i<n) stack.push(index);
        }
        return answer;
    }
}
