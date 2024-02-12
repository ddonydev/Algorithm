class Solution {
    public int solution(int x, int y, int n) {
        int[] answer = new int[y + 1];

        for (int i = x; i < y + 1; i++) {
            if (i != x && answer[i] == 0) {
                answer[i] = -1;
                continue;
            }

            if (i * 2 <= y) {
                answer[i * 2] = (answer[i * 2] == 0) ? 
                    answer[i] + 1 : Math.min(answer[i] + 1, answer[i * 2]);
            }
            if(i * 3 <= y){
                answer[i * 3] = (answer[i *3 ] == 0) ? 
                    answer[i] + 1 : Math.min(answer[i] + 1, answer[i * 3]);
            }

            if(i + n <= y){
                answer[i + n] = (answer[i + n] == 0) ? 
                    answer[i] + 1 : Math.min(answer[i] + 1, answer[i + n]);
            }
        }
        return answer[y];
    }
}