class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int x = 0;
        int y = 0;
    
        
        for(int i = 0; i < sides.length; i++){
            if(sides[x] < sides[i]){
                x = i;
            }
        }
         for(int i = 0; i < sides.length; i++){
            if(i != x){
                 y += sides[i];
            }
         }
        
        if(sides[x] < y){
            answer = 1;
        }else{
            answer = 2;
        }
            
        
        return answer;
    }
}