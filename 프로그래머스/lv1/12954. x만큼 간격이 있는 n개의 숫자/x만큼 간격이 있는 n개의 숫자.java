class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long tmp = 0;
        for (int i = 0; i < answer.length; i++) {
            tmp += x;
            answer[i] = tmp;
        }
        return answer;
    }
}