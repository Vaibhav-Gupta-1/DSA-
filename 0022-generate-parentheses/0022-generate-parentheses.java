class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        balanced(ans,n,0,0,"");
        return ans;
    }
    public static void balanced(List<String> ans, int n, int l,int r, String s){
        if(r == n)
        ans.add(s);
        if(l<n)
        balanced(ans,n,l+1,r,s+"(");
        if(r<l)
        balanced(ans,n,l,r+1,s+")");
    }
}