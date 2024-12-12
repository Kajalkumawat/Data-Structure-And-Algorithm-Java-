/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Intersection160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        //length of A linkedlist 
        int lengthA=0;
       while(tempA!=null) {
        lengthA++;
        tempA=tempA.next;
       }
       //length of B linkedlist 
       int lengthB=0;
       while(tempB!=null){
        lengthB++;
        tempB=tempB.next;
       }
       //temp again start head position because length find temp still tail position 
       tempA=headA;
       tempB=headB;
       //list A length and list B length become equal 
       if(lengthA>lengthB){
        int steps=lengthA-lengthB;
        for(int i=0;i<steps;i++){
            tempA=tempA.next;
        }
       }
       //B length greater 
       else{
        int steps =lengthB-lengthA;
        for(int i=0;i<steps;i++){
            tempB=tempB.next;
        }
       }
       //tempA==tempB (one one step loop loop find same element this point is intersection point )
       while(tempA!=tempB){
        tempA=tempA.next;
        tempB=tempB.next;
       }
       return tempA;
    }

}