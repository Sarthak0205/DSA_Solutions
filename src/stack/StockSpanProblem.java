package stack;

import java.util.Stack;

public class StockSpanProblem {
//    public int[] stockSpan(int[] arr, int n) {
//        int[] Span = new int[n];
//        int spanCount;
//        for (int i = 0; i < n; i++) {
//            spanCount = 0;
//            for (int j = i; j >=0 ; j--) {
//                if(arr[j]<=arr[i]){
//                    spanCount++;
//                }
//                else break;
//            }
//            Span[i]=spanCount;
//        }
//        return Span;
//    }

    public int[] stockSpan(int[] prices,int n){
        Stack<Integer> stack = new Stack<>();
        int [] span = new int[n];
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && prices[i]>=prices[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()) span[i] = i +1;
            else{
                span[i]= i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
 }
