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
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[]=new int[2];

        for(int i=0;i<nums.length;i++){
            int value =target - nums[i];
            if(map.containsKey(value)){
                arr[0]=i;
                arr[1]=map.get(value);
                // return arr;
            }
            else
            {
                map.put(nums[i],i);
            }
        }

        return arr;
    }
}
