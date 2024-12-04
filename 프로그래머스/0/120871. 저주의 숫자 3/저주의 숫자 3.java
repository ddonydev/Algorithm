class Solution {
    public int solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(cnt);

            while (str.contains("3") || cnt % 3 == 0) {
                cnt++;
                str = String.valueOf(cnt);
            }
            cnt++;
        }
        return cnt - 1;
    }
}