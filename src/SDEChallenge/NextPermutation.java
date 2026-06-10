package SDEChallenge;

public class NextPermutation {
    public static void swap(int[] nums, int s,int p){
        int temp = nums[p];
        nums[p]=nums[s];
        nums[s]=temp;
    }
    public static void reverse(int[] nums, int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums){
        int n = nums.length;
        int pivotIndex=-1;
        for (int i = n-2; i >=0; i--) {
            if(nums[i]<nums[i+1])
            {
                pivotIndex=i;
                break;
            }
        }
        if (pivotIndex==-1){
            reverse(nums,0,n-1);
            return;
        }
        int sIndex=-1;
        for (int i = n-1; i>=pivotIndex+1 ; i--) {
            if(nums[i]>nums[pivotIndex]){
                sIndex=i;
                break;
            }
        }
        swap(nums,sIndex,pivotIndex);
        reverse(nums,pivotIndex+1,n-1);

    }
}
