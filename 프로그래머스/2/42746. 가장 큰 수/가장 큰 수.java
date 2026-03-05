import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] strNums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        
        Arrays.sort(strNums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        
        if (strNums[0].equals("0")) return "0";

        
        StringBuilder answer = new StringBuilder();
        for (String s : strNums) answer.append(s);

        return answer.toString();
    }
}