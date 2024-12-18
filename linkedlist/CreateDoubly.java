public class CreateDoubly {
    public static class Node {
        // three part : data +previous + next
        Node previous;
        int data; 
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(42);
        Node b = new Node(9);
        Node c = new Node(32);
        a.next = b;
        a.previous = null;
        b.next = c;
        b.previous = a;
        c.next = null;
        c.previous = b;
    }
}
