import java.util.*;
class Solution {
    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        Map<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < num.length; i++) {
            map.put(num[i], String.valueOf(i));
        }

        String str = "";
        String tmp = s;

        for (int i = 0; i < tmp.length(); i++) {
            if (Character.isDigit(tmp.charAt(i))) {
                continue;
            }
            str += tmp.charAt(i);
            if (map.containsKey(str)) {
                s = s.replace(str, map.get(str));
                str = "";
            }
        }

        return Integer.parseInt(s);
    }
}