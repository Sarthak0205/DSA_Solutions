package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class LongestConsecutiveSequence {
//    public static int longestConsecutive(int[] nums){
//        if (nums.length==0) return 0;
//        Arrays.sort(nums);
//        int currentCount=1;
//        int maxCount=1;
//        for(int i=1;i<nums.length;i++){
//            if (nums[i]==(nums[i-1])+1){
//                currentCount++;
//            }
//            else if (nums[i]==nums[i-1]){
//                continue;
//            }
//            else {
//                maxCount=Math.max(maxCount,currentCount);
//                currentCount=1;
//            }
//        }
//        maxCount=Math.max(maxCount,currentCount);
//        return maxCount;
//    }
    public static int longestConsecutive(int[] nums){
        if (nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        int maxlength=0;
        for (int num:set){
            if (!set.contains(num-1)){
                int current= num;
                int length=1;
                while (set.contains(current+1)){
                    current++;
                    length++;
                }
                maxlength= Math.max(maxlength,length);
            }
        }
        return maxlength;
    }

    static void main() {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));

    }
}
