import java.util.*;
class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("+", num1 + num2);
        map.put("-", num1 - num2);
        map.put("*", num1 * num2);
        
        return map.get(str[1]);
    }
}