import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Stack<String> stack = new Stack<>();
        int cnt = 1;

        stack.push(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (i % n == 0) {
                cnt++;
            }
            if(words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)){
                if (stack.contains(words[i])) {
                    answer[0] = ((i + n) % n) + 1;
                    answer[1] = cnt;
                    return answer;
                }
                stack.push(words[i]);
            }else{
                answer[0] = ((i + n) % n) + 1;
                answer[1] = cnt;
                return answer;
            }
        }
        answer[0] = 0;
        answer[1] = 0;

        return answer;
    }
}