import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 65; i < 123; i++) {
            if(i > 90 && i < 97){
                continue;
            }
            map.put((char)i, 0);
        }

        for(int i = 0; i < my_string.length(); i++){
            map.put(my_string.charAt(i), map.get(my_string.charAt(i)) + 1);
        }

        int[] answer = new int[map.size()];
        int index = 0;
        for(Character key : map.keySet()){
            answer[index++] = map.get(key);
        }
        return answer;
    }
}