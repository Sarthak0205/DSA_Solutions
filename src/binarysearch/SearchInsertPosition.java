package binarysearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums,int target){
        int left=0;
        int right= nums.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]<target){
                left=mid+1;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
        }
        return left;
    }

    static void main() {
        int[] nums={1,3,5,7,9,11};
        int target=4;
        System.out.println("The Position is " + searchInsert(nums,target));
    }
}
