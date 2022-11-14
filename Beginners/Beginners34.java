package Beginners;

import java.util.Arrays;

public class Beginners34 {

    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
            return answer;
        }
    }

}
