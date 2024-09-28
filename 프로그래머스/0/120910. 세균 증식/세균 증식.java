class Solution {
    public int solution(int n, int t) {
        int answer = 0;

        for(int i = 0; i < t + 1; i++){
           answer = n * (int) Math.pow(2, i);
        }
        
        return answer;
    }
}