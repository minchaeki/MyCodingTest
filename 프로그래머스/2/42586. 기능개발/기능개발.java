import java.util.*;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<speeds.length;i++){
            int remain = 100 - progresses[i];
            int days = remain / speeds[i];
            if (remain % speeds[i] != 0) {
                days++;
            }
            queue.offer(days);
        }
        
        while(!queue.isEmpty()){
            int a = queue.poll();
            int count = 1;
            while(!queue.isEmpty() && queue.peek()<= a){
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}