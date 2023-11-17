class Solution {
    public int solution(int a, int b, int n) {
        int empty = 0;

        while (n > 1 && n >= a) {
            if (n % a == 0) {
                n = (n / a) * b;
                empty += n;
            }else{
                int tmp = n % a;
                n = (n / a) * b;
                empty += n;
                n += tmp;
            }
        }
        return empty;
    }
}