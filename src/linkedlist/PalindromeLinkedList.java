package linkedlist;

import java.util.ArrayList;

public class PalindromeLinkedList {
//    public boolean isPalindrome(ListNode head){
//        ArrayList<Integer> list=new ArrayList<>();
//        ListNode p=head;
//        while(p!=null){
//            list.add(p.val);
//            p=p.next;
//        }
//        int left = 0;
//        int right = list.size()-1;
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(left).equals(list.get(right))){
//                return false;
//            }
//            else {
//                left++;
//                right++;
//            }
//        }
//        return true;
//    }
public static ListNode reverse(ListNode head){
    ListNode prev = null;
    ListNode curr=head;
    while(curr!=null){
        ListNode next = curr.next;
        curr.next=prev;
        prev = curr;
        curr=next;
    }
    return prev;
}
    public boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode start = null;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        if(fast==null){
            start = reverse(slow);
        }
        if(fast!= null){
            start = reverse(slow.next);
        }
        ListNode p1=head;
        ListNode p2=start;
        while(p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        reverse(start);
        return true;
    }

    static void main() {

    }
}
