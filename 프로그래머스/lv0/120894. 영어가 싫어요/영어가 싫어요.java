import java.util.*;
class Solution {
    public long solution(String numbers) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i], i + "");
        }

        String[] numbersArr = numbers.split("");

        String tmp = "";
        String result = "";
        for (int i = 0; i < numbersArr.length; i++) {
            tmp += numbersArr[i];
            for (int j = 0; j < str.length; j++) {
                if (tmp.equals(str[j])) {
                    result += map.get(tmp);
                    tmp = "";
                }
            }
        }

        long answer = Long.parseLong(result);
        return answer;
    }
}