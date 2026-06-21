package stack;

public class TrappingWater {
//    public int trap(int[] height){
//        int waterlvl = 0;
//        for (int i = 0; i < height.length; i++) {
//            int leftMax = Integer.MIN_VALUE;
//            for (int j = 0; j < i; j++) {
//                if (height[j]>leftMax) leftMax=height[j];
//            }
//            int rightMax=Integer.MIN_VALUE;
//            for (int j = i+1; j <height.length ; j++) {
//                if (height[i]>rightMax) rightMax=height[j];
//            }
//
//            int water=(Math.min(leftMax,rightMax))-height[i];
//
//            if (water>0) waterlvl+=water;
//        }
//        return waterlvl;
//    }

//    public int trap(int[] height){
//        int waterlvl=0;
//        int[] leftMax = new int[height.length];
//        leftMax[0] = height[0];
//        for (int i = 1; i < height.length; i++) {
//            leftMax[i]=Math.max(leftMax[i-1],height[i]);
//        }
//        int[] rightMax=new int[height.length];
//        rightMax[height.length-1]=height[height.length-1];
//        for (int i = height.length-2; i >=0 ; i--) {
//            rightMax[i] = Math.max(rightMax[i+1],height[i]);
//        }
//        for (int i = 0; i < height.length; i++) {
//            int water = Math.min(leftMax[i],rightMax[i]) - height[i];
//            waterlvl+=water;
//        }
//        return waterlvl;
//    }

    public int trap(int[] height){
        int left = 0;
        int right = height.length-1;
        int leftMax=0;
        int rightMax=0;
        int water = 0;
        while (left<right){
            if (leftMax<rightMax){
                if (height[left]>=leftMax)
                    leftMax=height[left];
                else
                    water+=leftMax-height[left];
                left++;
            }
            else {
                if (height[right]>=rightMax)
                    rightMax=height[right];
                else
                    water+=rightMax-height[right];
                right--;
            }
        }
        return water;
    }
}
