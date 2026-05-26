package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                    }
//                }
//            }
//        }
//        return ans;
//    }



    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int n=nums[i];
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                int sum =n + nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                } else if (sum<0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
    static void main() {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> ans;
        ans=threeSum(nums);
        for(List<Integer> item:ans){
            System.out.println(item);
        }
    }
}
