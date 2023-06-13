class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int i : numbers){
            if(answer <= n){
                answer += i;
            }else{
                return answer;
            }
        }
        
        return answer;
    }
}