public class Beginners27 {

    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            int x = numbers[2]; // numbers의 최소 길이가 2이기 때문에 2로 초기화
            int y = numbers[2];

            for(int i = 0; i < numbers.length; i++){            // numbers의 길이 까지 돌면서
                if(x < numbers[i]){                             // 만약 numbers[i]번째 보다 x가 작으면
                    y = x;                                      //
                    x = numbers[i];                             // x에 numbers[i]를 넣어준다
                }else if(y < numbers[i] && x != numbers[i])     // 만약 numbers[i]번째가 y보다 작고, numbers[i]는 x가 아니면
                    y = numbers[i];                             // y에 numbers[i]를 넣어준다
                answer = x * y;
            }

            return answer;
        }

    }







}
