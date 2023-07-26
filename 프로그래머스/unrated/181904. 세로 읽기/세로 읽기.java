class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] tmp = my_string.split("");
        
        for (int i = c-1; i < tmp.length; i += m) {
            answer += tmp[i];
        }
        
        return answer;
    }
}