import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        for (int i = 0; i < cards1.length; i++) {
            queue1.offer(cards1[i]);
        }

        for (int i = 0; i < cards2.length; i++) {
            queue2.offer(cards2[i]);
        }

        String answer = "";
        int cnt = 0;
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(queue1.peek())) {
                queue1.remove();
                cnt += 1;
            }else if(goal[i].equals(queue2.peek())){
                queue2.remove();
                cnt += 1;
            }else{
                answer = "No";
                break;
            }
        }

        if (cnt == goal.length) {
            answer = "Yes";
        }
        return answer;
    }
}