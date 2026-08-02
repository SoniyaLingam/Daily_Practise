import java.util.*;

class ReverseStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(8);

        int n = st.size();

        for (int i = 0; i < n; i++) {
            System.out.print(st.pop() + " ");
        }
    }
}