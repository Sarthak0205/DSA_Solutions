package linkedlist;

public class MiddleOfLinkedList {
//    public static ListNode middleNode(ListNode head) {
//        ListNode p = head;
//        int count = 0;
//        while(p!=null){
//            count++;
//            p=p.next;
//        }
//        int middle = count/2;
//        ListNode mid = head;
//        for (int i = 0; i < middle; i++) {
//            mid = mid.next;
//        }
//        return mid;
//    }

    public static ListNode middleNode (ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
