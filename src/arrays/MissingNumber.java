package arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        int xorSum=0;
        int n=nums.length;
        //xorSumm with nums
        for (int i = 0; i < nums.length; i++) {
            xorSum=xorSum^nums[i];
        }
        //xorSum with range 0-n
        for (int i = 0; i <=n; i++) {
            xorSum = xorSum^i;
        }

        return xorSum;
    }

    static void main() {
        int nums[]={2,1,0,4,3};
        int num=missingNumber(nums);
        System.out.println(num);
    }
}
