package linkedlist;



public class MergeSortedLinkedList {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
////        if(list1 == null && list2!=null) return list2;
////        if(list2 == null && list1!=null) return list1;
////        if(list1==null && list2==null) return null;
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode p =list1;
//        while(p!=null){
//            list.add(p.val);
//            p=p.next;
//        }
//        p=list2;
//        while (p!=null){
//            list.add(p.val);
//            p=p.next;
//        }
//        list.sort(Comparator.naturalOrder());
//       ListNode head = new ListNode(list.getFirst());
//       ListNode current = head;
//        for (int i = 1; i < list.size(); i++) {
//            current.next= new ListNode(list.get(i));
//            current= current.next;
//        }
//
//        return head;
//    }

    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode dummy= new ListNode(-1);
        ListNode current = dummy;
        while (list1!=null && list2!=null){
            if(list1.val<list2.val){
                current.next=list1;
                list1 = list1.next;
                current=current.next;
            }
            else {
                current.next=list2;
                list2 = list2.next;
                current=current.next;
            }
        }
        while(list1!=null){
            current.next=list1;
            list1 = list1.next;
            current=current.next;
        }
        while (list2!=null){
            current.next=list2;
            list2 = list2.next;
            current=current.next;
        }

        return dummy.next;
    }
}
