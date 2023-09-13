class Solution {
    public long solution(int price, int money, int count) {
        long current = 0;
        for (int i = 1; i <= count; i++) {
            current += (price * i);
        }

        long answer = -1;
        if(current <= money) {
            answer = 0;
        }else{
            answer = Math.abs(current - money);
        }

        return answer;
    }
}