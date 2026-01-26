import java.util.*;

class Solution {
    boolean solution(String s) {
        

        Deque<Character> de = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i); 

        if (c == '(') {
            de.push(c);
        } else {
            
            if (de.isEmpty()){
                return false;
            }
            de.pop();
        }
    }
    
    return de.isEmpty();
        

    }
}