class Solution {
    public int kthFactor(int n, int k) {
        int c=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1;i<=n;i++){
            if(n%i==0){  
                pq.add(i);
                c++;
            }
            if(pq.size()>k){
                pq.remove();
            }
        }
        return c<k ? -1 : pq.remove();
    }
}