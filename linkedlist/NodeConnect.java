public class NodeConnect {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        // a-->b
        a.next = b;
        // b-->c
        b.next = c;
        // c-->d
        c.next = d;
        d.next = null;
        // print : first way :individual node
        System.out.println(a.data + " " + b.data + " " + c.data + " " + d.data);
        // second way :proof a is connect to the last node through refrence variable
        // proof :create linkedlist user define
        System.out.println("a :" + a.data);
        System.out.println("b :" + a.next.data);// b
        System.out.println("c :" + a.next.next.data);
        System.out.println("d :" + a.next.next.next.data);

    }
}
