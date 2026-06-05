package linkedlist;

import java.util.HashSet;

public class LinkedListCycle {
//    public boolean hasCycle(ListNode head) {
//        HashSet<ListNode> set = new HashSet<>();
//        ListNode temp = head;
//        while(temp!=null){
//            if(set.contains(temp)){
//                return true;
//            }
//            else{
//                set.add(temp);
//                temp=temp.next;
//            }
//        }
//        return false;
//    }
    public boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
