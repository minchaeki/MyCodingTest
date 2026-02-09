import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> dq = new ArrayDeque<>();
        for (int p : people) dq.add(p);
        while(!dq.isEmpty()){
            
            int heavy = dq.pollLast();
            if(!dq.isEmpty() && heavy + dq.peekFirst() <= limit)
                dq.pollFirst();
            
            answer ++;
        }
        return answer;
    }
}