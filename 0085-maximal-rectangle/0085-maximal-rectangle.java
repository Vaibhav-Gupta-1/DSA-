class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
        return 0;
        int maxArea = 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        for(char[] rows : matrix){
            for(int i=0;i<cols;i++){
                heights[i] = (rows[i]=='1') ? heights[i]+1 : 0;
            }
            maxArea = Math.max(maxArea,largestRectangleArea(heights));
        }
        return maxArea;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])  st.pop();
            if(st.isEmpty())    nse[i] = n;
            else
            nse[i] = st.peek();
            st.push(i);
        }
        while(!st.isEmpty())    st.pop();
        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])  st.pop();
            if(st.isEmpty())    pse[i] = -1;
            else    pse[i] = st.peek();
            st.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int area  = heights[i] * (nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}