package Beginners;

public class level0_10 {

    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;

            for(int i : numbers){
                answer += i;
            }

            return answer/numbers.length;
        }
    }

}
