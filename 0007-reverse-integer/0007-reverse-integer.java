class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        long j = Math.abs((long) x);
        long ans = 0;
        while (j > 0) {
            int a = (int) (j % 10);
            ans = ans * 10 + a;
            j = j / 10;
        }
        if (x < 0) {
            ans = -ans;
        }
        if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) ans;
    }
}