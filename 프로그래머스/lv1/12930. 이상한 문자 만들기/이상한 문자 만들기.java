class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");

        String answer = "";
        for (int i = 0; i < str.length; i++) {
            String[] tmp = str[i].split("");
            for (int j = 0; j < tmp.length; j++) {
                if (j % 2 == 0) {
                    tmp[j] = tmp[j].toUpperCase();
                }else{
                    tmp[j] = tmp[j].toLowerCase();
                }
                answer += tmp[j];
            }
            if (i != str.length - 1) {
                answer += " ";
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.length() != answer.length()) {
                answer += " ";
            }
        }
        return answer;
    }
}