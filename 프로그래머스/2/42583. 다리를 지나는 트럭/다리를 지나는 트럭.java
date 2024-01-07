import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++){
            queue.add(0);
        }
        int i = 0;
        int endTruckCnt = 0;
        while(endTruckCnt < truck_weights.length || i < truck_weights.length){
            boolean isTruck = queue.poll() > 0;
            
            if (isTruck) {
                endTruckCnt++;
            }
            
            int sum = 0;
            for (int w : queue) {
                sum += w;
            }
            if (i < truck_weights.length) {
                if (sum + truck_weights[i] > weight) {
                    queue.add(0);
                } else {
                    queue.add(truck_weights[i]);
                    i++;
                }   
            } else {
                queue.add(0);
            }
            answer++;
        }
        
        return answer;
    }
}