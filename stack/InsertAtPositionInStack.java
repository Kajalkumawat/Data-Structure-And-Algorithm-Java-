import java.util.*;

public class InsertAtPositionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int val = 92;
        int index = 3;
        Stack<Integer> temp = new Stack<>();
        while (st.size() >= index) {
            int x = st.peek();
            temp.push(x);
            st.pop();
        }
        st.push(val);
        while (temp.size() > 0) {
            int x = temp.peek();
            st.push(x);
            temp.pop();
        }
        System.out.println(st);
    }
}
