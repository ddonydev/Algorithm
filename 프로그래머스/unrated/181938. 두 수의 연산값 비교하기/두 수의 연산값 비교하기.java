class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int x = Integer.parseInt((Integer.toString(a) + Integer.toString(b)));
        int y = 2 * a * b;
        
        if(x > y){
            answer = x;
        }else{
            answer = y;
        }
        
        if(x == y){
            answer = x;
        }
        
        return answer;
    }
}