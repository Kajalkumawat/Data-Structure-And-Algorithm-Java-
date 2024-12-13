public class DeleteMiddleValid2095 {
    
    public ListNode deleteMiddle(ListNode head) {
        //head portion null (single node) (1)
        if(head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }

}
