public class RemoveDuplicate {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node removeDuplicate(Node head) {
        Node temp1 = head;
        while (temp1 != null) {
            Node temp2 = temp1;
            while (temp2.next != null) {
                if (temp1.data == temp2.next.data) {
                    temp2.next = temp2.next.next;
                } else {
                     temp2 = temp2.next;
                }
            }
            temp1 = temp1.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(23);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.println("Before removing duplicates: ");
        //display(a);
        Node h = removeDuplicate(a);
        display(h);
    }
}