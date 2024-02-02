import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparing((int[] o) -> o[1]));

        int cam = Integer.MIN_VALUE;
        int answer = 0;
        for (int i = 0; i < routes.length; i++) {
            if(cam < routes[i][0]) {
                cam = routes[i][1];
                answer++;
            }
        }
        return answer;
    }
}