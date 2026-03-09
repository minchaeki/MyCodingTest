import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int hmax =0;
        int wmax=0;
        
        for (int i =0;i<sizes.length;i++){
            int w = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            
            hmax = Math.max(hmax,h);
            wmax = Math.max(wmax,w);
            
        }
        
        return(hmax*wmax);
    }
}