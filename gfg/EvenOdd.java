public class EvenOdd {
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
    
            void add(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                } else {
                    tail.next = temp;
                }
                tail = temp;
            }
    
            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
    
            void even() {
                Node temp = head;
                while (temp != null) {
                    if (temp.data % 2 == 0) {
                        System.out.print(temp.data + " ");
                       
                    }
                    temp = temp.next;
                }
                temp=head;
                while(temp!=null){
                    if(temp.data%2!=0){
                        System.out.print(temp.data + " ");
                    }
                    temp=temp.next;
                }
            }
        }
    
        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.add(1);
            ll.add(2);
            ll.add(3);
            ll.add(4);
            ll.even();
           // ll.display();
        }
    
}
