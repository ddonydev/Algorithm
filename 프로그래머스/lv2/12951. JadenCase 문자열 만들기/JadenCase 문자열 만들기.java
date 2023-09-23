class Solution {
    public String solution(String s) {
       s = s.toLowerCase();

        String[] str = s.split("");

        String answer = "";

        if (str[0].matches("^[a-zA-Z]*$")) {
            str[0] = str[0].toUpperCase();
        }

        for (int i = 1; i < str.length; i++) {
            if(i >= 1 && str[i - 1].equals(" ")){
                str[i] = str[i].toUpperCase();
            }

        }

        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }

        
        return answer;
    }
}