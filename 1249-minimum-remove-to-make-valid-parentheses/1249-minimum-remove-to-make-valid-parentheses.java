class Solution {
    public String minRemoveToMakeValid(String s) {
        int lc = 0;
        int rc = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                lc++;
            }
            if (ch == ')') {
                rc++;
            }
            if (rc > lc) {
                rc--;
                continue;
            } else {
                st.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            char ch = st.pop();
            if (lc > rc && ch == '(') {
                lc--;
            } else {
                result.append(ch);
            }
        }
        return result.reverse().toString();
    }
}