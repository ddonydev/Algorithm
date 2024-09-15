class Solution {
    public int solution(int n) {
        int pizza = 0;
        
        while(true){
            pizza++;
            if((6 * pizza) % n == 0){
                return pizza;   
            }
        }
    }
}