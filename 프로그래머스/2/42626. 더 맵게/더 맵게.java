import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville){
            pq.add(s);
        }
        
        int k = 0;
        int count = 0;
        
        while(pq.peek()<K){
            if(pq.size() <2){
                return -1;
            }
            int i = pq.poll();
            int j = pq.poll();
            k = i+(j*2);
            count ++;
            pq.add(k);
        }
        return count;
    }
}