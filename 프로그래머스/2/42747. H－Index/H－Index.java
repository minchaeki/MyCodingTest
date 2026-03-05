import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
       Arrays.sort(citations);
        
        for(int i =0; i<citations.length;i++){
            int answer = citations.length-i;
            if(citations[i]>=answer)
                return answer;
        }
        
        return 0;
        
        
    }
}