package hashing;

/*
Problem: Contains Duplicate
Platform: LeetCode
Topic: Arrays, Hashing
Difficulty: Easy

Approach:
- Traverse the array using a HashMap.
- Store each number as a key.
- If the current number already exists in the HashMap,
  a duplicate is found immediately.
- Otherwise insert the number into the map.

Why this works:
- HashMap provides fast lookup for previously seen elements.
- Duplicate detection happens during traversal itself.

Time Complexity: O(n)
Space Complexity: O(n)

Learning Notes:
- Learned duplicate detection using HashMap lookup.
- containsKey() is useful for checking previously seen elements.
- This problem can also be solved cleanly using HashSet.
- Not every HashMap problem requires counting frequencies.
*/

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else {
                map.put(nums[i],1);
            }
        }
        return false;
    }
}
