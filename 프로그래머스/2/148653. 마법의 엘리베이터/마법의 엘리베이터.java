import java.util.stream.Stream;
class Solution {
    public int solution(int storey) {
        String str = String.valueOf(storey);
        int[] num = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] > 5) {
                answer += (10 - num[i]);
                if (i == 0) {
                    answer += 1;
                }else{
                    num[i - 1]++;
                }
            } else if (num[i] == 5 && i > 0 && num[i - 1] >= 5) {
                num[i - 1]++;
                answer += 5;
            } else {
                answer += num[i];
            }
        }
        return answer;
    }
}