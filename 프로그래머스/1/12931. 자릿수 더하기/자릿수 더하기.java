public class Solution {
    public int solution(int n) {
        int answer = 0;

        String tmp = Integer.toString(n);
        for(int i = 0; i < tmp.length(); i++){
            answer += tmp.charAt(i) - '0';
        }

        return answer;
    }
}