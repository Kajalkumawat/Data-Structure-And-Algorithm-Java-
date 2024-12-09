public class ReverseLinkedList1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // display :
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node reverse(Node head) {
        Node pre = head;
        Node curr = head.next;
        Node next = curr.next;
        while (curr != null) {
            curr.next = pre;

            // update
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        // forward direction :1 2 3 4 5
        display(a);
        System.out.println();
        // backward direction :5 4 3 2 1
        Node rev = reverse(a);
        display(rev);
    }
}
