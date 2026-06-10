package SDEChallenge;

public class MaximumSubArray {

    //Brute Force
//    public int maxSubArray(int [] nums){
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int currSum=0;
//            for (int j = i; j < nums.length ; j++) {
//                currSum+=nums[j];
//                maxSum=Math.max(maxSum,currSum);
//            }
//        }
//        return maxSum;
//    }

    //Optimal

    public int maxSubArray(int[] nums){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum+=nums[i];
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0) currSum=0;
        }
        return maxSum;
    }
}
