package strings;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {

//    public static int getMaxFreq(int[] freq){
//        int max =freq[0];
//        for (int i = 1; i < freq.length; i++) {
//            if(freq[i]>max) max=freq[i];
//        }
//        return max;
//    }
//    public static int characterReplacement(String s, int k) {
//        int maxLength = 0;
//        int maxFreq;
//        int windowLength=0;
//        int n=s.length();
//        int freq[] = new int[26];
//        for (int i = 0; i <n; i++) {
//            Arrays.fill(freq,0);
//            maxFreq=0;
//            for (int j = i; j < n; j++) {
//                  windowLength=j-i+1;
//                  char c=s.charAt(j);
//                  freq[c-'A']++;
//                maxFreq=getMaxFreq(freq);
//                int replacements= windowLength - maxFreq;
//                if(replacements<=k) maxLength= Math.max(maxLength,windowLength);
//                else break;
//            }
//        }
//        return maxLength;
//    }

    public static int characterReplacement(String s,int k){
        int left=0;
        int right=0;
        int[] freq= new int[26];
        int maxFreq=0;
        int maxLength=0;
        while(right<s.length()){
            char c=s.charAt(right);
            freq[c-'A']++;
            maxFreq=Math.max(maxFreq,freq[c-'A']);
            int windowLength=right-left+1;
            if(windowLength-maxFreq<=k){
                maxLength=Math.max(windowLength,maxLength);
            }
            else {
                while(right-left+1-maxFreq>k){
                    char ch=s.charAt(left);
                    freq[ch-'A']--;
                    left++;
                }
                maxLength=Math.max(right-left+1,maxLength);
            }
            right++;
        }
        return maxLength;
    }

    static void main() {
        String s="AABABBA";
        int k=1;
        System.out.println("Maxlength is : "  + characterReplacement(s,k));
    }
}
