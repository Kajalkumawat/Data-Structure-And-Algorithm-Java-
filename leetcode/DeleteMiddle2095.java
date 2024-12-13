public class DeleteMiddle2095 {

    public ListNode deleteMiddle(ListNode head) {
        // head portion null (single node) (1)
        //valid for two cases only 
        if (head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
