package Beginners;

public class level0_27 {

    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            int x = numbers[2]; // numbers의 최소 길이가 2이기 때문에 2로 초기화
            int y = numbers[2];

            for(int i = 0; i < numbers.length; i++){            // numbers의 길이 까지 돌면서
                if(x < numbers[i]){                             // 만약 numbers[i]번째 보다 x가 작으면
                    y = x;                                      // 두번째로 큰 수를 x가 가지고 있었기 때문에 y에 넣어줌
                    x = numbers[i];                             // x에 numbers[i]를 넣어준다
                }else if(y < numbers[i] && x != numbers[i])     // 만약 numbers[i]번째가 y보다 작고, numbers[i]는 x가 아니면
                    y = numbers[i];                             // y에 numbers[i]를 넣어준다
                answer = x * y;
            }

            return answer;
        }

    }

/*
y = x;
배열 [1, 4, 5] 일때
x가 4 였다가 5가 나오면
x엔 5가 들어가고 y엔 x에 있던 4가 들어간다
왜냐하면 가장 큰 수가 나오기 전에 있던 x의 값이 두번째로 큰 수 이기 때문
 */





}
