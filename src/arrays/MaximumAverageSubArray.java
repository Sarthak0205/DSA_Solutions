package arrays;

public class MaximumAverageSubArray {
//    public static double findMaxAverage(int[] nums, int k) {
//        double sum;
//        int n=nums.length;
//        double maxAvg,avg;
//        maxAvg = Double.MIN_VALUE;
//        for(int i=0;i<(n-k+1);i++){
//            sum =0;
//            for(int j=i;j<i+k;j++){
//                sum=sum+nums[j];
//            }
//            avg=sum/k;
//            if(avg>maxAvg){
//                maxAvg=avg;
//            }
//        }
//        return maxAvg;
//    }

    //Optimised Approach TC:O(n) SC : O(1)
    public static double findMaxAverage(int[] nums,int k){
        double windowSum =0 ,maxSum;
        for (int i = 0; i < k; i++) {
            windowSum+=nums[i];
        }

        int l=0;
        int r=k;
        maxSum = windowSum;
        while(r<nums.length){
            windowSum=windowSum - nums[l] + nums[r];
            if(windowSum>maxSum) maxSum=windowSum;
            l++;
            r++;
        }
return maxSum/k;
    }

    static void main() {
        int[] nums={1,12,-5,-6,50,3};
        double maxAvg=findMaxAverage(nums,4);
        System.out.println(maxAvg);
    }
}
