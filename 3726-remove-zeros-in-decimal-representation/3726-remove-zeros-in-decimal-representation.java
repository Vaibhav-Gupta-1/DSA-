class Solution {
    public long removeZeros(long n) {
        long x = 0;
        long y = 0;
        while(n>0){
            long a = n%10;
            if(a!=0){
                x = x*10+a;
            }
            n=n/10;
        }
        while(x>0){
            long b = x%10;
            y = y*10 + b;
            x=x/10;
        }
        return y;
    }
}