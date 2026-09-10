class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){
            if(s.equals("+")){
                st.push(st.pop()+st.pop());
            }
            else if(s.equals("-")){
                int sd = st.pop();
                int ft = st.pop();
                st.push(ft-sd);
            }
            else if(s.equals("/")){
                int sd = st.pop();
                int ft = st.pop();
                st.push(ft/sd);
            }
            else if(s.equals("*")){
                st.push(st.pop()*st.pop());
            }
            else
                st.push(Integer.parseInt(s));
        }
        return st.peek();
    }
}