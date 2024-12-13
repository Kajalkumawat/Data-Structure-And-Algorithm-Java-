public class SortZeroAndOne {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;

        // add method
        public void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // print list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // sort
        public void sortZeroandOne() {
            Node temp = head;
            int countZero = 0;
            int countOne = 0;
            while (temp != null) {
                if (temp.data == 0) {
                    countZero++;// 3
                } else {
                    countOne++;// 3
                }
                // temp---tail
                temp = temp.next;
            }
            temp = head;
            while (temp != null) {
                if (countZero > 0) {
                    temp.data = 0;
                    countZero--;
                } else if (countOne > 0) {
                    temp.data = 1;
                    countOne--;
                }
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        //1,0,1,0,0,1 
        ll.add(1);;
        ll.add(0);
        ll.add(1);
        ll.add(0);
        ll.add(0);
        ll.add(1);
        ll.sortZeroandOne();
        ll.display();
    }
}
