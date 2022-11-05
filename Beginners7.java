public class Beginners7 {

    class Solution {
        public int solution(int age) {
            int answer = 0;

            // 현재 년도에서 나이를 빼고 +1을 해주어야 출생년도가 나옴
            answer = (2022 - age) + 1;

            return answer;
        }
    }

}
