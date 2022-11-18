package Level0;

public class level0_36 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            int sqrt = (int)Math.sqrt(n);   // sqrt는 제곱근을 구해주는 함수(double타입이다)

            if(n % sqrt == 0){              //  n의 제곱근을 나누어주었을때 딱 떨어지면 true
                answer = 1;
            }else{
                answer = 2;
            }

            return answer;
        }
    }

}
