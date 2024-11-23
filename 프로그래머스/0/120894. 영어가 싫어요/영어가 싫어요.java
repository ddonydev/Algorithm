import java.util.*;
class Solution {
    public long solution(String numbers) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i], i + "");
        }

        String tmp = "";
        String result = "";
        for (int i = 0; i < numbers.length(); i++) {
            tmp += numbers.charAt(i);
            if(map.containsKey(tmp)){
                result += map.get(tmp);
                tmp = "";
            }
        }
        return Long.parseLong(result);
    }
}