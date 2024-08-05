class Solution {
    public long solution(int price, int money, int count) {
        long current = 0;
        for (int i = 1; i <= count; i++) {
            current += (price * i);
        }

        return current <= money ? 0 : Math.abs(current - money);
    }
}