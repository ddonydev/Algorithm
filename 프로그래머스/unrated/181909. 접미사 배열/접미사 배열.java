import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split("");
        String[] answer = new String[str.length];

        for(int i = 0; i < str.length; i++){
            String tmp = "";
            for(int j = i; j < str.length; j++){
               tmp += str[j];
            }
            answer[i] = tmp;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}