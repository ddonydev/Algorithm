package Level0;

public class level0_38 {

    class Solution {
        public String solution(String my_string) {

            String answer = my_string.replaceAll("[aeiou]", "");    //replaceAll 문자 제거 함수

            return answer;
        }
    }

}
