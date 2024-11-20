import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        Double[] tmp = new Double[score.length];

        for (int i = 0; i < score.length; i++) {
            tmp[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        Arrays.sort(tmp, Collections.reverseOrder());
        HashMap<Double, Integer> map = new HashMap<>();

        for (int i = 0; i < tmp.length; i++) {
            if (!map.containsKey(tmp[i])) {
                map.put(tmp[i], i + 1);
            }
        }

        int[] answer = new int[score.length];

        for (int i = 0; i < tmp.length; i++) {
            answer[i] = map.get((score[i][0] + score[i][1]) / 2.0);
        }
        return answer;
    }
}