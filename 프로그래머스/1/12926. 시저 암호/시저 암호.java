class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            int sum = s.charAt(i) + n;
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90 && sum > 90) {
                int sub = sum - 26;
                answer += (char) sub;
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122 && sum > 122) {
                int sub = sum - 26;
                answer += (char) sub;
            } else if (s.charAt(i) == 32) {
                answer += " ";
            }else{
                answer += (char) sum;
            }

        }
        return answer;
    }
}