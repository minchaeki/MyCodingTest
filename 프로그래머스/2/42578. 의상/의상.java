import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer> map = new HashMap<>();
        int answer = 1;
        for (String[] row : clothes){
            String key = row[1];
            
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        for(int value : map.values()){
            answer *= (value+1);
        }
        
        
        return answer-1;
    }
}