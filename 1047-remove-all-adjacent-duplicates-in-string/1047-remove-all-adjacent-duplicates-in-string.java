class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }
            else
            st.push(ch);
        }
        Stack<Character> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        String ans = "";
        while(!st2.isEmpty()){
            ans+=st2.pop();
        }
        return ans;
    }
}