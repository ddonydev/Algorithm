import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return sb.append(c).reverse().toString();
    }
}