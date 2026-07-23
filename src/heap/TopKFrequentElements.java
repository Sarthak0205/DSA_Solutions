package heap;

import java.util.*;

public class TopKFrequentElements {
//    public int[] topKFrequent(int[] nums, int k) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num:nums){
//                map.put(num,map.getOrDefault(num,0)+1);
//        }
//        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
//
//        Collections.sort(list,(a,b) -> Integer.compare(b.getValue(),a.getValue()));
//
//        int[] ans = new int[k];
//        int index=0;
//        for (Map.Entry<Integer, Integer> entry:list){
//            if (index == ans.length) break;
//            ans[index]=entry.getKey();
//            index++;
//        }
//
//return ans;
//    }
//public int[] topKFrequent(int[] nums, int k) {
//    HashMap<Integer,Integer> map = new HashMap<>();
//    for(int num:nums){
//        map.put(num,map.getOrDefault(num,0)+1);
//    }
//    PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> Integer.compare(b.getValue(),a.getValue()));
//
//    for (Map.Entry<Integer,Integer> entry : map.entrySet()){
//        pq.offer(entry);
//    }
//    int[] ans = new int[k];
//    for (int i = 0; i < ans.length; i++) {
//        Map.Entry<Integer,Integer> curr = pq.poll();
//        ans[i] = curr.getKey();
//    }
//
//    return ans;
//}

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> Integer.compare(b.getValue(),a.getValue()));

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry);
            if (pq.size()>k) pq.poll();
        }
        int[] ans = new int[k];
        for (int i = 0; i < ans.length; i++) {
            Map.Entry<Integer,Integer> curr = pq.poll();
            ans[i] = curr.getKey();
        }

        return ans;
    }
}
