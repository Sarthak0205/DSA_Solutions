package linkedlist;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashSet<ListNode> list = new HashSet<>();
//        ListNode p1=headA;
//        while(p1!=null){
//            list.add(p1);
//            p1=p1.next;
//        }
//        ListNode p2 = headB;
//        while (p2!=null){
//            if(list.contains(p2)) return p2;
//            p2=p2.next;
//        }
//        return null;
//    }

    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode p1= headA;
        ListNode p2 = headB;
        while(p1!=p2){
            if(p1 == null) p1 = headB;
            if(p2 == null) p2 = headA;
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
