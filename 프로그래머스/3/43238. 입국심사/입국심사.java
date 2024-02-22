import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        
        long max = (long) times[times.length - 1] * n;
        long answer = max;
        long mid = 0;
        long sum = 0;
        long min = 1;

        while (min <= max) {
            sum = 0;
            mid = (max + min) / 2;

            for (int time : times) {
                sum += mid / time;
            }

            if (sum >= n) {
                answer = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return answer;
    }
}