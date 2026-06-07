package linkedlist;

public class RemoveNthNodeFromEnd {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//            ListNode temp = head;
//            int size =0;
//            while(temp!=null){
//                size++;
//                temp = temp.next;
//            }
//            int removeIndex=size-n;
//            if(removeIndex == 0 ) return head.next;
//            temp = head;
//        for (int i = 0; i < removeIndex-1; i++) {
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//
//        return head;
//    }

    public ListNode removeNthFromEnd(ListNode head , int n){
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow = dummy;
        for (int i = 0; i <=n ; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return dummy.next;
    }
}
