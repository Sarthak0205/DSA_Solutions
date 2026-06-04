package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseALinkedList {
    //Brute Force
//    public ListNode reverseList(ListNode head) {
//        ArrayList<Integer> list= new ArrayList<>();
//        ListNode temp = head;
//        while(temp !=null){
//            list.add(temp.val);
//            temp=temp.next;
//        }
//        temp =head;
//        int i =list.size()-1;
//        while (temp!=null){
//            temp.val=list.get(i);
//            temp=temp.next;
//            i--;
//        }
//        return head;
//    }


// Optimised
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr= head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
