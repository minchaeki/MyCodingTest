import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<priorities.length;i++){
            q.offer(new int[]{priorities[i], i});
        }
        Arrays.sort(priorities);
        int big = priorities.length - 1;
        int answer = 0;
        while(!q.isEmpty()){
            int[] current = q.poll();
            if(current[0] == priorities[big]){
                answer ++;
                big --;
                if(current[1] == location){
                    return answer;
                }
            }
            
            else{
                q.offer(current);
            }
        }
        
        return answer;
    }
}