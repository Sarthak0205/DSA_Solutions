package arrays;

public class MaximumSumSubArray {
//    public static int findMaxSum(int[] nums, int k) {
//        int sum=0;
//        int n=nums.length;
//        int maxSum=Integer.MIN_VALUE;
//        for(int i=0;i<(n-k+1);i++){
//            sum =0;
//            for(int j=i;j<i+k;j++){
//                sum=sum+nums[j];
//            }
//            if(sum>maxSum){
//                maxSum=sum;
//            }
//        }
//        return maxSum;
//    }


    //Optimised
    public static int findMaxSum(int[] nums,int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum=sum+nums[i];
        }
        int l=0;
        int r=k;
        int maxSum=sum;
        while(r<nums.length){
            sum=sum-nums[l]+nums[r];
            if (sum>maxSum) maxSum=sum;
            l++;r++;
        }
        return maxSum;
    }

    static void main() {
        int[] nums={100,200,300,400};
        int k=2;
        System.out.println("Max Sum is " + findMaxSum(nums,k));
    }
}

