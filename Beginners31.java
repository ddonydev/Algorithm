public class Beginners31 {

    class Solution {
        public String solution(String my_string, String letter) {


            my_string = my_string.replaceAll(letter, "");   //replaceAll(정규식 or 기존문자, 바꿀문자)

            return my_string;
        }
    }

}
