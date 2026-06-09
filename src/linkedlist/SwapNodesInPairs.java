package linkedlist;

import java.util.ArrayList;

public class SwapNodesInPairs {

//    public ListNode swapPairs(ListNode head) {
//        ArrayList<ListNode> list=new ArrayList<>();
//        ListNode p1=head;
//        while (p1!=null){
//            list.add(p1);
//            p1=p1.next;
//        }
//        if(list.isEmpty()) return null;
//        for (int i = 0; i+1 < list.size(); i=i+2) {
//            ListNode temp=list.get(i);
//            list.set(i,list.get(i+1));
//            list.set(i+1,temp);
//        }
//        for (int i = 0; i+1< list.size(); i++) {
//            list.get(i).next=list.get(i+1);
//        }
//        list.getLast().next=null;
//        return list.getFirst();
//    }

    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        while(prev.next!=null && prev.next.next!=null){
          ListNode A = prev.next;
          ListNode B=A.next;
          ListNode nextPair = B.next;

          prev.next=B;
          B.next  =A;
          A.next = nextPair;
          prev = A;
        }
        return dummy.next;
    }
}
