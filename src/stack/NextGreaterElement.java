package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
//    public int[] nextGreaterElement(int[] nums1,int[] nums2) {
//        int[] answer = new int[nums1.length];
//        Arrays.fill(answer, -1);
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    int index = j;
//                    for (int k = index + 1; k < nums2.length; k++) {
//                        if (nums2[k] > nums1[i]) {
//                            answer[i] = nums2[k];
//                            break;
//                        }
//                    }
//                    break;
//                }
//                else continue;
//            }
//        }
//        return answer;
//    }

    public int[] nextGreaterElement(int[] nums1,int[] nums2){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                int prev = stack.pop();
                map.put(prev,nums2[i]);
            }
            stack.push(nums2[i]);
        }
       while(!stack.isEmpty()){
           map.put(stack.pop(),-1);
       }
        int[] answer=new int[nums1.length];
        for (int i = 0; i < answer.length ; i++) {
            answer[i]=map.get(nums1[i]);
        }
        return answer;
    }
}
