class Solution {
    public long solution(int price, int money, int count) {
        long current = 0;
        for (int i = 1; i <= count; i++) {
            current += (price * i);
        }

        if(current <= money) {
            return 0;
        }else{
            return Math.abs(current - money);
        }
    }
}