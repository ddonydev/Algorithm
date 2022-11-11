public class Beginners32 {

    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            for(int i = 0; i < my_string.length(); i++){    // 문자열의 길이만큼 반복 하면서
                for(int j = 0; j < n; j++){                 // 반복할 횟수를 돌면서
                    answer += my_string.charAt(i);          // 반복한 횟수 만큼 문자를 반복하여 answer에 저장해준다
                }
            }

            return answer;
        }
    }

}
