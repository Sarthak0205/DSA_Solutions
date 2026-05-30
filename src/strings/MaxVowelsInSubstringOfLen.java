package strings;

public class MaxVowelsInSubstringOfLen {
//    public static int maxVowels(String s, int k) {
//        int maxCount=Integer.MIN_VALUE;
//        int n= s.length();
//        for (int i = 0; i < n-k+1; i++) {
//            int count=0;
//            for (int j = i; j <(i+k); j++) {
//                char ch=s.charAt(j);
//                ch=Character.toLowerCase(ch);
//                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                    count++;
//                }
//            }
//            maxCount=Math.max(count,maxCount);
//        }
//        return maxCount;
//    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    //Optimised
    public static int maxVowels(String s, int k){
        int maxCount;
        int count=0;
        for (int i = 0; i < k; i++) {
            char c=Character.toLowerCase(s.charAt(i));
            if(isVowel(c)){
                    count++;
               }
        }
        maxCount=count;
        int left=0;
        int right=k;
        while(right<s.length()){
            char c=Character.toLowerCase(s.charAt(left));
            if(isVowel(c)){
                count--;
            }
            char ch=Character.toLowerCase(s.charAt(right));
            if(isVowel(ch)){
                    count++;
                }
            maxCount=Math.max(count,maxCount);
            left++;
            right++;
        }
        return maxCount;
    }

    static void main() {
        String s="leetcode";
        System.out.println("Max Count is  : " + maxVowels(s,3));
    }
}
