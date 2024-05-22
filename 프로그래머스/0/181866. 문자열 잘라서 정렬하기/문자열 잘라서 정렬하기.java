import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        Arrays.sort(str);

        return Arrays.stream(str).filter(s -> s.length() > 0).toArray(String[]::new);
        
    }
}