import java.util.*;
class Solution {
    private static boolean[] visited;
    private static int answer;
    public int solution(int k, int[][] dungeons) {
        Arrays.sort(dungeons, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });

        visited = new boolean[dungeons.length];

        backTracking(0, k, dungeons);
        return answer;
    }
    static void backTracking(int cnt, int k, int[][] dungeons) {
        answer = Math.max(answer, cnt);
        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] <= k && !visited[i]) {
                visited[i] = true;
                backTracking(cnt + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
    }
}