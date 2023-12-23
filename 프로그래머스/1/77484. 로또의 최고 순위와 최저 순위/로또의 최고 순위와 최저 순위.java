import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int zero = 0;
        int cnt = 0;
        for(int i = 0; i < lottos.length; i++){
            if (lottos[i] == 0) {
                zero++;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (win_nums[j] == lottos[i]) {
                    cnt++;
                }
            }
        }

        if (zero == 0 && cnt == 0) {
            answer[0] = 6;
            answer[1] = 6;
        } else if (zero == 0 && cnt == 6) {
            answer[0] = 1;
            answer[1] = 1;
        } else if (zero == 6 && cnt == 0) {
            answer[0] = 1;
            answer[1] = 6;
        } else {
            answer[0] = 7 - (zero + cnt);
            answer[1] = 7- cnt;
        }
        
        
        return answer;
    }
}