package stack;

import java.util.Stack;

public class LargestRectangleHistogram {
//    public int largestRectangleArea(int[] heights){
//        int maxArea = Integer.MIN_VALUE;
//        for (int i = 0; i < heights.length; i++) {
//            int leftBoundary = 0;
//            int rightBoundary = 0;
//            int currentHeight = heights[i];
//            for (int j = i; j >= 0; j--) {
//                if (currentHeight > heights[j]) leftBoundary = j;
//            }
//            for (int j = i; j < heights.length; j++) {
//                if (currentHeight > heights[j]) rightBoundary = j;
//            }
//            int width = rightBoundary - leftBoundary + 1;
//            int Area = currentHeight * width;
//            maxArea = Math.max(Area,maxArea);
//        }
//        return maxArea;
//    }

    public int largestRectangleArea(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int [] nps = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
        while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
            stack.pop();
        }
        if (stack.isEmpty()) nps[i] =-1;
        else nps[i] = stack.peek();
        stack.push(i);
        }
        stack.clear();
        int[] nns = new int[heights.length];
        for (int i = heights.length-1; i>=0 ; i--) {
            while (!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()) nns[i] = heights.length;
            else nns[i]=stack.peek();
            stack.push(i);
        }
        int maxArea=Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int width = nns[i] - nps[i] -1;
            int area = heights[i]*width;
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}
