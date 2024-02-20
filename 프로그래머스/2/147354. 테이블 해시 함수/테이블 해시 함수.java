import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, ((o1, o2) -> o1[col - 1] == o2[col - 1] ? 
                           o2[0] - o1[0] : o1[col - 1] - o2[col - 1]));

        int answer = 0;
        for (int i = row_begin - 1; i < row_end; i++) {
            int S_1 = 0;
            for (int j = 0; j < data[0].length; j++) {
                S_1 += data[i][j] % (i + 1);
            }
            answer = (answer ^ S_1);
        }
        return answer;
    }
}