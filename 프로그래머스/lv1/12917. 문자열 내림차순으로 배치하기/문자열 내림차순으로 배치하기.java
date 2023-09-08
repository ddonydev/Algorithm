import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split("");

        List<Integer> list = new ArrayList<>();

        String answer = "";

        for (int i = 0; i < str.length; i++) {
            list.add((int)str[i].charAt(0));
        }

        Collections.sort(list, Collections.reverseOrder());


        for (int i = 0; i < list.size(); i++) {
            answer += (char)(int)list.get(i);
        }
        return answer;
    }
}