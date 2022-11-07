public class Beginners13 {

    class Solution {
        public int[] solution(int denum1, int num1, int denum2, int num2) {

            int top = (denum1 * num2) + (denum2 * num1);
            int bottom = num1 * num2;

            int max = 0;
            for(int i = 1; i <= top; i++){
                if(top%i == 0 && bottom%i == 0){
                    max = i;
                }
            }

            int[] answer = {top/max, bottom/max};


            return answer;
        }
    }
}
