public class PopStack {
    public static class Stack {
        int index = 0;
        int a[] = new int[5];

        // add element
        public void push(int val) {
            a[index] = val;
            index++;
        }

        public void display() {
            for (int i = 0; i < index; i++) {
                System.out.print(a[i] + " ");
            }
        }

        int pop() {
            if (index == 0) {
                System.out.println("empty stack");
                return -1;
            } else {
                int top = a[index - 1];
                a[index - 1] = 0;
                index--;
                return top;
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        // st.display();
        st.pop();
        st.display();
    }
}
