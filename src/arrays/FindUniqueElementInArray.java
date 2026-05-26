package arrays;


public class FindUniqueElementInArray {
    public static int uniqueElementArray(int[] nums){
        int xorSum=0;
        for (int i = 0; i < nums.length; i++) {
            xorSum^=nums[i];
        }
        return xorSum;
    }

    static void main() {
        int nums[]={2,3,5,4,5,3,4};
        int num=uniqueElementArray(nums);
        System.out.println(num);
    }
}
