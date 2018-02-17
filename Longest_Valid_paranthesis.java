public class Solution {
    public int longestValidParentheses(String s) {
        int maxlen = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1); //Simply a dummy value pushed onto stack as initiAL STEP.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.empty()) {
                    st.push(i);
                } else {
                    maxlen = Math.max(maxlen, i - st.peek());
                }
            }
        }
        return maxlen;
    }
}
