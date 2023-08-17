class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);

        long x = sqrt * sqrt;

        long answer = 0;
        if(x == n){
            sqrt = sqrt + 1;
            answer = sqrt * sqrt;
        }else{
            answer = -1;
        }
        return answer;
    }
}