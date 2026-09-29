class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : stones){
            pq.add(num);
        }
        while(pq.size()>1)
        {
            int x = pq.remove();
            int y = pq.remove();
            if(x==y)    continue;
            if(x>y) pq.add(x-y);
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}