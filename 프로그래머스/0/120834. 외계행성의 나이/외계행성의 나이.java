import java.util.*;
class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);

        HashMap<Integer, Character> map = new HashMap<>();
        int num = 0;
        for(int i = 97; i < 123; i++){
            map.put(num++, (char) i);
        }

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            answer += map.get(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        return answer;
    }
}