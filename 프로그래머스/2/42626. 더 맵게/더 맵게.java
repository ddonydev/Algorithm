import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> lowList = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            lowList.add(scoville[i]);
        }

        int answer = 0;
        while (lowList.peek() < K) {
            if (lowList.size() < 2) {
                return -1;
            }else{
                answer++;
                lowList.add(lowList.poll() + (lowList.poll() * 2));
            }
        }
        return answer;
    }
}