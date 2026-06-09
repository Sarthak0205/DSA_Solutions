package linkedlist;

import java.awt.*;
import java.util.ArrayList;

public class ReorderLinkedList {
//    public void reorderList(ListNode head) {
//        ArrayList<ListNode> list = new ArrayList<>();
//        ListNode p1 = head;
//        while(p1!=null){
//            list.add(p1);
//            p1=p1.next;
//        }
//        int left=0;
//        int right=list.size()-1;
//        while(left<right){
//            list.get(left).next=list.get(right);
//            list.get(right).next = list.get(left+1);
//            left++;
//            right--;
//        }
//            list.get(left).next=null;
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
    public void reorderList(ListNode head){
        if(head == null || head.next== null) return;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev=null;
        while(fast!= null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode second;
        if(fast!=null){
            second = slow.next;
            slow.next = null;
        }
        else {
            second = slow;
            prev.next=null;
        }
        second = reverse(second);
        ListNode first= head;
        while(second!=null){
            ListNode next1 = first.next;
            ListNode next2= second.next;

            first.next = second;
            second.next = next1;

            first=next1;
            second=next2;
        }
    }
}
