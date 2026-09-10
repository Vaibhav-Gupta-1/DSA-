class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n =heights.length;
        int[] count = new int[n];
        Arrays.fill(count, 0);
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=heights[i]){
                st.pop();
                count[i]++;
            }
            if(!st.isEmpty())
            count[i]++;
            st.push(heights[i]);
        }
        return count;
    }
}