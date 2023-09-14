import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] str = my_string.split("");
        String[] abc = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"
                ,"O","P","Q","R","S","T","U","V","W","X","Y","Z", "a","b","c","d","e","f","g","h","i","j","k","l","m","n"
                ,"o","p","q","r","s","t","u","v","w","x","y","z"};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < abc.length; i++) {
            map.put(abc[i], 0);
        }

        for (int i = 0; i < abc.length; i++) {
            int cnt = 0;
            for (int j = 0; j < str.length; j++) {
                if(abc[i].equals(str[j])){
                    cnt++;
                }
            }
            map.put(abc[i], cnt);
        }

        int[] answer = new int[map.size()];
        for (int i = 0; i < map.size(); i++) {
            answer[i] = map.get(abc[i]);
        }
        return answer;
    }
}