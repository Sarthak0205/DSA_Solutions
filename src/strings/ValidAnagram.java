package strings;

/*
Problem: Valid Anagram
Platform: LeetCode
Topic: Strings, Hashing
Difficulty: Easy

Approach:
- Use two HashMaps to store character frequencies for both strings.
- Traverse both strings and update frequency counts.
- Compare both HashMaps using equals().
- If frequencies match, the strings are anagrams.

Why this works:
- Anagrams must contain the same characters with the same frequencies.
- HashMap helps track frequency efficiently.

Time Complexity: O(n)
Space Complexity: O(n)

Learning Notes:
- Learned frequency counting pattern.
- Character becomes key and frequency becomes value.
- containsKey() helps identify whether character already exists.
- map.equals() can directly compare frequency maps.
*/

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map1.containsKey(c)){
                int count=map1.get(c);
                count++;
                map1.replace(c,count);
            }
            else{
                map1.put(c,1);
            }
        }


        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(map2.containsKey(c)){
                int count=map2.get(c);
                count++;
                map2.replace(c,count);
            }
            else{
                map2.put(c,1);
            }
        }


        if(map1.equals(map2)){
            return true;
        }
        else return false;

    }
}