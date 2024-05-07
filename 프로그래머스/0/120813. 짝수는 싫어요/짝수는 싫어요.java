class Solution {
    public int[] solution(int n) {
        int len = n / 2;
        if(n % 2 != 0){
            len += 1;
        }
       int[] answer = new int[len];
        
        int index = 0;
        for(int i = 1; i <= n; i += 2){
            answer[index++] = i;
        }
        
    
        return answer;
    }
}