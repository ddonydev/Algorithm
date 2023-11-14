class Solution
{
    public int solution(int n, int a, int b)
    {
        int A = a / 2 + a % 2;
        int B = b / 2 + b % 2;
        int cnt = 1;

        while (A != B) {
            A = A / 2 + A % 2;
            B = B / 2 + B % 2;
            cnt += 1;
        }

        return cnt;
    }
}