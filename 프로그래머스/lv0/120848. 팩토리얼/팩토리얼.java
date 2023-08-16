class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 1;
        int i = 1;
        while(tmp <= n){
            tmp *= i;
            i++;
        }
        
        return i - 2;
    }
}