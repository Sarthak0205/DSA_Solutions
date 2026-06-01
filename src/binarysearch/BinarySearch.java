package binarysearch;

public class BinarySearch {
    public static int binarySearch(int[] nums,int target){
        int left=0;
        int right= nums.length-1;

        while (left<=right){
            //int mid=(left+right)/2;
            int mid=left+((right-left)/2); //avoids integer overflow that can occur when
            // left + right exceeds the maximum value of an integer.
            if(nums[mid]==target)return mid;
            if(nums[mid]<target){
                left=mid+1;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
        }
        return -1;
    }

    static void main() {
        int[] nums={1,3,5,7,9,11};
        int target=11;
        System.out.println(binarySearch(nums,target));
    }
}
