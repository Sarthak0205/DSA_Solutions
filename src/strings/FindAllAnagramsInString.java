package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
//    public static List<Integer> findAnagrams(String s, String p) {
//        List<Integer> list=new ArrayList<>();
//        int n=s.length();
//        int l=p.length();
//        int sfreq[] = new int[26];
//        int pfreq[] = new int[26];
//        for (int i = 0; i < l; i++) {
//            char c=p.charAt(i);
//            pfreq[c-'a']++;
//        }
//        for (int i = 0; i < n-l+1; i++) {
//            Arrays.fill(sfreq,0);
//            for (int j = i; j < i+l ; j++) {
//                char c=s.charAt(j);
//                sfreq[c-'a']++;
//            }
//            if(Arrays.equals(sfreq,pfreq)){
//                list.add(i);
//            }
//        }
//        return list;
//    }

    public static List<Integer> findAnagrams(String s,String p){
        List<Integer> list=new ArrayList<>();
        int n=s.length();
        int l=p.length();
        int sfreq[]=new int[26];
        int pfreq[] = new int[26];
        if(n<l) return list;
        for (int i = 0; i < l; i++) {
            char c= p.charAt(i);
            pfreq[c-'a']++;
        }
        for (int i = 0; i < l; i++) {
            char c=s.charAt(i);
            sfreq[c-'a']++;
        }
        if(Arrays.equals(sfreq,pfreq)){
            list.add(0);
        }
        int left=0;
        int right=l;
        while(right<n){
            char c =s.charAt(left);
            char ch=s.charAt(right);
            sfreq[c-'a']--;
            sfreq[ch-'a']++;
            left++;
            right++;
            if(Arrays.equals(sfreq,pfreq)){
                list.add(left);
            }
        }
        return list;
    }

    static void main() {
        String s="abab";
        String p="ab";
        List<Integer> list;
        list=findAnagrams(s,p);
        System.out.println(list);
    }
}
