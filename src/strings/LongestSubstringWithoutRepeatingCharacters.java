package strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {


    public static int lengthOfLongestSubstring(String s){
        int maxLength=0;
        int left=0;
        int right=0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length()){
            char c=s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                maxLength=Math.max(maxLength,(right-left+1));
                right++;
            }
            else{
                while(set.contains(c)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(c);
                maxLength=Math.max(maxLength,(right-left+1));
                right++;

            }
        }
        return maxLength;
    }

    static void main() {
        String s="abcabcbb";
        System.out.println("Maxlength is : " + lengthOfLongestSubstring(s));
    }
}
