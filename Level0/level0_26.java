package Level0;

public class level0_26 {

    class Solution {
        public int[] solution(int money) {

            int price = 5500;
            int coffee = money / price;
            int changes = money % price;

            int[] answer = {coffee, changes};

            return answer;
        }
    }

}
