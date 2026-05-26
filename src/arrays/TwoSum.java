package arrays;

/*
Problem: Two Sum
Platform: LeetCode
Topic: Arrays, Hashing
Difficulty: Easy

Approach:
- Use a HashMap to store number -> index.
- For every element, calculate the complement = target - current number.
- If complement already exists in the map, return the two indices.
- Otherwise store the current number with its index.

Why this works:
- We avoid checking every pair manually.
- HashMap gives fast lookup, so the solution becomes efficient.

Time Complexity: O(n)
Space Complexity: O(n)

Learning Notes:
- Understand complement logic clearly.
- Check before inserting current number to avoid using the same element twice.
- containsKey() is useful for fast lookup.
*/

import java.util.HashMap;

public class TwoSum {
    //Brute Force TC : O(n^2) SC : O(1)
//    public static int[] twoSum(int[] nums,int target){
//        int[] arr=new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(i==j) continue;
//                if(nums[i]+nums[j]==target){
//                    arr[0]=i;
//                    arr[1]=j;
//                    return arr;
//                }
//            }
//        }
//        return arr;
//    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for(int num:nums){
            int n=target - num;
            if(map.containsKey(n)){
                arr[0]=map.get(num);
                arr[1]=map.get(n);
                return arr;
            }
        }
        return arr;
    }


    static void main() {
        int[] nums ={-1,-2,-3,-4,-5};
        int target=-8;
        int[] arr=twoSum(nums,target);
        for(int i=0;i<2;i++){
            System.out.println(arr[i]);
        }
    }
}
