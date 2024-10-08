class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ast.length; i++) {
            if (ast[i] > 0) {
                st.push(ast[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(ast[i])) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(ast[i])) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(ast[i]);
                }
            }
        }

        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
