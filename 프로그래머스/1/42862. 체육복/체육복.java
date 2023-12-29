import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);


        int cnt = 0;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = 0;
                    reserve[j] = 0;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] != 0 && reserve[j] != 0) {
                    if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                        lost[i] = 0;
                        reserve[j] = 0;
                        cnt++;
                    }
                }
            }
        }
        
        return n - (lost.length - cnt);
    }
}