package Level01;

public class level01_02 {

    class Solution {
        public String solution(int num) {
            String answer = "";

            if(num%2 == 0){
                answer = "Even";
            }else{
                answer = "Odd";
            }

            return answer;
        }
    }

}
