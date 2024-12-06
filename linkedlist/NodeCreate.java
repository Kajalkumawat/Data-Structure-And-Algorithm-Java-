public class NodeCreate {
    // node create
    static class Node {
        int value;// value (data | element )
        Node next; // address

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        System.out.println(a.next + " " + a.value);
        System.out.println(b.next + " " + b.value);
        System.out.println(c.next + " " + c.value);
    }
}