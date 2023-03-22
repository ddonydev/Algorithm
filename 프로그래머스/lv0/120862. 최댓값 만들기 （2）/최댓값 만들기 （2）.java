class Solution {
    public int solution(int[] numbers) {
        int n = 0;
        int answer = -100000001;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    n = numbers[i] * numbers[j];
                    if (n > answer) {
                        answer = n;
                    }
                }
            }
        }
        return answer;
    }
}