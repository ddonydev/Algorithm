import java.util.*;
class Solution {
    public int solution(int[] order) {
        Stack<Integer> subContainer = new Stack<>();

        int i = 0;
        int box = 1;
        int answer = 0;
        while (i < order.length) {
            if (order[i] == box) {
                answer++;
                i++;
                box++;
            } else if (order[i] > box) {
                subContainer.push(box);
                box++;
            }else{
                while (!subContainer.isEmpty() && order[i] == subContainer.peek()) {
                    subContainer.pop();
                    answer++;
                    i++;
                }
                if (i >= order.length || order[i] < box) {
                    break;
                }
            }
        }
        return answer;
    }
}