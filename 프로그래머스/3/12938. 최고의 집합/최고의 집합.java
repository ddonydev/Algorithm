class Solution {
    public int[] solution(int n, int s) {
        int[] answer;
        
        if(n > s){
            answer = new int[]{-1};
            return answer;
        }
        
        int x = s / n;
        int y = s % n;
        
        answer = new int[n];
        for(int i = 0; i < answer.length; i++){
            answer[i] = x;
        }
        
        int idx = n - 1;
        for(int i = 0; i < y; i++) {
            answer[idx]++;
            idx--;
        }
        return answer;
    }
}