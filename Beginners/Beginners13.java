package Beginners;

public class Beginners13 {

    class Solution {
        public int[] solution(int denum1, int num1, int denum2, int num2) {

            int top = (denum1 * num2) + (denum2 * num1);    // 분자
            int bottom = num1 * num2;                       // 분모

            int max = 0;    // 최대 공약수
            for(int i = 1; i <= top; i++){
                if(top%i == 0 && bottom%i == 0){
                    max = i;    // 분자와 분모의 최대공약수 구하기
                }
            }

            int[] answer = {top/max, bottom/max};   // 분자와 분모를 최대공약수로 나누어주기


            return answer;
        }
    }
}
