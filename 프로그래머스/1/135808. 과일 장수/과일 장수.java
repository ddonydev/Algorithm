import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        PriorityQueue<Integer> scoreQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            scoreQueue.add(score[i]);
        }

        int answer = 0;
        while (!scoreQueue.isEmpty()) {
            if (scoreQueue.size() >= m) {
                int min = 999999;
                for (int i = 0; i < m; i++) {
                    if (scoreQueue.peek() <= k) {
                        min = scoreQueue.poll();
                    }
                }
                answer += min * m;
            }else{
                break;
            }
        }
        return answer;
    }
}