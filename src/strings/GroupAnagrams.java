package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> ans = new ArrayList<>();
//        boolean[] visited=new boolean[strs.length];
//        for (int i = 0; i < strs.length; i++) {
//            if (visited[i]) continue;
//            List<String> list = new ArrayList<>();
//            list.add(strs[i]);
//            visited[i]=true;
//            char[] chars=strs[i].toCharArray();
//            Arrays.sort(chars);
//            String sorted = new String(chars);
//            for (int j = i+1; j < strs.length; j++) {
//                if (visited[j]) continue;
//                String og=strs[j];
//                char[] c=strs[j].toCharArray();
//                Arrays.sort(c);
//                String sortedS=new String(c);
//                if (sorted.equals(sortedS)) {
//                    list.add(og);
//                    visited[j]=true;
//                }
//            }
//            ans.add(list);
//        }
//        return ans;
//    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            } else {
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }

}
