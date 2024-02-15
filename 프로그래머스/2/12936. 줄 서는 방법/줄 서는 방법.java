import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        long factorial = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
            factorial *= i;
        }

        k--;
        int index = 0;
        while(n > 0) {
            factorial /= n;
            int value = (int) (k / factorial);
            answer[index++] = list.get(value);
            list.remove(value);

            k %= factorial;
            n--;
        }
        return answer;
    }
}