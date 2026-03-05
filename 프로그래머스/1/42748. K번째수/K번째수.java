import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int a = commands.length;
        for(int i =0;i<a;i++){
            int j = commands[i][0] -1;
            int k = commands[i][1];
            int h = commands[i][2] -1;
            
            int b = Arrays.stream(array).skip(j).limit(k-j).sorted().toArray()[h];;
            list.add(b);
            
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}