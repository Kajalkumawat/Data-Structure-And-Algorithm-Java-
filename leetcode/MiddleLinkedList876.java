/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MiddleLinkedList876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //fast!=null :for one traversal 
        //fast.next!=null :nullpointer exception 
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}