package binarysearch;

public class FindPeakElement {
//    public static int findPeakElement(int[] nums) {
//        int n=nums.length;
//        if(n==1) return 0;
//        int peakPos = -1;
//        for (int i = 0; i <n; i++) {
//            if(i==0){
//                if(nums[0]>nums[1]){
//                    peakPos=0;
//                    return peakPos;
//                }
//            }
//            else if(i==n-1){
//                if(nums[n-1]>nums[n-2]){
//                   peakPos=n-1;
//                   return peakPos;
//                }
//            }
//            else{
//                if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
//                    peakPos=i;
//                    return peakPos;
//                }
//            }
//        }
//        return peakPos;
//    }

    //Optimised Approach
    public static int findPeakElement(int[] nums){
        int n=nums.length;
        int left =0;
        int right=n-1;
        while(left<right){
            int mid = left + ((right-left)/2);

            if(nums[mid] < nums[mid+1])
                left = mid+1;
            else
                right = mid;
        }
        return left;
    }


    static void main() {
        int[] nums={1,2,3,1};
        System.out.println("Peak Position is : " + findPeakElement(nums));
    }
}
