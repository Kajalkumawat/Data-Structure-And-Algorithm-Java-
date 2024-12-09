public class CreateLinkedList {
    // node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // linkedlist class :
    public static class linkedlList {
        Node head = null;
        Node tail = null;

        // add method :through tail 
        void add(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;
            }
            // update
            tail = temp;
        }

        // display
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlList ll = new linkedlList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.display();
    }
}
