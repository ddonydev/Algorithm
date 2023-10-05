import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            String tmp = "";
            String[] str = picture[i].split("");
            for (int j = 0; j < str.length; j++) {
                String s = str[j];
                for (int l = 1; l < k; l++) {
                    s += str[j];
                }
                tmp += s;
            }
            for (int j = 0; j < k; j++) {
                list.add(tmp);
            }
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}