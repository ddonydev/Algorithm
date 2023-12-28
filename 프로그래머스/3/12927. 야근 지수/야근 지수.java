import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        int sum = 0;
        for(int i = 0; i < works.length; i++){
            queue.add(works[i]);
            sum += works[i];
        }
        
        if(sum < n){
            return 0;
        }
        
        while(n > 0){
            int num = queue.poll();
            if(num == 0){
                break;
            }
            num -= 1;
            queue.add(num);
            n -= 1;
        }
        
        long answer = 0;
        for(int number : queue){
            answer += number * number;
        }
        
        return answer;
    }
}