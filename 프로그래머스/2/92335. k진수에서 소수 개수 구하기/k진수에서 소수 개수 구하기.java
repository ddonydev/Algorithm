class Solution {
    public int solution(int n, int k) {
        String notation = Integer.toString(n, k);
        String[] str = notation.split("0");

        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].isEmpty()) {
                continue;
            }
            if (is_prime(str[i])) {
                answer++;
            }
        }
        return answer;
    }
    boolean is_prime(String num) {
        long n = Long.parseLong(num);
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}