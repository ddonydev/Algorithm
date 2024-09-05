import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        sb.append(c);
        sb.reverse();
        return sb.toString();
    }
}