class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String s1 = "" + a + b;
        String s2 = "" + b + a;
        
        if(Integer.parseInt(s1) > Integer.parseInt(s2)){
            answer = Integer.parseInt(s1);
        }else{
            answer = Integer.parseInt(s2);
        }
        
        return answer;
    }
}