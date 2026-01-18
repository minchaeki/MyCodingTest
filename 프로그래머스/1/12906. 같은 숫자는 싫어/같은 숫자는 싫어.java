import java.util.*;


public class Solution {
    public int[] solution(int []arr) {
        
        
        Stack<Integer> stack = new Stack<>();
        
        for (int x:arr){
            if(stack.isEmpty() || stack.peek() != x)
                stack.push(x);
        }
        
        int[] answer = new int[stack.size()];
        for (int i = 0 ; i <stack.size(); i ++){
            answer[i] = stack.get(i);
        }


        return answer;
    }
}