class Solution {
    public int solution(int a, int b, int n) {
        int empty = 0;

        while (n >= a) {
            n -= a - b;
            empty += b;
        }
        return empty;
    }
}