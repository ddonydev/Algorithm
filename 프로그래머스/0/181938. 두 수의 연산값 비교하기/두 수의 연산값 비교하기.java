class Solution {
    public int solution(int a, int b) {
        int x = Integer.parseInt((Integer.toString(a) + Integer.toString(b)));
        int y = 2 * a * b;
        
        if(x > y || x == y){
            return x;
        }else{
            return y;
        }
        
    }
}