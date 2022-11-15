package Beginners;

public class level0_15 {

    class Solution {
        public int[] solution(int n) {
            int[] answer = {};
            int x = 0;

            if(n%2 == 0){
                answer = new int[n/2];  // n이 짝수일때
            } else {
                answer = new int[n/2+1];    // n이 홀수일때
            }

            for(int i = 0; i <= n; i++){
                if(i%2 == 1){
                    answer[x] = i;
                    x++;
                }

            }

            return answer;
        }
    }

}
