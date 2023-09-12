class Solution {
    public int[] solution(int n, int m) {
        int len = 0;

        if(n > m){
            len = n;
        }else{
            len = m;
        }

        int gcd = 0;
        for (int i = 1; i <= len; i++) {
            if(n % i == 0 && m % i == 0){
                if(i > gcd){
                    gcd = i;
                }
            }
        }
        
        int lcm = (n * m) / gcd;

        int[] answer = {gcd, lcm};
        return answer;
    }
}