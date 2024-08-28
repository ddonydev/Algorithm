class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 0;
        
        while(true){
            pizza++;
            if((6 * pizza) % n == 0){
                return pizza;   
            }

        }
        
    }
}