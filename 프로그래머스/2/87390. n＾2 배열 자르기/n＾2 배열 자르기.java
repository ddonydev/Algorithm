import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];

        ArrayList<Long> list = new ArrayList<>();
        for (long i = left; i <= right; i++) {
            list.add(Math.max(i / n, i % n) + 1);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.toIntExact(list.get(i));
        }
        
        return answer;
    }
}