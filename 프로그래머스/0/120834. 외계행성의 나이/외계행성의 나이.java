class Solution {
    public String solution(int age) {
        String answer = "";
        String x = String.valueOf(age);
        String[] tmp = x.split("");

        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < tmp.length; i++) {
            answer += str[Integer.parseInt(tmp[i])];
        }
        return answer;
    }
}