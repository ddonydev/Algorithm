class Solution {
    public long solution(int n) {
        
        int[] d = new int[2001];

        d[0] = 0;
        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % 1234567;
        }
        return d[n];
    }
}